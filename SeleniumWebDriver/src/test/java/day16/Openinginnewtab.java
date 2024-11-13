package day16;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Openinginnewtab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://www.nopcommerce.com/en");
        cd.manage().window().maximize();
        WebElement partners=cd.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[3]/div/ul[1]/li[4]/a/span"));
        Actions ac= new Actions(cd);
        //Click control and click the link
        ac.keyDown(Keys.CONTROL).click(partners).keyUp(Keys.CONTROL).perform(); 
        ArrayList<String>ids= new ArrayList(cd.getWindowHandles());
        System.out.println(ids);
        String newwindowid=ids.get(1);
        String oldwindowid=ids.get(0);
        cd.switchTo().window(newwindowid);
        Thread.sleep(5000);
        //Switching back to home page 
        cd.switchTo().window(oldwindowid); 
        
	}

}
