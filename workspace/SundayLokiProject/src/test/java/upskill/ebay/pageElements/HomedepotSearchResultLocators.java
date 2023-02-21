package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotSearchResultLocators {

	
	    //Validate Sands Items
		@FindBy(xpath="//a[contains(text(),'Sands')]")
		public WebElement txtSands;
		
		//Validate Cements Items	
		@FindBy(xpath="//a[contains(text(),'Cements')]")
		public WebElement txtCements;
		
		
		//Validate Bricks Items
		@FindBy(xpath="//a[contains(text(),'Bricks')]")
		public WebElement txtBricks;
		
}
