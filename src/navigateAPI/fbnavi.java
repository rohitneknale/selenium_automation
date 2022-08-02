package navigateAPI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbnavi {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().back();
		Thread.sleep(7000);
		
		driver.navigate().forward();
		Thread.sleep(7000);
		
		driver.navigate().refresh();

		driver.close();
	}

}
