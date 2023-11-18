package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	


		/*driver.get("https://demowebshop.tricentis.com/");
		 WebElement element=driver.findElement(By.xpath("//strong[text()='Popular tags']"));
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",element);*/
		 
		driver.navigate().to("https://www.primevideo.com/");
		 WebElement element=driver.findElement(By.xpath("(//span[text()='Get started'])[1]"));
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(flase)",element);
		 
		
		
	}

}
