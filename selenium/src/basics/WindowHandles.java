package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		ChromeDriver ref=new ChromeDriver();	
		ref.get("https://www.flipkart.com/search?q=power+bank&sid=tyy%2C4mr%2Cfu6&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_5_sc_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_5_sc_na_na&as-pos=1&as-type=RECENT&suggestionId=power+bank%7CPower+Banks&requestId=6cfd75c8-4ea1-403f-9da7-4cfafed607de&as-searchtext=pwoer");
		ref.findElement(By.partialLinkText("Mi 3i 10000 mAh Power Bank")).click();
		System.out.println(ref.getWindowHandle()+"**************parent");
		System.out.println(ref.getWindowHandles());
		Thread.sleep(3000);
		ref.close();
		ref.quit();
		
	}
}