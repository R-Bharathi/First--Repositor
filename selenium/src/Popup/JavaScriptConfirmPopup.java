package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConfirmPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*driver.get("https://demoapps.qspiders.com/alert/confirm");
	    driver.findElement(By.xpath("//button[text()='Confirm Box']")).click() ;
	     Alert al=driver.switchTo().alert();
	     System.out.println(al.getText());
	     Thread.sleep(1000);
	     // al.accept();
	     al.dismiss();*/
		driver.get("https://demoapps.qspiders.com/alert/confirm");
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert a=driver.switchTo().alert();
		//a.sendKeys("yes");
		System.out.println(a.getText());
		a.accept();
	     
		

		
		
		
		
	    }

}
