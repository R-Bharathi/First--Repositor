package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_8 {
	@Test(groups= {"IT"})
	public void navigateTomyntra() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.myntra.com");
	    Thread.sleep(1000);
	    driver.quit();


}
}
