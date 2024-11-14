package day18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browseinincognitomode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito"); 
		ChromeDriver driv= new ChromeDriver(options);
		driv.get("https://testautomationpractice.blogspot.com/");
		driv.manage().window().maximize();
	}

}
