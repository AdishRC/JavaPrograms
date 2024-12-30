package AllConcepts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Chrome\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver1.getTitle());

		driver1.findElement(By.xpath("//input[@id='name']")).sendKeys("Adish");
		driver1.findElement(By.xpath("//input[@id='alertbtn']")).click();
		System.out.println(driver1.switchTo().alert().getText());
		Thread.sleep(2000);
		driver1.switchTo().alert().accept();
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "src\\Test\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);
		List<WebElement> Product = driver.findElements(By.cssSelector("h4.product-name"));
		int totalProducts = Product.size();
		System.out.println("Total number of products on the page: " + totalProducts);
		String[] itemNeeded = {"Beetroot", "Tomato", "Cucumber","Brocolli",};


		for (int i=0; i<Product.size(); i++)
		{

			String[] name= Product.get(i).getText().split("-");
			String formattedName= name[0].trim();

//=========================================================================================================================

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

