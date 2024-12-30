package AllConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {
	public static void main(String[] args) throws InterruptedException {

		//Invoking Browser
		//Chrome - ChromeDriver exten->Methods close get
		//Firefox- FirefoxDriver ->methods close get
		// WebDriver  close  get
		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdrivr.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get ("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();

		//Firefox

		// System.setProperty("webdrivr.gecko.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\geckodriver");
		// WebDriver driver1 = new FirefoxDriver();
		// driver1.manage().window().maximize();
		// driver1.get ("https://rahulshettyacademy.com/");
		// System.out.println(driver1.getTitle());
		// System.out.println(driver1.getCurrentUrl());
		// Thread.sleep(3000);
		// driver1.close();

		//IE Browser

		// System.setProperty("webdrivr.ie.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\IEDriverServer");
		// WebDriver driver1 = new EdgeDriver();
		// driver1.manage().window().maximize();
		// driver1.get ("https://rahulshettyacademy.com/");
		// System.out.println(driver1.getTitle());
		// System.out.println(driver1.getCurrentUrl());
		// Thread.sleep(3000);
		// driver1.close();

	}

}
