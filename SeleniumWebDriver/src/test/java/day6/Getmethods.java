package day6;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //String title=driver.getTitle();
        //System.out.println(title);
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        //String id= driver.getWindowHandle();
        //System.out.println(id);
        //driver.findElement(By.linkText("Tablets")).click();//this will open browser window
        //Set<String>ids=driver.getWindowHandles();
        //System.out.println(ids);
        
	}

}
