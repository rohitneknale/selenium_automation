package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationc {
	@Test(priority=-1, invocationCount= 4)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(priority=-1, invocationCount=2)
	public void settings() {
		Reporter.log("settings",true);
	}
	@Test
	public void  chats() {
		Reporter.log("chats",true);
	}
}
