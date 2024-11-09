package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        /*for(int i=0; i<checkboxes.size(); i++) {
        	checkboxes.get(i).click();
        }*/
        /*for(WebElement we:checkboxes) {
        	we.click();
        }*/
        for(int i=0; i<checkboxes.size(); i++) {
        	checkboxes.get(i).click();
        	if(i==2) {
        		break;
        	}
        } //Select first three checkboxes
        /*for(int i=4; i<checkboxes.size(); i++) {
        	checkboxes.get(i).click();
        }*/ // Select last 3 checkboxes (7-3=4)
        
        Thread.sleep(5000);
        for(int i=0; i<checkboxes.size(); i++) {
        	checkboxes.get(i).click();
        	if(i==2) {
        		break;
        	}
        }
	}

}
