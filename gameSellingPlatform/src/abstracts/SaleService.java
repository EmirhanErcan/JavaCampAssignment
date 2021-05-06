package abstracts;

import entity.Campaign;
import entity.Game;
import entity.Gamer;

public interface SaleService {
	
	void sale(Game game, Gamer gamer);
	void campaignSale(Game game, Gamer gamer, Campaign campaign);
	

}
