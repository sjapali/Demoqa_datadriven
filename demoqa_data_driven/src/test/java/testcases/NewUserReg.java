package testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.DP001;
import wrapper.GenericWrapper;

public class NewUserReg extends GenericWrapper {
	
	@Test(dataProvider ="demoqa1", dataProviderClass= DP001.class)

	public void newuserreg(String firstname, String lastname, String username, String password) {
		
		//invokeAppUrl("chrome","https://demoqa.com/login");
		//findByIdClick("newUser");
		invokeAppUrl("chrome","https://demoqa.com/register");
		findById("firstname",firstname);
		findById("lastname",lastname);
		findById("userName",username);
		findById("password",password);
		//findByIdClick("recaptcha-anchor");
		//WebDriverWait(10);
		//sleep(10000);
		//webdriverwait(10,"frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"))");
		findByIdClick("g-recaptcha-response");
		
		//findByCssClick("div[class=recaptcha-checkbox-checkmark]");
		//findByCssClick("div.recaptcha-checkbox-checkmark");
		
		//findByXpathClick("//div[@class='recaptcha-checkbox-checkmark']");
		sleep(2000);
		findByIdClick("register");
		//closeAllbrowsers();
		closeBrowser();
		
	}
}
