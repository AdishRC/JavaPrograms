package pageComponent;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageComponent {
WebDriver driver;

	public PageComponent(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this); 
	}

	public void waitForElementToBeVisible(WebElement WebElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(WebElement));
    }

    public void waitForElementToBeClickAble(WebElement WebElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(WebElement));
    }
}
