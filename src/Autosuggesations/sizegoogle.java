package Autosuggesations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizegoogle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("dress");
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		System.out.println(ele1.size());
		
		for(WebElement b:ele1) {
			System.out.println(b.getText());
			
			driver.close();
		}
	}

}
