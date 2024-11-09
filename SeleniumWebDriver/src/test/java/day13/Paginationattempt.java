package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationattempt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver c= new ChromeDriver();
        c.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        c.get("https://testautomationpractice.blogspot.com/");
        List<WebElement>buttons=c.findElements(By.xpath("//ul[@id='pagination']/li"));
        c.manage().window().maximize();
        for(int i=1; i<=2; i++) {
        	if(i>=1) {
        		c.findElement(By.xpath("//ul[@id='pagination']/li/a[text()="+i+"]")).click();
        		for(int r=1; r<=5; r++) {
        			for(int col=1; col<=4; col++) {
        				String info=c.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td["+col+"]")).getText();
        				System.out.printf("%-20s",info);
        			}
        			System.out.println();
        		}
        		Thread.sleep(3000);
        	}
        }
	}

}
