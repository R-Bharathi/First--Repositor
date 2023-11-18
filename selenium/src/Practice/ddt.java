package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddt {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
         File file=new File("./TestData/textdata.xlsx");
        /*
       Workbook workbook=	WorkbookFactory.create(file);
         Sheet sheet=workbook.getSheet("Sheet1");
         Row row=sheet.getRow(1);
         Cell cell=row.getCell(1);
         String data=cell.toString();
         System.out.println(data);
          String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).toString();
          System.out.println(data);*/
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
		FileInputStream  fis=new FileInputStream("./TestData/data.properties");
		Properties pro=new Properties();
		pro.load(fis);
		driver.get(pro.getProperty("url"));
		
	    
          
         
         
         
	}

}
