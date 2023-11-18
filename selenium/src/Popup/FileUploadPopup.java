package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	     driver.get("http://the-internet.herokuapp.com/upload");
	     driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\bhara\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-05-30 122637.png");
	     driver.findElement(By.id("file-submit")).click();
	     //driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\bhara\\OneDrive\\Pictures\\Signature.jpg");
	    //driver.findElement(By.id("file-submit")).click();
	}

}
