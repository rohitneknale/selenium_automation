package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/accounts/login/");
		
driver.findElement(By.name("username")).sendKeys("rohitneknale");
driver.findElement(By.id("password")).sendKeys("parvati1");
	}

}
