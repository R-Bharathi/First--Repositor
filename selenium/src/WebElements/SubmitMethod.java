package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/jewelry");
	     WebElement element=driver.findElement(By.id("small-searchterms"));
	     element.sendKeys("123");
	     driver.findElement(By.xpath("//input[@value='Search store']")).submit();
	     driver.findElement(By.xpath("//input[@id='As']")).click();
	     driver.findElement(By.xpath(" //input[@id='Isc']")).click();
	     driver.findElement(By.id("Pf")).sendKeys("ra");
	     driver.findElement(By.id("Pt")).sendKeys("poo");
	     driver.findElement(By.id("Sid")).click();
	     driver.findElement(By.xpath("//input[@value='Search']")).submit();


	}

}
