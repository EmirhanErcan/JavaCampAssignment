package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entity.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addEnrollment(Gamer gamer) {
		
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("New enrollment created: " + gamer.getFirstName());			
		} 
		
		else {
			System.out.println("Please check your information");
		}

	}

	@Override
	public void updateProfile(Gamer gamer) {

		System.out.println("Profile updated: " + gamer.getFirstName());

	}

	@Override
	public void deleteEnrollment(Gamer gamer) {

		System.out.println("User deleted from system: " + gamer.getFirstName());

	}

}
