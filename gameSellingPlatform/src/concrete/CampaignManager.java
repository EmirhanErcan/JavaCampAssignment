package concrete;

import abstracts.CampaignService;
import entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign has been defined to the system: " + campaign.getDescription());		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign has been updated: " + campaign.getDescription());		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign has been deleted from the system: " + campaign.getDescription());		
		
	}

}
