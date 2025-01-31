package testcases;

import org.testng.annotations.Test;

import utils.DP004;
import wrapper.GenericWrapper;

public class RadioButton extends GenericWrapper  {
	
	@Test(dataProvider ="demoqaradiobutton" ,dataProviderClass= DP004.class)
	
	public void radiobuttonmethod(String choice) {
		
		invokeAppUrl("chrome","https://demoqa.com/");
		windowscroll();
		//invokeAppUrl("chrome","https://demoqa.com/radio-button");
		//sleep(5000);
		findByXpathClick("//h5[text()='Elements']");
		sleep(2000);
		windowscroll();
		findByXpathClick("//span[text()='Radio Button']");
		windowscroll();
		
		if (choice.equalsIgnoreCase("Yes")) {
			findByXpathClick("//label[text()='Yes']");// click choice yes
		} else if (choice.equalsIgnoreCase("impressive")) {
			findByXpathClick("//label[text()='Impressive']");// click choice impressive
		}else if(choice.equalsIgnoreCase("no")) {
			findByXpathClick("//label[text()='No']");// click choice no
		}
		getTextbyCss(".text-success");
		closeAllbrowsers();
	}
	
}
