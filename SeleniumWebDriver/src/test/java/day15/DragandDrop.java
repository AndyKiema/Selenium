package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver chr= new ChromeDriver();
        chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chr.get("https://testautomationpractice.blogspot.com/");
        chr.manage().window().maximize();
        WebElement dragthis=chr.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement dropthis=chr.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions ac= new Actions(chr);
        Thread.sleep(5000);
        ac.dragAndDrop(dragthis, dropthis).perform();
	}

}
