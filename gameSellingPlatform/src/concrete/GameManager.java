package concrete;

import abstracts.GameService;
import entity.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game added to the system: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted from the system: " + game.getName());
		
	}
	
	

}
