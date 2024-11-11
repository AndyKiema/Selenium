package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoveraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ch.get("https://demo.opencart.com/");
        ch.manage().window().maximize();
        ////*[@id="narbar-menu"]/ul/li[1]/a - desktop
        ////*[@id="narbar-menu"]/ul/li[1]/div/div/ul/li[2]/a- mac(1)
        WebElement desktop=ch.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
        WebElement mac=ch.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
        Actions ac= new Actions(ch);
        //ac.moveToElement(desktop).moveToElement(mac).build().perform(); To locate
        //ac.moveToElement(desktop).moveToElement(mac).click().build().perform(); //To click
        ac.moveToElement(desktop).moveToElement(mac).click().perform(); 
        //perform method can create and complete an action. We don't need the build method
	}

}
