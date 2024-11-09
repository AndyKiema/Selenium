package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver chd= new ChromeDriver();
        chd.get("https://testautomationpractice.blogspot.com/");
        chd.manage().window().maximize();
        WebElement countryselect=chd.findElement(By.xpath("//select[@id='country']"));
        Select cselect= new Select(countryselect);
        //cselect.selectByVisibleText("Australia");
        List<WebElement>dropdownoptions=cselect.getOptions();
        //System.out.println(dropdownoptions.size());
        /*for(int i=0; i<dropdownoptions.size(); i++) {
        	System.out.println(dropdownoptions.get(i).getText());
        }*/
        /*for(WebElement ddo:dropdownoptions) {
        	System.out.println(ddo.getText());
        }*/
        
	}

}
