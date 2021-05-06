package adapters;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;
import entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationaltyId()), gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getBirthYear());
		} 
		 catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return result;
	}

}
