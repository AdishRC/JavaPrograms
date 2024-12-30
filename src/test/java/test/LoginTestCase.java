package test;

import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nimap.ffc.testComponents.ExtentReportClass;
import nimap.ffc.pageObjects.LoginPage;
import nimap.ffc.testComponents.BaseTest;

@Listeners(ExtentReportClass.class)
public class LoginTestCase extends BaseTest {

	LoginPage lp;

	@BeforeMethod
	public void setUp() throws IOException {
		initilization();
		lp = new LoginPage(driver);
	}

	@Test
	public void LoginNimapNew() throws InterruptedException {
		lp.Login(Props.getProperty("mobile_no"), Props.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

