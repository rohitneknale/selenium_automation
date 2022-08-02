package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertpro {
		public WebDriver driver;
	@Test
	public void tc1() {
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		Reporter.log(title,true);
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(title, "dhfgkfj");
		
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);
		s.assertAll();
		
		
}
}
