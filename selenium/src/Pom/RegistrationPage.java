package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public RegistrationPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	
    	
    }
	
	
	@FindBy(linkText="Register")
	private WebElement Registerpage;
	
	@FindBy(id="gender-female")
	private WebElement gender;
	
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement LastName ;
	
	@FindBy(id="Email")
	private WebElement Email;
	
	@FindBy(id="Password")
	private WebElement  Password;
	

	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPassword;
	
	
	@FindBy(id="register-button")
	private WebElement button;
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getGender() {
		return gender;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastName() {
		return LastName;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}


	public WebElement getButton() {
		return button;
	}


	
	

	public WebElement getRegisterpage() {
		return Registerpage;
	}
	


	
	}
