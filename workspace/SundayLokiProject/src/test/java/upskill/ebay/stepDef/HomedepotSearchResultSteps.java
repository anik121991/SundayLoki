package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import upskill.ebay.pageAction.HomedepotSearchResultActions;

public class HomedepotSearchResultSteps {

	HomedepotSearchResultActions HomedepotSearchResultActionsObj = new HomedepotSearchResultActions();
	
	@Then("^Item list should have only Sands related products$")
	public void item_list_should_have_only_Sands_related_products() throws Throwable {
	   
		HomedepotSearchResultActionsObj.verifySandsItems();
		
	}
	@Then("^Item list should have only Cements related products$")
	public void item_list_should_have_only_Cements_related_products() throws Throwable {
		HomedepotSearchResultActionsObj.verifyCementsItems();
	}
	

    @Then("^Item list should have only Bricks related products$")
    public void item_list_should_have_only_Bricks_related_products() throws Throwable {
    	HomedepotSearchResultActionsObj.verifyBricksItems();
}
	
}
