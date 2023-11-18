package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import JavaScriptExecutor.LoginPage;

public class TestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		 LoginPage1 page=new LoginPage1(driver);
		 page.getloginlink().click();
		 page.getemailid().sendKeys("bharathi@gmail.com");
		 page.getpwdid().sendKeys("77897467");
		 
		 }

}
