import abstracts.CampaignService;
import abstracts.GameService;
import abstracts.GamerService;
import abstracts.SaleService;
import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.SaleManager;
import entity.Campaign;
import entity.Game;
import entity.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Ahmet");
		gamer.setLastName("Mehmet");
		gamer.setBirthYear(1852);
		gamer.setNationaltyId("00000000000");
		
		Game game = new Game();
		game.setId(1);
		game.setName("HOI4");
		game.setPrice(60);
		
		Campaign campaign = new Campaign("Spring Sale", 25);
		
		
		GamerService gamerService = new GamerManager(new MernisServiceAdapter()); //if you type correct information it works
		gamerService.addEnrollment(gamer);
		
		System.out.println("<------------------------------------->");
		
		
		GameService gameService = new GameManager();
		gameService.add(game);
		
		System.out.println("<------------------------------------->");
		
		SaleService saleService = new SaleManager();
		saleService.sale(game, gamer);
		
		System.out.println("<------------------------------------->");
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(campaign);
		
		System.out.println("<------------------------------------->");
		
		saleService.campaignSale(game, gamer, campaign);
		
		
		
	}

}
