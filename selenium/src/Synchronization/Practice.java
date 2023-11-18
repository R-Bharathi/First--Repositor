package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	     
	     //implicitwait
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     
	     driver.get("https://www.linkedin.com/");
	     
	     
	     driver.findElement(By.id("session_key")).sendKeys("bharathi");
	     Thread.sleep(2000);
	     driver.findElement(By.id("session_key")).clear();
	     
	     
	     //explicitwait
	      WebDriverWait wait=new WebDriverWait(driver,10);
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("session_key")));
	     driver.findElement(By.id("session_key")).sendKeys("bharathi");
	     Thread.sleep(2000);
	     driver.findElement(By.id("session_key")).clear();
	     
	     
	    //customwait
	      int n=0;
	     while(n<100)
	      {
	    	 try
	    	 {
	    	     driver.findElement(By.id("session_key")).sendKeys("bharathi");
	    	     break;
	    	     

	    	 }
	    	 catch(Exception e)
	    	 {
	    		 System.out.println(n);
	    	 }
	    	 
	    	 
	     }
	     Thread.sleep(2000);
	     driver.findElement(By.id("session_key")).clear();
	     

	     //fluentwait
	     Wait<WebDriver> ref=new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(1))
	             .ignoring(NoSuchElementException.class);
	     ref.until(ExpectedConditions.visibilityOfElementLocated(By.id("session_key")));
	    		 driver.findElement(By.id("session_key")).sendKeys("bharathi");
	    	     driver.findElement(By.id("session_key")).clear();
	    	     Thread.sleep(1000);
	    	     driver.close();
	    	     

	    
	             
	            
	     
	     
	     
	     
	     
	      
	      
	     
	     
	     

	}

}
