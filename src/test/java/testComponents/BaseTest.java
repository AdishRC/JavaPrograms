package testComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;
	public Properties Props;
	public Properties Prop1;

	public void initilization() {
		try {
			Props = new Properties();
			FileInputStream fis = new FileInputStream("src\\main\\java\\nimap\\ffc\\resources\\GlobalData.properties");
			Props.load(fis);
			
			Prop1 = new Properties();
			FileInputStream fis1 = new FileInputStream("src\\main\\java\\nimap\\ffc\\resources\\AddUser.properties");
			Prop1.load(fis1);

		} catch (IOException e) {
			e.printStackTrace();
		}

		String browserName = Props.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Props.getProperty("url"));
	}

	public void LoginNimap(String mobile_no, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(mobile_no);
		driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).sendKeys(password);
		Thread.sleep(10000);
		System.out.println("Solve the Captcha and press Enter to continue...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"kt_login_signin_submit\"]")).click();
	}
}

