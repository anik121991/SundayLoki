package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.HomedepotSearchResultLocators;
import upskill.utilities.SetupDrivers;

public class HomedepotSearchResultActions {

	HomedepotSearchResultLocators HomedepotSearchResultLocatorsObj;
	public HomedepotSearchResultActions(){
		HomedepotSearchResultLocatorsObj = new HomedepotSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, HomedepotSearchResultLocatorsObj);
	}
	
	
public void verifySandsItems(){
		
		//Option 1
		Assert.assertTrue(HomedepotSearchResultLocatorsObj.txtSands.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Sands", HomedepotSearchResultLocatorsObj.txtSands.getText());
		
		//Option 3
		HomedepotSearchResultLocatorsObj.txtSands.isDisplayed();
	}

public void verifyCementsItems(){
	 
	       //Option 1
			Assert.assertTrue(HomedepotSearchResultLocatorsObj.txtCements.isDisplayed());
			
			//Option 2
			Assert.assertEquals("Cements", HomedepotSearchResultLocatorsObj.txtCements.getText());
			
			//Option 3
			HomedepotSearchResultLocatorsObj.txtCements.isDisplayed();
		}
   public void verifyBricksItems(){
	 
    //Option 1
		Assert.assertTrue(HomedepotSearchResultLocatorsObj.txtBricks.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Bricks", HomedepotSearchResultLocatorsObj.txtBricks.getText());
		
		//Option 3
		HomedepotSearchResultLocatorsObj.txtBricks.isDisplayed();
}
}
