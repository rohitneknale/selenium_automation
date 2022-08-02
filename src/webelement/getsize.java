package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		Dimension s =searchtb.getSize();
		int h= s.getHeight();
		System.out.println("height of the element is"+h);
		int w= s.getWidth();
		System.out.println("width of the element is"+w);
		
		driver.close();
		
	}

}
