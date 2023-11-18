package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FireFoxPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/alert/prompt");
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("yes");

	     Thread.sleep(1000);
	     System.out.println(al.getText());
	      //al.accept();
	     al.dismiss();

	}

}
