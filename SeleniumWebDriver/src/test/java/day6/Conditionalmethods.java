package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver cw= new ChromeDriver();
        cw.get("https://testautomationpractice.blogspot.com/");
        cw.manage().window().maximize();
        //boolean titledisplayed=cw.findElement(By.xpath("//h1[@class='title']")).isDisplayed();
        //System.out.println("Title has been displayed: "+ titledisplayed);
        //boolean specificationdisplayed=cw.findElement(By.xpath("//span[normalize-space()='For Selenium, Cypress & Playwright']")).isDisplayed();
        //System.out.println("Specification has been displayed: "+specificationdisplayed);
        //boolean nameisenabled=cw.findElement(By.xpath("//input[@id='name']")).isEnabled();
        //System.out.println("First name input box is enabled: "+nameisenabled);
        //boolean emailisenabled=cw.findElement(By.xpath("//input[@id='email']")).isEnabled();
        //System.out.println("email input box is enabled: "+emailisenabled);
        //boolean phoneisenabled=cw.findElement(By.xpath("//input[@id='phone']")).isEnabled();
        //System.out.println("Phone input box is enabled: "+phoneisenabled);
        //boolean addressisenabled=cw.findElement(By.xpath("//textarea[@id='textarea']")).isEnabled();
        //System.out.println("Address input box is enabled: "+addressisenabled);
        //boolean submitisenabled=cw.findElement(By.xpath("//button[@class='submit-btn']")).isEnabled();
        //System.out.println("Submit button is enabled: "+submitisenabled);
        cw.findElement(By.xpath("//*[@id=\"female\"]")).click();
        boolean femaleisselected=cw.findElement(By.xpath("//*[@id=\"female\"]")).isSelected();
        System.out.println("Female is selected: "+femaleisselected);
        boolean maleisselected=cw.findElement(By.xpath("//input[@id='male']")).isSelected();
        System.out.println("Male is selected: "+maleisselected);
	}

}
