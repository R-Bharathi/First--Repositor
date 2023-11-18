package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemonstrationOfDependsOnMethods {
	  
	@Test()
	public void login() {
		System.out.println("i'm from login");
	}

	public void home() {
		System.out.println("i'm from home");
	}
	@Test(dependsOnMethods="login",priority=-1)

	public void logout() {
		System.out.println("i'm from logout ");
	}

	

}
