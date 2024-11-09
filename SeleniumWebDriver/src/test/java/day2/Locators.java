package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.get("https://demo.opencart.com/");
        cd.manage().window().maximize();
        //cd.findElement(By.name("search")).sendKeys("Mac");
        //boolean statusoflogo=cd.findElement(By.id("logo")).isDisplayed();
        //System.out.println(statusoflogo);
        //cd.findElement(By.linkText("Tablets")).click();
        //cd.findElement(By.partialLinkText("Tab")).click();
       // List<WebElement>headerlinks=cd.findElements(By.className("list-inline-item"));
        //System.out.println("Total number of headerlinks is: "+headerlinks.size());
        List<WebElement>totalnooflinks=cd.findElements(By.tagName("a"));
        System.out.println(totalnooflinks.size());
        List<WebElement>totalnoofimages=cd.findElements(By.tagName("img"));
        System.out.println(totalnoofimages.size());
	}

}
