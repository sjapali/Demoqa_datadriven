package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utils.DP002;
import wrapper.GenericWrapper;

public class TextBox extends GenericWrapper {
	
	@Test(dataProvider="demoqatextbox",dataProviderClass=DP002.class)
	
	public void textbox(String fullname,String email,String curAdr,String perAdr) {
		
		invokeAppUrl("chrome","https://demoqa.com/");
		windowscroll();
		//invokeAppUrl("chrome","https://demoqa.com/text-box");
		//sleep(5000);
		findByXpathClick("//h5[text()='Elements']");
		//findByCssClick("svg[xmlns='http://www.w3.org/2000/svg']");
		sleep(2000);
		windowscroll();
		findByXpathClick("//span[text()='Text Box']");
		windowscroll();
		findById("userName",fullname);
		findById("userEmail",email);
		findById("currentAddress",curAdr);
		findById("permanentAddress",perAdr);
		windowscroll();
		sleep(6000);
		//findByIdClick("submit");
		explicitwait(8000,"//button[text()='Submit']");
		findByXpathClick("//button[text()='Submit']");
		closeAllbrowsers();
	}

}
