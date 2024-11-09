package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitingmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver= new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().window().maximize();
	     Thread.sleep(1000);//this will create a delay
	     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Andrew");
	}

}
