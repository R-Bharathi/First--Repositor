package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
   /* driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Alert alert=driver.switchTo().alert();
    System.out.println(alert.getText());
   // alert.accept();
    alert.dismiss();*/
   /* driver.get("https://demoapps.qspiders.com/fileUpload");
   driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\bhara\\OneDrive\\Pictures\\Camera Roll\\WIN_20230923_10_31_08_Pro.jpg");
    
    
   // element.sendKeys("\"C:\\Users\\bhara\\OneDrive\\Pictures\\Discovery_files\\45281737954094536-wp6001955-games-colourful-computer-wallpapers.jpg\"");
    
    
    */
    /*driver.get("https://www.ilovepdf.com/word_to_pdf");
    driver.findElement(By.id("pickfiles")).click();
    Runtime.getRuntime().exec("./autoit/fileuploadlove.exe");*/
    /*driver.get("https://www.flipkart.com/");
    Robot ro=new Robot();
    ro.keyPress(KeyEvent.VK_TAB);
    ro.keyRelease(KeyEvent.VK_TAB);
    ro.keyPress(KeyEvent.VK_TAB);
    ro.keyRelease(KeyEvent.VK_TAB);
    ro.keyPress(KeyEvent.VK_TAB);
    ro.keyRelease(KeyEvent.VK_TAB);
    ro.keyPress(KeyEvent.VK_TAB);
    ro.keyRelease(KeyEvent.VK_TAB);
    ro.keyPress(KeyEvent.VK_TAB);
    ro.keyRelease(KeyEvent.VK_TAB);
    ro.keyPress(KeyEvent.VK_TAB);
    ro.keyRelease(KeyEvent.VK_TAB);
    ro.keyPress(KeyEvent.VK_TAB);
    ro.keyRelease(KeyEvent.VK_TAB);
    
    ro.keyPress(KeyEvent.VK_ENTER);
    ro.keyRelease(KeyEvent.VK_ENTER);*/
    driver.get("https://nxtgenaiacademy.com/multiplewindows/");
    driver.findElement(By.id("button1")).click();
    Set<String> allids = driver.getWindowHandles();
    String prtid = driver.getWindowHandle();
    String expectedtitle="nxtgenaiacademy";
    for(String id:allids) {
    	driver.switchTo().window(id);
    	if(driver.getTitle().contains(expectedtitle)); {
    		driver.manage().window().maximize();
    	}
    		
    	
    }
     
    
 
	}

}
