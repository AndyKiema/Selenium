package day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autospacedropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://www.google.com/");
        cd.manage().window().maximize();
        cd.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
        List<WebElement>suggestions=cd.findElements(By.xpath("//ul[@role='listbox']/child::li"));
        System.out.println(suggestions.size());
        /*for(int i=0; i<suggestions.size(); i++) {
        	System.out.println(suggestions.get(i).getText());
        }*/
        for(WebElement sugg:suggestions) {
        	System.out.println(sugg.getText());
        	if(sugg.getText().equals("selenium benefits for men")) {
        		sugg.click();
        		break;
        	}
        }
        
	}

}
