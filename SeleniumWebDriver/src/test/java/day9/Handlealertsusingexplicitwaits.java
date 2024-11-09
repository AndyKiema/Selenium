package day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlealertsusingexplicitwaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver chd= new ChromeDriver();
		WebDriverWait mywait= new WebDriverWait(chd,Duration.ofSeconds(5));
		chd.get("https://the-internet.herokuapp.com/javascript_alerts");
		chd.manage().window().maximize();
		chd.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());
		//https://admin:adminthe-internet.herokuapp.com/basic_auth
	}

}
