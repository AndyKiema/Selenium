package day8;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethods {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        //cd.get("https://demo.opencart.com/");
        //another option
        cd.navigate().to("https://demo.opencart.com/");
        /*URL myurl= new URL("https://demo.opencart.com/");
        cd.navigate().to(myurl);*/
        cd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        cd.navigate().back();
        System.out.println(cd.getCurrentUrl());
        cd.navigate().forward();
        System.out.println(cd.getCurrentUrl());
        cd.navigate().refresh();;
	}

}
