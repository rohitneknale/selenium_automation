package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("7709220763");
		driver.findElement(By.id("pass")).sendKeys("shivshakti");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("a[aria-label='Not Now']")).click();
		
		driver.findElement(By.cssSelector("div[aria-label='Messenger']")).click();
		driver.findElement(By.cssSelector("input[aria-label='Search Messenger']")).sendKeys("nagesh bhosale");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Nagesh Bhosale']")).click();
		driver.findElement(By.xpath("//p[@class='kvgmc6g5 oygrvhab']")).sendKeys("hii...by automation");
		driver.findElement(By.cssSelector("div[aria-label='Press Enter to send']")).click();
		
		driver.close();
	}

}
