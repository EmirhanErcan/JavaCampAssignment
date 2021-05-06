package abstracts;

import entity.Gamer;

public interface GamerService {
	
	void addEnrollment(Gamer gamer);
	void updateProfile(Gamer gamer);
	void deleteEnrollment(Gamer gamer);

}
