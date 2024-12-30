package AllConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//		
				// Static Dropdown
				WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown = new Select(staticdropdown);
				dropdown.selectByIndex(3);    //1st way to select option in dropdown
				System.out.println(dropdown.getFirstSelectedOption().getText());
		//		
		//		dropdown.selectByVisibleText("AED");   //2nd way to select option in dropdown
		//		System.out.println(dropdown.getFirstSelectedOption().getText());
		//		
		//		dropdown.selectByValue("INR");   //3rd way to select option in dropdown
		//		System.out.println(dropdown.getFirstSelectedOption().getText());


		// Static Dropdown

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);

		//		Static Dropdown Using while loop

		//		int i= 1;
		//		while (i<5)
		//		{
		//		
		//		driver.findElement(By.id("hrefIncAdt")).click();
		//		i++;
		//	
		//		}
		//		driver.findElement(By.id("btnclosepaxoption")).click();
		//		System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());


		//		Static Dropdown Using for loop

				System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());
				for (int i=1; i<5; i++)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
				}
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());


		//		Dynamic Dropdown using partial search

		//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("(//a[@value='HYD']) [2]")).click();


		//		Auto-Suggestive Dropdown

//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(3000);
//		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']  a"));
//
//		for(WebElement option :options)
//		{
//			if(option.getText().equalsIgnoreCase("india"))
//			{
//				option.click();
//				break;
//			}
//		}

	}

}


