package AllConcepts;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamsSorted {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		//Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		//Capture all webelemnt into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		//Capture text of all webelement into new (original) list
		List<String> originalList= elementList.stream().map(s->s.getText()).collect(Collectors.toList());

		//Sort on the original list of step 3 -> sorted list
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());

		//Compare original & sorted list
		Assert.assertTrue(originalList.equals(sortedList));


		//Find out price of Beans veggi
		List<String> price;
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Wheat")).map(s->getPriceVeggi(s))
					.collect(Collectors.toList());
			price.forEach(a->System.out.println(a));

			if (price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size()<1);

	}

	private static String getPriceVeggi (WebElement s) {
		String priceValue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
}

