package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver chr= new ChromeDriver();
        chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chr.get("https://text-compare.com/");
        chr.manage().window().maximize();
        chr.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Selenium");
        Actions ac= new Actions(chr);
        ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform(); //Highlight/Select text in text area
        ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform(); //Copy text
        ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform(); //Move to next text area
        ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform(); //Paste text in text area
	}

}
