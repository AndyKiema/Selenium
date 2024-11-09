package day7;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch= new ChromeDriver();
		Wait<ChromeDriver> wait = new FluentWait<>(ch)
			    .withTimeout(Duration.ofSeconds(30))    // Total wait time
			    .pollingEvery(Duration.ofSeconds(5))    // Polling interval
			    .ignoring(NoSuchElementException.class); // Ignored exception
		ch.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		element.sendKeys("Andrew");
	}

}
