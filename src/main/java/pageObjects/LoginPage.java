package pageObjects;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageComponent.PageComponent;

public class LoginPage extends PageComponent {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super (driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@formcontrolname='username']") 
	WebElement phone_no;
	@FindBy(xpath="//input[@id=\"mat-input-1\"]") 
	WebElement pass;
	@FindBy(xpath="//button[@id=\"kt_login_signin_submit\"]") 
	WebElement SignIn;

	public void Login(String mobile_no,String password) throws InterruptedException {
		phone_no.sendKeys(mobile_no);
		pass.sendKeys(password);

		Thread.sleep(1000);
		//Pause the script to manually solve the Captcha
		System.out.println("Solve the Captcha and press Enter to continue...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		Thread.sleep(1000);

		SignIn.click();
		Thread.sleep(1000);
	}
}

