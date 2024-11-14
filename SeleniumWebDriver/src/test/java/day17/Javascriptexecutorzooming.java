package day17;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutorzooming {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://testautomationpractice.blogspot.com/");
        //minimizing a window
        cd.manage().window().maximize();
        //Thread.sleep(5000);
        //cd.manage().window().minimize();
        JavascriptExecutor js= (JavascriptExecutor)cd;
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='100%'");
	}

}
