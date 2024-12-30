package AllConcepts;

import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		//Take a Screenshot
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Nimap\\google.png"));
		Thread.sleep(2000);
		driver.close();

		
		//Handling insecure site
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "src\\Test\\Chrome\\chromedriver.exe");
		options.setAcceptInsecureCerts(true);
		WebDriver driver1 = new ChromeDriver(options);
		driver1.manage().window().maximize();
		driver1.get("https://expired.badssl.com/");
		System.out.println(driver1.getTitle());
		Thread.sleep(2000);
		driver1.close();
		
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("");
	}
}

