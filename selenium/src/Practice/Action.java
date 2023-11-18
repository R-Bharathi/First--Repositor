package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             
             
            driver.get("https://www.ajio.com/");
             Actions act=new Actions(driver);
            /* WebElement element=driver.findElement(By.linkText("MEN"));
            // Actions act=new Actions(driver);
               act.moveToElement(element).perform();
               WebElement element1=driver.findElement(By.linkText("BRANDS"));
               act.moveToElement(element1).perform();
             WebElement element=driver.findElement(By.linkText("KIDS"));
             //act.moveToElement(element).click().perform();
             act.click(element).perform();
             WebElement element=driver.findElement(By.xpath("//input[@name='searchVal']"));
            // act.moveToElement(element).click().sendKeys("Top").perform();
             act.sendKeys(element, "Top").perform();
             driver.get("https://demoapps.qspiders.com/button");
             Actions act=new Actions(driver);
             WebElement element=driver.findElement(By.xpath("//p[@class='pb-3']/../..//button[text()='4']"));
            // act.moveToElement(element).doubleClick().perform();
             act.doubleClick(element).perform();*/
             WebElement element=driver.findElement(By.linkText("WOMEN"));
              //act.moveToElement(element).contextClick().perform();
              act.contextClick(element).perform();
             

             
             }

}
