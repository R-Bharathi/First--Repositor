package testNG;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_6 {
	@Test(groups= {"FT","ST"})
	public void Filpkart() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.filpkart.com");
	    Thread.sleep(1000);
	    assertTrue(false);
	    driver.quit();
	}

}
