package testcases;

import wrapper.GenericWrapper;

public class CheckBox extends GenericWrapper {
	

	
	public void checkboxtest() {
		invokeAppUrl("chrome","https://demoqa.com/");
		windowscroll();
		//invokeAppUrl("chrome","https://demoqa.com/checkbox");
		//sleep(5000);
		findByXpathClick("//h5[text()='Elements']");
		sleep(2000);
		windowscroll();
		findByXpathClick("//span[text()='Check Box']");
		windowscroll();
		
	}

}
