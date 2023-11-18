package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//to handle notification popup
		//option.addArguments("--disable-notifications");
	//to open browser in incognito mode
		//option.addArguments("--incognito");
		//to open browser in maximize mode
		//option.addArguments("start-maximized");
		//to open the browser in headless mode
		option.addArguments("--headless");
		WebDriver driver=new ChromeDriver(option);
		System.out.println("hii");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("https://www.ajio.com/");
		//System.out.println("bharathi browser is lunched");
	}

}
