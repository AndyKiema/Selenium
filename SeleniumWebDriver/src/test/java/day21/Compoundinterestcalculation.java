package day21;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Compoundinterestcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver cd= new ChromeDriver();
       cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       cd.get("https://www.investor.gov/financial-tools-calculators/calculators/compound-interest-calculator");
       cd.manage().window().maximize();
       
	}

}
