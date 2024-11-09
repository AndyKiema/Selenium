package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        cd.manage().window().maximize();
        cd.findElement(By.xpath("//*[contains(@class,'multiselect')]")).click();
        //cd.findElement(By.xpath("//input[@value='Python']")).click();
        cd.findElement(By.xpath("//input[@value='HTML']")).click();
        cd.findElement(By.xpath("//input[@value='CSS']")).click();
        List<WebElement>checkboxes=cd.findElements(By.xpath("//input[@type='checkbox']"));
        /*for(WebElement bx:checkboxes) {
        	bx.click();
        }*/
  
        /*for(WebElement bx:checkboxes) {
        	String bix= bx.getText(); 
    	    if(bix.equals("Java")){
    	    	bx.click();
    	    }
        }*/
        List<WebElement>items=cd.findElements(By.cssSelector(".checkbox"));
        System.out.println(items.size());
        for(WebElement item:items) {
        	System.out.println(item.getText());
        } 
        for(WebElement it:items) {
    	   if(it.getText().equals("Java") || it.getText().equals("Python")) {
    		   it.click();
    	   }
	      
        }
	}

}
