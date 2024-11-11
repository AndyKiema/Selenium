package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver rome= new ChromeDriver();
        rome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        rome.get("https://www.globalsqa.com/demo-site/datepicker/");
        rome.manage().window().maximize();
        rome.findElement(By.xpath("//*[@id=\"Icon Trigger\"]")).click();
        WebElement frame=rome.findElement(By.xpath("//*[@id='post-2661']/div[2]/div/div/div[3]/p/iframe"));
        rome.switchTo().frame(frame);
        rome.findElement(By.xpath("/html/body/p/img")).click();
        while(true) {
        	String shownmonth=rome.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();	
            String shownyear=rome.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
        	if(shownmonth.equals("June")&& shownyear.equals("2021")) {
        		break;
        	}
        	else {
        		rome.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
        	}
        }
        List<WebElement>showndays=rome.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
        for(WebElement shownday: showndays) {
        	if(shownday.getText().equals("20")) {
        		shownday.click();
        		break;
        	}
        };
	}

}
