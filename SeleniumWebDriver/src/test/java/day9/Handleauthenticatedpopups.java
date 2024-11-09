package day9;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handleauthenticatedpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        //cd.get("https://the-internet.herokuapp.com/basic_auth");
        cd.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
