package adapters;

import java.rmi.RemoteException;


import entities.Customer;
import interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			result =  kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(),customer.getBirthYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
	
		}
		
		return result;
		
	}

}
