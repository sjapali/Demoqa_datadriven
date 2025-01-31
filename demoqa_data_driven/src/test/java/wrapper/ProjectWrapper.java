package wrapper;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;

public class ProjectWrapper extends GenericWrapper{
	
	@BeforeMethod
	public void beforemethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
	}

}
