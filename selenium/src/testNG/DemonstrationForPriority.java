package testNG;

import org.testng.annotations.Test;

public class DemonstrationForPriority {
	@Test(priority=10)
	public void login() {
		System.out.println("i'm from login");
	}
	@Test(priority=-20)

	public void home() {
		System.out.println("i'm from home");
	}
	@Test(priority=1)

	public void logout() {
		System.out.println("i'm from logout ");
	}

	

}
