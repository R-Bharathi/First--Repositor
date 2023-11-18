package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          
        driver.get("chrome://downloads/");
        JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement element =(WebElement)js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		element.sendKeys("data into textfield");
      
        
		
	
        
        
        
        //document.querySelector("body > downloads-manager").shadowRoot.querySelector("#toolbar").shadowRoot.querySelector("#toolbar").shadowRoot.querySelector("#search").shadowRoot.querySelector("#searchInput")
	}

}
