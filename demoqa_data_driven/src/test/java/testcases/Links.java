package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.DP005;
import wrapper.GenericWrapper;

public class Links extends GenericWrapper {
	
@Test(dataProvider="links",dataProviderClass=DP005.class)
	
	public void links(String linkname) {
	
	invokeAppUrl("chrome","https://demoqa.com/");
	windowscroll();	
	findByXpathClick("//h5[text()='Elements']");	
	sleep(2000);
	windowscroll();
	findByXpathClick("//span[text()='Links']");
	windowscroll();
	sleep(4000);
	
	SoftAssert softAssert = new SoftAssert();
    //Home
	if (linkname.equalsIgnoreCase("Home$")) {
		findByIdClick("simpleLink");
		sleep(2000);
		String expectedUrl = "https://demoqa.com/";
		//String currurl = getcurrentWindowurl();
		String childurl = getChildWindowurl();
		//SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedUrl,childurl,"urls do not match");
	}
	
	//Homexxxx
	if (linkname.matches("Home+")) {
		findByIdClick("dynamicLink");
		sleep(2000);
		String expectedUrl = "https://demoqa.com/";
		String childurl = getChildWindowurl();
		//SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expectedUrl,childurl,"urls do not match");
	}
	
	//Created
	if (linkname.matches("Created")) {
		findByIdClick("created");
		sleep(2000);
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		String code =getTextbyTagname("b") ;
		softAssert.assertEquals("201",code,"codes do not match");
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		
	}
	
	//No Content
	if (linkname.matches("No Content")) {
		findByIdClick("no-content");
		sleep(2000);
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		String code =getTextbyTagname("b") ;
		softAssert.assertEquals("204",code,"codes do not match");
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		
	}
	
	//Moved
	if (linkname.matches("Moved")) {
		findByIdClick("moved");
		sleep(2000);
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		String code =getTextbyTagname("b") ;
		softAssert.assertEquals("301",code,"codes do not match");
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		
	}
	
	//Bad Request
	if (linkname.matches("Bad Request")) {
		findByIdClick("bad-request");
		sleep(2000);
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		String code =getTextbyTagname("b") ;
		softAssert.assertEquals("400",code,"codes do not match");
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		
	}
	
	//Unauthorized
	if (linkname.matches("Unauthorized")) {
		findByIdClick("unauthorized");
		sleep(2000);
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		String code =getTextbyTagname("b") ;
		softAssert.assertEquals("401",code,"codes do not match");
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		
	}
	
	//Forbidden
	if (linkname.matches("Forbidden")) {
		findByIdClick("forbidden");
		sleep(2000);
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		String code =getTextbyTagname("b") ;
		softAssert.assertEquals("403",code,"codes do not match");
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		
	}
	
	//Not Found
	if (linkname.matches("Not Found")) {
		findByIdClick("invalid-url");
		sleep(2000);
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		String code =getTextbyTagname("b") ;
		softAssert.assertEquals("404",code,"codes do not match");
		//String code = getTextbyXpath("//*[ text() = ‘201’ ]");
		
	}
	closeAllbrowsers();
	
}

}
