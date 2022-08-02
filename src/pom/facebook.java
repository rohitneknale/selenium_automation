package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {

	
	@FindBy(id="email")
		private WebElement emailaddress;
	
	@FindBy(id="pass")
		private WebElement passwordtb;
	
	@FindBy(id="login")
		private WebElement loginbtn;
	
	public facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void emailaddresstb(String us) {
		emailaddress.sendKeys(us);
	}
	public void passwordtb(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	public void loginbtn() {
		loginbtn.click();
	}
}
