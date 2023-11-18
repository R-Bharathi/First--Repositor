package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GenerationReports {
	
	@Test
	public void testcases() {
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 	 WebDriver driver=new ChromeDriver();
		 Reporter.log("browser is launched",false);
	     driver.manage().window().maximize();
		 Reporter.log("window is maximized",true);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 
	     driver.navigate().to("https://www.instagram.com/");
		 Reporter.log("navigated to application",true);
		 driver.quit();
		 Reporter.log("browser is closed",true);



	     
	}
	
	
	
	
}
