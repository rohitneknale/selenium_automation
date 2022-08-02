package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test0 {
	
	@Test
	public void demo() {
		Reporter.log("Namaste",true);
		Reporter.log("Pranam",false);
	}

}
