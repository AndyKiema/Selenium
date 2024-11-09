package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        ch.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ch.manage().window().maximize();
        ch.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Andrew");
	}

}
