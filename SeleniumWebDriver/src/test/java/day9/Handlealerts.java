package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver chd= new ChromeDriver();
        chd.get("https://the-internet.herokuapp.com/javascript_alerts");
        chd.manage().window().maximize();
        /*chd.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();//JS Alert
        Thread.sleep(5000);
        Alert myalert=chd.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();*/
        /*chd.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
        Alert mysecond= chd.switchTo().alert();
        System.out.println(mysecond.getText());
        mysecond.dismiss();*/ //JS confirm
        chd.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);
        Alert prompt=chd.switchTo().alert();
        System.out.println(prompt.getText());
        //prompt.sendKeys("Selenium");
        //prompt.accept();
	}

}
