package concrete;

import abstracts.GamerCheckService;
import entity.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}
	

}
