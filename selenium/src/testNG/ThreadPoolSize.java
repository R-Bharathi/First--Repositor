package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize {
	@Test(invocationCount=4,threadPoolSize=5)
	public void login() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(1000);
	    driver.quit();

}
}