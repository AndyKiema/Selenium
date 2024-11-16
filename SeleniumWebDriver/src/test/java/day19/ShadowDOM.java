package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ch.get("https://books-pwakit.appspot.com/");
        ch.manage().window().maximize();
        SearchContext shadowhost= ch.findElement(By.cssSelector("book-app[apptitle=\"BOOKS\"]")).getShadowRoot();
        shadowhost.findElement(By.cssSelector("#input")).sendKeys("Welcome");
        //NOTE:
        // You can simply locate the main shadow host, then locate the element directly
        //You can't use xpath to locate shadow DOM elements
	}

}
