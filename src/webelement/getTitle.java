package webelement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.equals("actiTIME - Login"))
		{
			System.out.println("Pass: Hoome page displayed");
		}
		else {
			System.out.println("Fail: Home page isnot displayed");
		}
		driver.close();
	}

}
