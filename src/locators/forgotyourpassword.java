package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotyourpassword {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.name("forgetPasswordEmailOrUsername")).sendKeys("12345677889");
		driver.findElement(By.id("forgetPasswordButton")).click();
		
	}

}
