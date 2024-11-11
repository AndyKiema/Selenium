package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driv= new ChromeDriver();
        driv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driv.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driv.manage().window().maximize();
        WebElement rightclickbutton=driv.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        Actions act= new Actions(driv);
        act.contextClick(rightclickbutton).perform();
        
        //to click on an option after right clicking
        driv.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
        Thread.sleep(5000);
        driv.switchTo().alert().accept();
	}

}
