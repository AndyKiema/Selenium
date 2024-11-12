package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionvsActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver rom= new ChromeDriver();
        rom.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        rom.get("https://testautomationpractice.blogspot.com/");
        WebElement box1=rom.findElement(By.xpath("//*[@id=\"field1\"]"));
        WebElement box2=rom.findElement(By.xpath("//*[@id=\"field2\"]"));
        WebElement doubleclickbutton=rom.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
        box1.clear();
        box1.sendKeys("Selenium");
        Actions ac= new Actions(rom);
        ac.doubleClick(doubleclickbutton).perform();
        Action buildaction=ac.doubleClick(doubleclickbutton).build();
        buildaction.perform();
        Thread.sleep(5000);
        System.out.println(box2.getAttribute("value"));
        //line 24 and 26 are the same
        //Actions is a class used to perform mouse actions
        //Action is an interface used to hold a built action
	}

}
