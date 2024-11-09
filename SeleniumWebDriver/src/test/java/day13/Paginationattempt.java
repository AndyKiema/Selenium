package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationattempt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver c= new ChromeDriver();
        c.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        c.get("https://testautomationpractice.blogspot.com/");
        c.manage().window().maximize();
        for(int i=2; i<=4; i++) {
        	if(i>1) {
        		c.findElement(By.xpath("//ul[@id='pagination']/li/a[text()="+i+"]")).click();
        		Thread.sleep(3000);
        	}
        }
	}

}
