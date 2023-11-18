package FindElements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAutoSuggestionsData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the search keyword");
		String data=s.next();
		
		driver.findElement(By.id("APjFqb")).sendKeys(data);
		List<WebElement> allSuggeastion=driver.findElements(By.xpath("//span[contains(text(),'"+data+"')]"));
  for(WebElement suggestion:allSuggeastion)
  {
	  System.out.println(suggestion.getText());
	  
  }
	}

}
