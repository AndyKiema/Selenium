package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver dv= new ChromeDriver();
        dv.get("https://demo.opencart.com/");
        String actualTitle= dv.getTitle();
        if(actualTitle.equals("Your Store")) {
        	System.out.println("Test Successful");
        }
        else {
        	System.out.println("Test Failed");
        }
        dv.close();
        
	}

}
