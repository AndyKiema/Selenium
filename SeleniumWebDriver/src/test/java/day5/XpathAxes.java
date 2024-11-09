package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.get("https://demo.opencart.com/");
        cd.manage().window().maximize();
        //cd.findElement(By.xpath("//div[@id='search']/child::input")).sendKeys("Yes");
        cd.findElement(By.xpath("//div[@class='col-md-5']/descendant::input")).sendKeys("Yes");
        
	}

}
