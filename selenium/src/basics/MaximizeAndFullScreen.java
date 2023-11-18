package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreen {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();
		ref.manage().window().maximize();
		ref.manage().window().fullscreen();																																																						
	
		ref.get("https://www.amazon.com");
	}

}
