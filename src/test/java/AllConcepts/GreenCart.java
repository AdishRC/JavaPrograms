package AllConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GreenCart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(3000);
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};


		for(int i=0;i<products.size();i++)

		{
			//Brocolli - 1 Kg
			//Brocolli,    1 kg

			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();

//====================================================================================================
			
			int j=0;
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName))
				
			{
				j++;

				//click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)

				{
					break;

				}

			}

		}

	}

}

