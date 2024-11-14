package day18;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true); // Accepts SSL certificates
		
        ChromeDriver chd= new ChromeDriver(options);
        chd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chd.get("https://expired.badssl.com/");
        chd.manage().window().maximize();
        System.out.println(chd.getTitle());
	}

}
