package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver dv= new ChromeDriver();
        dv.get("https://demo.opencart.com/");
        dv.manage().window().maximize();
        //dv.findElement(By.cssSelector(".form-control.form-control-lg")).sendKeys("Computer");
        //dv.findElement(By.cssSelector("[name=search]")).sendKeys("Computer");
        //dv.findElement(By.cssSelector(".form-control[name=search]")).sendKeys("Computer");
	}

}
