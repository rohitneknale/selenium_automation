package scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonscroll {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//img[@class='landscape-image']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y=loc.getY();
		
		//typecasting
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("windows.scrollBy("+x+"."+y+")");
		
		
		Thread.sleep(10);
		ele.click();
		
		driver.close();
	}

}
