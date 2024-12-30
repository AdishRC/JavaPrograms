package AllConcepts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// The locators are the way to identify an HTMLelement on a web page.
		// ID, Xpath, CSS Selector, name, Class Name, Tag Name, Link Text, Partial LinkText

		System.setProperty("webdrivr.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Documents\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get ("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Adish");
		driver.findElement(By.name("inputPassword")).sendKeys("12345678");
		driver.findElement(By.className("submit")).click();

		// Css Selector:-
		// 1) ClassName=== tagname.classname ==== Button.signInBtn
		// 2) Id==== tagname#id ======== input#Username
		// 3) Tagname[attribute='value']
		// 4) Tagname[attribute='value']:nth-child(index value)
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();

		//   Xpath
		// 1) //Tagname[@attribute='value']
		//   2) //Tagname[@attribute='value'] [index value]
		//   3) //parentTagname/childTagname[index value]
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Adish");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("adish@gmail.com");
		// xpath by using index ===== if same value for multiple element (field) then using index value
		driver.findElement(By.xpath("//input[@type='text'] [2]")).clear();
		// css selectors by using index ===== if same value for multiple element (field) then using index value==== :nth-child(3)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("adish@123.com");
		// xpath by using parentTagname childTagname ======= //parent/child[index value]
		// driver.findElement(By.xpath("//form/input(3)")).sendKeys("8087543782");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8087543782");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		// cssSelectors by using parentTagname childTagname ======= parentTagname childTagname
		driver.findElement(By.cssSelector("form p"));
		driver.findElement(By.cssSelector("button[ class='go-to-login-btn']")).click();

	}

}

