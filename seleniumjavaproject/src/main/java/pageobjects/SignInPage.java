package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {
	
	@FindBy(how = How.ID, using = "SubmitCreate")
	private WebElement btn_CreateAccount;
	
	@FindBy(how=How.ID, using = "email_create")
	private WebElement txt_EmailAddress;
	
	
	public void EnterEmailAddress(String text)
	{
		txt_EmailAddress.sendKeys(text);
	}
	
	public void clickOnCreateAccount()
	{
		btn_CreateAccount.click();
	}
	
	

}
