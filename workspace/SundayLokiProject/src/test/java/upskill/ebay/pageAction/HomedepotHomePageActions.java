package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.HomedepotHomePageLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotHomePageActions {

	HomedepotHomePageLocators HomedepotHomePageLocatorsObj;
	public HomedepotHomePageActions(){
		HomedepotHomePageLocatorsObj = new HomedepotHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, HomedepotHomePageLocatorsObj);
	}
	
	public void searchSands(){
		HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys("Sands");
		HomedepotHomePageLocatorsObj.btnSearch.click();
}
	
	public void searchCements(){
		HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys("Cements");
		HomedepotHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchBricks(){
		HomedepotHomePageLocatorsObj.txtbxSearch.sendKeys("Bricks");
		HomedepotHomePageLocatorsObj.btnSearch.click();
	}
	
}
