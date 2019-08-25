package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how = How.CLASS_NAME,using="login")
	private WebElement lnk_SignIn;
	
	
	
	
	
	public void clickOnSignin()
	{
		lnk_SignIn.click();
	}
	
	
	
	
	
	
	
	

}
