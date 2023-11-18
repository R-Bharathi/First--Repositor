package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_TAB);
		ro.keyRelease(KeyEvent.VK_TAB);
		ro.keyPress(KeyEvent.VK_TAB);
		ro.keyRelease(KeyEvent.VK_TAB);
		
		ro.keyPress(KeyEvent.VK_TAB);
		ro.keyRelease(KeyEvent.VK_TAB);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		ro.keyPress(KeyEvent.VK_CAPS_LOCK);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_A);
		//ro.keyPress(KeyEvent.VK_ALPHANUMERIC);
		
		ro.keyPress(KeyEvent.VK_1);
		ro.keyRelease(KeyEvent.VK_1);
		
		ro.keyPress(KeyEvent.VK_C);
		ro.keyRelease(KeyEvent.VK_C);
		Thread.sleep(1000);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_A);
		//ro.keyPress(KeyEvent.VK_ALPHANUMERIC);
		
		ro.keyPress(KeyEvent.VK_1);
		ro.keyRelease(KeyEvent.VK_1);
		
		ro.keyPress(KeyEvent.VK_C);
		ro.keyRelease(KeyEvent.VK_C);
		
		ro.mouseWheel(200);
		
		
		
	}
}
