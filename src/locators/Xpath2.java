package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
			if (url1.equals("https://demo.actitime.com/login.do")) 
			{
				System.out.println("pass:home page is displayed");
			}
			else
			{
				System.out.println("Fail:home page is not displayed");
			}
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}
}
