package multiwindopop;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("(//a[@class='ignorelink'])[11]")).click();
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		
		
		for(String b:child) {
			driver.switchTo().window(b);
		}
		driver.findElement(By.id("mytext")).sendKeys("rohit");
		driver.findElement(By.xpath("//input[@class='subtnn']")).click();
		
		driver.quit();
		
	}

}
