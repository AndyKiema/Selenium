package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch= new ChromeDriver();
        WebDriverWait mywait= new WebDriverWait(ch, Duration.ofSeconds(10));
        ch.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ch.manage().window().maximize();
        WebElement usernamebox=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        usernamebox.sendKeys("Andrew");
        WebElement passwordbox=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        passwordbox.sendKeys("Kiema");
        WebElement submitbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        submitbutton.click();
	}

}
