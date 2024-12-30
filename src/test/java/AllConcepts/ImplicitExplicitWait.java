package AllConcepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWait {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String[] itemNeeded = {"Beetroot", "Tomato", "Cucumber","Brocolli"};

//		Impliitly Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		Explicitly Wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemNeeded);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))).sendKeys("rahulshettyacademy");
//		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
	}

	public static void addItems(WebDriver driver, String[] itemNeeded)

	{
		List<WebElement> Product = driver.findElements(By.cssSelector("h4.product-name"));
		int totalProducts = Product.size();
		System.out.println("Total number of products on the page: " + totalProducts);

		for (int i=0; i<Product.size(); i++)
		{

			String[] name= Product.get(i).getText().split("-");
			String formattedName= name[0].trim();

			int j= 0;

			List itemNeededList = Arrays.asList(itemNeeded);
			if (itemNeededList.contains(formattedName))
			{
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==itemNeeded.length)
				{
					break;
				}
			}
		}
	}
}



