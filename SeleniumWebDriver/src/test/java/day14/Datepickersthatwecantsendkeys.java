package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepickersthatwecantsendkeys {
	
	static void selectdate(String day, String month, String year) {
		ChromeDriver c= new ChromeDriver();
        c.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        c.get("https://testautomationpractice.blogspot.com/");
        c.manage().window().maximize();
        c.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();
        WebElement monthpicker=c.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
        Select monthselect= new Select(monthpicker);
        monthselect.selectByVisibleText(month);
        WebElement yearpicker=c.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
        Select yearselect= new Select(yearpicker);
        yearselect.selectByVisibleText(year);
        
      List<WebElement>daypicker=c.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
      for(WebElement date:daypicker) {
    	  if(date.getText().equals(day)) {
    		  date.click();
    		  break;
    	  }
      }
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        selectdate("8", "Oct", "2023");
	}

}
