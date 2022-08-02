package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdown {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement dd = driver.findElement(By.id("month"));
		Select s= new Select(dd);
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		ArrayList a = new ArrayList<>();
		
		for(WebElement b:options) {
			String Text=b.getText();
			System.out.println(Text);
			a.add(Text);
		}
		
		Collections.sort(a);
		
		System.out.println("****after sorting******");
		
		for (Object c:a) {
			System.out.println(c);
		}
		driver.close();
		
	}

}
