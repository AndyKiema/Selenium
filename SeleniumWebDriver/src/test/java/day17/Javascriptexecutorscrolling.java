package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutorscrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ch.get("https://testautomationpractice.blogspot.com/");
        ch.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor)ch;
        js.executeScript("window.scrollBy(0,3000)", "");
        //System.out.println(js.executeScript("return window.pageYOffset;")); //3000
        
        //Scroll till you see your desired element
        WebElement webtabletitle=ch.findElement(By.xpath("//*[@id=\"HTML12\"]/h2"));
        //js.executeScript("arguments[0].scrollIntoView();", webtabletitle);
        //System.out.println(js.executeScript("return window.pageYOffset;"));
        
        //Scroll till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        // Scroll beck to top of page
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        
	}

}
