package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=1)
	public void calls() {
		Reporter.log("Calls",true);
		
	}
	
	@Test
	public void voice() {
		Reporter.log("voice",false);
		
	}
	
	@Test(priority=-1)
	public void audio() {
		Reporter.log("audio",true);
		
	}

}
