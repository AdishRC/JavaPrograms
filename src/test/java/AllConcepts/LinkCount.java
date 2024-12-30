package AllConcepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\Automation\\CDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//1) Count of the links on the web page
		System.out.println(driver.findElements(By.tagName("a")).size());

		//2) Count of the footer side links on the page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		//3) Count the links in a single column in footer
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbodytr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// WebElement columndriver1 = driver.findElement(By.xpath("//div/table/tbodytr/td[1]/ul"));
		// System.out.println(columndriver1.findElements(By.tagName("a")).size());


		//4) Click on each link in the coloumn and check if the pages are opening

		for (int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}

		// Opens all the tabs
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}

