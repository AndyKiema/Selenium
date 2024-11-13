package day16;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openingdifferentwebsiteonnewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ch.get("https://www.youtube.com/");
        ch.manage().window().maximize();
        ch.switchTo().newWindow(WindowType.TAB);
        ch.get("https://www.nopcommerce.com/en");
        
        //To open 2nd website in new window
        ch.get("https://www.youtube.com/");
        ch.manage().window().maximize();
        ch.switchTo().newWindow(WindowType.WINDOW);
        ch.get("https://www.nopcommerce.com/en");
	}

}
