package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PreAndPostCondition {
	//configuration annotation
   @BeforeSuite
   public void beforeSuite() {
	   System.out.println("from before suite");
   }
   @BeforeTest
   public void beforeTest() {
	   System.out.println("from beforeTest");
   }
   @BeforeClass
   public void beforeClass() {
	   System.out.println("from beforeClass");
   }

   @BeforeMethod
   public void beforeMethed() {
	   System.out.println("from beforeMethed");
   }

   @AfterMethod
   public void aftermethod() {
	   System.out.println("from aftermethod ");
   }

   @AfterClass
   public void afterclass() {
	   System.out.println("from afterclass");
   }
  @AfterTest
  public void afterTest() {
	   System.out.println("from afterTest");
   }
  @AfterSuite
  public void afterSuit() {
	   System.out.println("from after suite");
  }
   
   @Test
   public void Method1() {
	   System.out.println("from Method1");
   }
   @Test
   public void Method2() {
	   System.out.println("from Method2");
   }
   
   

	

}
