package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramX {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("7709220763");
		driver.findElement(By.name("password")).sendKeys("parvati1");
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
