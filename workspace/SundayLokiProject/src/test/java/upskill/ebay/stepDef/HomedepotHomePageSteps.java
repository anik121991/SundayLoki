package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.HomedepotHomePageActions;

public class HomedepotHomePageSteps {

	HomedepotHomePageActions HomedepotHomePageActionsObj = new HomedepotHomePageActions();
	@Given("^Open Homedepot Homepage$")
	public void open_Homedepot_Homepage() throws Throwable {
	//wait
	}

	@When("^Search for Sands$")
	public void search_for_Sands() throws Throwable {
		HomedepotHomePageActionsObj.searchSands();
	}
	
	@When("^Search for Cements$")
	public void search_for_Cements() throws Throwable {
		HomedepotHomePageActionsObj.searchCements();
	}
	@When("^Search for Bricks$")
	public void search_for_Bricks() throws Throwable {
		HomedepotHomePageActionsObj.searchBricks();
	}
	
}
