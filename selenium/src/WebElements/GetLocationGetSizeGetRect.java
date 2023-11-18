package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationGetSizeGetRect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement element=driver.findElement(By.id("newsletter-subscribe-button"));
		 System.out.println("the x value is"+element.getLocation().x);
		 System.out.println("the y value is"+element.getLocation().y);
         System.out.println("*******************************");
         System.out.println("the height is"+element.getSize().height);
         System.out.println("the width is"+element.getSize().width);
         System.out.println("*******************************");
         System.out.println("the x value is"+element.getRect().x);
		 System.out.println("the y value is"+element.getRect().y);
		 System.out.println("the height is"+element.getRect().height);
         System.out.println("the width is"+element.getRect().width);
         
		
	}

}
