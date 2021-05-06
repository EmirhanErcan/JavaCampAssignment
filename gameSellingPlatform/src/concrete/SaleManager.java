package concrete;

import abstracts.SaleService;
import entity.Campaign;
import entity.Game;
import entity.Gamer;

public class SaleManager implements SaleService{

	
	@Override
	public void sale(Game game, Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " purchased " + game.getName());
		
	}

	@Override
	public void campaignSale(Game game,Gamer gamer, Campaign campaign) {
		
		System.out.println("A '" + campaign.getDescription()+  "' campaign was applied to the " + game.getName() + " and purchased by " + gamer.getFirstName());
		
	}

	
	
	

}
