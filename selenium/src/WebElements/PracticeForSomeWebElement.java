package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForSomeWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com");
		driver.findElement(By.xpath("//input[@class='HBmJQt']")).click();
		WebElement element=driver.findElement(By.id("pv-search-nav"));
		element.sendKeys("Bh1234");
		Thread.sleep(1000);
		element.clear();
		element.sendKeys("bharathi");
	



	}

}
