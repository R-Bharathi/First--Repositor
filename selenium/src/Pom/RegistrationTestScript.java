package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		RegistrationPage page=new RegistrationPage(driver);
		page.getRegisterpage().click();
		page.getGender().click();
		page.getFirstname().sendKeys("ramakkagari");
		page.getLastName().sendKeys("bharathi");
		page.getEmail().sendKeys("bharatyh@gmail.com");
		
		page.getPassword().sendKeys("567823");
		page.getConfirmPassword().sendKeys("567823");
        page.getButton().click();	
		
		
		
		
		
		
		
	}

}
