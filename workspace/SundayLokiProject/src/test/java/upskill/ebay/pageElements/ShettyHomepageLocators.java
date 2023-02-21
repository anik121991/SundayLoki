package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShettyHomepageLocators {

	
	@FindBy(xpath="//input[@id='alertbtn']")
	public WebElement btnAlert;
	
	
	@FindBy(xpath="//input[@id='confirmbtn']]")
	public WebElement btnConfirm;
	
	
	//
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement btnHome;


	

	
}
