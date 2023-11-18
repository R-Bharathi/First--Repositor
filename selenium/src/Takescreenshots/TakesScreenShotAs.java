package Takescreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShotAs {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		
		 
		driver.get("https://www.facebook.com/login/");
	     
	     Thread.sleep(2000);
	     TakesScreenshot ts=(TakesScreenshot)driver; 
	     File tempfile=ts.getScreenshotAs(OutputType.FILE);
	      
	     String presentDateAndTime=LocalDateTime.now().toString().replace(':', '-');
	     
	     FileHandler.copy(tempfile, new File("./bharathi/facebook"+presentDateAndTime+".jpg"));
	     
	     
	     
	}

}
