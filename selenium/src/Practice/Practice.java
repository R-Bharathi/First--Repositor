package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//Webdrivermethods
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://www.instagram.com/accounts/login/");
		/*System.out.println(driver.manage().window().getSize());
		Dimension ref=new Dimension(1000,300);
		driver.manage().window().setSize(ref);
		
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(90,100);
		driver.manage().window().setPosition(p);*/
		/*driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com/");
	  
		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(1000);

		
		
		
	
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	 //  System.out.println(driver.getPageSource());	
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		//driver.close();
		//driver.quit();*/
        driver.get("chrome://downloads/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement element=(WebElement)js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
        element.sendKeys("the data");

		
		
		
             
	}

}
