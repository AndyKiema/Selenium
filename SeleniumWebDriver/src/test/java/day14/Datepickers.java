package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {
	//ChromeDriver cd is passed as a parameter so the method has access to the browser session it needs to manipulate the date picker element on the web page.
	static void selectFutureDate(ChromeDriver cd, String month, String day, String year) {
		while(true) {
        	//month and year are declared and assigned inside the loop, so every iteration reassigns their values by retrieving the current month and year displayed by the calendar element.
        	//These values are only retrieved once and never updated inside the loop. So, if the current month and year on the page are, say, "November" and "2024", month and year remain "November" and "2024" throughout the entire execution of the loop
        	String currentmonth=cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
            String currentyear= cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
        	if(month.equals(currentmonth) && year.equals(currentyear)) {
        		break;      		
        	}
        	else {
        		//cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click(); //previous
        		cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click(); //next
        	}
        }
        //Select Date picker 
        List<WebElement>dates=cd.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for(WebElement date: dates) {
    		if(date.getText().equals(day)) {
    			date.click();
    			break;
    		}
    	}
	}
	static void selectPastDate(ChromeDriver cd, String month, String day, String year) {
		while(true) {
        	//month and year are declared and assigned inside the loop, so every iteration reassigns their values by retrieving the current month and year displayed by the calendar element.
        	//These values are only retrieved once and never updated inside the loop. So, if the current month and year on the page are, say, "November" and "2024", month and year remain "November" and "2024" throughout the entire execution of the loop
        	String currentmonth=cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
            String currentyear= cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
        	if(month.equals(currentmonth) && year.equals(currentyear)) {
        		break;      		
        	}
        	else {
        		cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click(); //previous
        		//cd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click(); //next
        	}
        }
        //Select Date picker 
        List<WebElement>dates=cd.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for(WebElement date: dates) {
    		if(date.getText().equals(day)) {
    			date.click();
    			break;
    		}
    	}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://jqueryui.com/datepicker/");
        cd.manage().window().maximize();
        WebElement iframe= cd.findElement(By.xpath("//iframe[@class='demo-frame']"));
        cd.switchTo().frame(iframe);
        WebElement dateinput=cd.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        dateinput.click();
        //dateinput.sendKeys("11/9/2024");
        
        String month="March";
        String year="2024";
        String day= "1";
        //selectFutureDate(cd,month,day,year);
        selectPastDate(cd,month,day,year); //Main method(which is static) can access these methods(which are also static) directly.
	}

}
