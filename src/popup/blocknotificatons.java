package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class blocknotificatons {

	public static void main(String[] args) {
		
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments(".....disable_notifications....");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
