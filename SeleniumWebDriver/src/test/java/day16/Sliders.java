package day16;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://testautomationpractice.blogspot.com/");
        cd.manage().window().maximize();
        WebElement leftslider= cd.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
        //System.out.println(leftslider.getLocation()); (889,1968)
        Actions ac= new Actions(cd);
        //ac.dragAndDropBy(leftslider,20,0).perform();
        //System.out.println(leftslider.getLocation());
        ac.dragAndDropBy(leftslider, 30, 0).perform();
        WebElement rightslider= cd.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
        //System.out.println(rightslider.getLocation()); (1018,1968)
        ac.dragAndDropBy(rightslider, 20, 0).perform();
        System.out.println(rightslider.getLocation());
        
	}

}
