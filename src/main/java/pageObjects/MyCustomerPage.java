package nimap.ffc.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import nimap.ffc.pageComponent.PageComponent;

public class MyCustomerPage extends PageComponent {

	WebDriver driver;

	public MyCustomerPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Click on My Customer module
	@FindBy(xpath = "//span[contains(text(),'My Customers')]")
	WebElement my_customer;

	// Click on New Customer
	@FindBy(xpath = "//span[contains(text(),' New Customer')]")
	WebElement new_customer_btn;

	// Lead/Customer name
	@FindBy(xpath = "//input[@formcontrolname='LeadName']")
	WebElement LeadCustomerName;

	// Ref No
	@FindBy(xpath = "//input[@formcontrolname='RefNo']")
	WebElement RefNumber;

	// Primary Contact Details
	// Contact Person Name
	@FindBy(xpath = "//input[@formcontrolname='PersonName']")
	WebElement contactPerson;

	// Mobile Number
	@FindBy(xpath = "//input[@formcontrolname='MobileNo']")
	WebElement mobileNumber;

	// Telephone Number
	@FindBy(xpath = "//input[@formcontrolname='ContactNo']")
	WebElement contactNo;

	// Email
	@FindBy(xpath = "//input[@formcontrolname='Email']")
	WebElement email;

	// Contact Person Designation
	@FindBy(xpath = "//input[@data-placeholder='Contact Person Designation']")
	WebElement contactPersonDes;

	// Add More Button
	@FindBy(xpath = "//span[contains(text(),'Add More')]")
	WebElement addMore;

	// Remove Button
	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	WebElement remove;

	// Customer Address Details
	// Address
	@FindBy(xpath = "//input[@formcontrolname='Address']")
	WebElement address;

	@FindBy(xpath = "//button[@class='mat-focus-indicator float-right mat-raised-button mat-button-base mat-primary']")
	WebElement doneButton;

	// Country Selection
	@FindBy(xpath = "(//span[contains(text(),'Country')])[2]")	
	WebElement Country;

	//	@FindBy(xpath = "//input[@data-placeholder='Search']")
	@FindBy(xpath = "(//input[@data-placeholder='Search'])[3]")
	WebElement searchCountry;

	//	@FindBy(xpath = "(//div[@class='mat-ripple mat-option-ripple'])[3]")
	@FindBy(xpath = "(//span[contains(text(),'India')])[2]")
	WebElement selection;

	// State Selection
	@FindBy(xpath = "(//span[contains(text(),'State')])[3]")
	WebElement State;

	@FindBy(xpath = "(//input[@data-placeholder='Search'])[3]")
	WebElement searchSate;

	@FindBy(xpath = "(//span[contains(text(),'Maharashtra')])[1]")
	WebElement selection1;

	// City Selection
	@FindBy(xpath = "(//span[contains(text(),'City')])[3]")	
	WebElement City;

	@FindBy(xpath = "(//input[@data-placeholder='Search'])[3]")
	WebElement searchCity;

	@FindBy(xpath = "(//span[contains(text(),'Mumbai')])[1]")
	WebElement selectCity;

	// Locality Selection
	@FindBy(xpath = "(//span[contains(text(),'Locality')])[3]")	
	WebElement Locality;

	@FindBy(xpath = "(//input[@data-placeholder='Search'])[3]")
	WebElement searchLocality;

	@FindBy(xpath = "(//span[contains(text(),'Borivali East')])[1]")
	WebElement selectLocality;

	// PinCode
	@FindBy(xpath = "//input[@formcontrolname='PinCode']")
	WebElement pinnumber;


	// More Info Details
	// Customer Source
	@FindBy(xpath = "//span[contains(text(),'Customer Source')]")
	WebElement customerSource;

	@FindBy(xpath = "//span[contains(text(),'Facebook')]")
	WebElement customerSourceSel;

	// Customer Stage
	@FindBy(xpath = "//span[contains(text(),'Customer Stage')]")
	WebElement customerStage;

	@FindBy(xpath = "//span[contains(text(),'Account')]")
	WebElement customerStageSel;

	// Tags
	@FindBy(xpath = "(//input[@data-placeholder='Tags'])[7]")
	WebElement tags;

	//Attach Fron Visiting Card
	@FindBy(xpath = "//input[@data-placeholder='Attach Front Visiting Card']")
	WebElement uploadButton;

	public void customerAdd() throws InterruptedException, AWTException {
		my_customer.click();
		Thread.sleep(2000);
		new_customer_btn.click();
		LeadCustomerName.sendKeys("Sagar Patil");
		RefNumber.sendKeys("675");
		contactPerson.sendKeys("ABCD");
		mobileNumber.sendKeys("7955663467");
		contactNo.sendKeys("89546646");
		email.sendKeys("asdf@gmail.com");
		contactPersonDes.sendKeys("Tester");
		addMore.click();
		remove.click();
		address.click();
		Thread.sleep(2000);
		doneButton.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean element = wait.until(ExpectedConditions.and(
		ExpectedConditions.elementToBeClickable(Country)));
		System.out.print(element);
		Country.click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.click(searchCountry).sendKeys("India").perform();
		selection.click();

		Thread.sleep(2000);
		State.click();
		searchSate.sendKeys("Maharashtra");
		selection1.click();

		Thread.sleep(2000);
		City.click();
		searchCity.sendKeys("Mumbai");
		selectCity.click();

		Thread.sleep(2000);
		Locality.click();
		searchLocality.sendKeys("Borivali East");
		selectLocality.click();

		pinnumber.sendKeys("675907");
		customerSource.click();
		customerSourceSel.click();
		customerStage.click();
		customerStageSel.click();
		Thread.sleep(2000);
		tags.sendKeys("Hello World");
		Thread.sleep(3000);
		uploadButton.click(); 

		// Now use the Robot class to upload the file
		Robot robot = new Robot();
		// Copy the file path to the clipboard
		String filePath = "C:\\Users\\Nimap\\OneDrive - Disrptiv Exchange\\Desktop\\A.png";
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		// Paste the file path using CTRL + V (or CMD + V on Mac)
		// Add delay for file upload dialog to appear
		robot.setAutoDelay(2000);  
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Press Enter to confirm the file selection
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}

