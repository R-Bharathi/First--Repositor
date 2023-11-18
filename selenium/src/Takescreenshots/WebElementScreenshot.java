package Takescreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	


		driver.get("https://www.facebook.com/login/");


		//TakesScreenshot ts=(TakesScreenshot)driver;


		Thread.sleep(1000);
		File photo=driver.findElement(By.id("email")).getScreenshotAs(OutputType.FILE);
		File destination=new File("./reddy/facebook1.png");
		 // FileHandler.copy( photo,file);
		FileUtils.copyFile(photo, destination);
		

		//photo.renameTo(file);
	}

}
