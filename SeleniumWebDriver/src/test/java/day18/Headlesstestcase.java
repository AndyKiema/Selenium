package day18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless=new");
		ChromeDriver dv= new ChromeDriver(options);
		
        dv.get("https://demo.opencart.com/");
        String actualTitle= dv.getTitle();
        if(actualTitle.equals("Your Store")) {
        	System.out.println("Test Successful");
        }
        else {
        	System.out.println("Test Failed");
        }
        dv.quit(); 
	}

}
