package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javscriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ch.get("https://testautomationpractice.blogspot.com/");
        ch.manage().window().maximize();
        WebElement namebox=ch.findElement(By.xpath("//*[@id=\"name\"]"));
        JavascriptExecutor js= (JavascriptExecutor)ch;
        js.executeScript("arguments[0].setAttribute('value','John')", namebox); //instead of sendKeys()
        WebElement selectfemale=ch.findElement(By.xpath("//*[@id=\"female\"]"));
        js.executeScript("arguments[0].click()", selectfemale); //clicking
	}

}
