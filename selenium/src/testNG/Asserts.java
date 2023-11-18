package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {
	@Test
	public void demo() {
		String expectedTitle="demo";
		String actualTitle="sam";
		//hard Assert
		//assertEquals(actualTitle,expectedTitle);
		//softassert
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle,expectedTitle);
		System.out.println("done");
		soft.assertAll();

		
	}

	
	

}
