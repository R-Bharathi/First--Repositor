package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	


		driver.get("https://www.facebook.com/login/");
		
		
		Thread.sleep(3000l);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("alert(\"im goood \");");
		
				


	}

}
