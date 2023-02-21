package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomedepotHomePageLocators {

	
	

	//Search Text Box
	@FindBy(xpath="//input[@id='headerSearch']")
	public WebElement txtbxSearch;
	
	
	//Search Button
	@FindBy(xpath="//body/div[@id='header']/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	public WebElement btnSearch;
}
