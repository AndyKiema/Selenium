package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driv= new ChromeDriver();
        driv.get("https://demo.opencart.com/");
        driv.manage().window().maximize();
        //driv.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mac");
        //driv.findElement(By.xpath("//*[@placeholder='Search' and @name='search']")).sendKeys("Apple");
        //boolean b= driv.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
        //System.out.println(b);
        //String featuredText=driv.findElement(By.xpath("//*[text()='Featured']")).getText();
        //System.out.println(featuredText);
        //driv.findElement(By.xpath("//*[text()='Tablets']")).click();
        driv.findElement(By.xpath("//*[contains(@placeholder, 'Sea')]")).sendKeys("TV");
        //driv.findElement(By.xpath("//*[starts-with(@placeholder,'Sea')]")).sendKeys("TV");
        //boolean c=driv.findElement(By.xpath("//div[@id='carousel-banner-0']/div/button[1]")).isDisplayed();
        //System.out.println(c);
	}

}
