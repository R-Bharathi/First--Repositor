package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IEnabledAndIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(element.isEnabled());
		System.out.println("display status:"+element.isDisplayed());
		driver.findElement(By.name("username")).sendKeys("bharathi");
		driver.findElement(By.name("password")).sendKeys("66789643223456");
		System.out.println(element.isEnabled());
		
		

	}

}
