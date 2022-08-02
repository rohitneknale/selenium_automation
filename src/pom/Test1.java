package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	public Test1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void search(String name) {
		searchtb.sendKeys(name);
	}
	

}
