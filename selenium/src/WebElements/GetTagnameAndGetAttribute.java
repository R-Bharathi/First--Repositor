package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnameAndGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.id("email"));
		System.out.println(element.getTagName());
		System.out.println(element.getAttribute("placeholder"));
		System.out.println(element.getAttribute("id"));
		System.out.println("*************************");
		element.sendKeys("Bharathi");
		System.out.println(element.getAttribute("id"));
		System.out.println("***************");
	    System.out.println(driver.findElement(By.linkText("Forgotten password?")).getAttribute("href"));
		
		
		
		

	}

}
