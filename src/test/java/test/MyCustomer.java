package nimap.ffc.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nimap.ffc.testComponents.ExtentReportClass;

import nimap.ffc.pageObjects.MyCustomerPage;
import nimap.ffc.testComponents.BaseTest;

@Listeners(ExtentReportClass.class)
public class MyCustomer extends BaseTest {
	MyCustomerPage addCust;

	@BeforeMethod
	public void signUp() throws IOException, InterruptedException {
		initilization();
		LoginNimap(Props.getProperty("mobile_no"), Props.getProperty("password"));
		addCust = new MyCustomerPage(driver);
	}

	@Test
	public void add_customer() throws InterruptedException, AWTException {
		addCust.customerAdd();
	}
}

