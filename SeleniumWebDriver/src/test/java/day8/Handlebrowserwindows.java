package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowserwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        ch.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ch.manage().window().maximize();
        ch.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> IDs= ch.getWindowHandles();
        ArrayList<String>windowIds= new ArrayList(IDs);
        String firstid= windowIds.get(0);
        String secondid= windowIds.get(1);
        //System.out.println(firstid);
        //System.out.println(secondid);
        ch.switchTo().window(secondid);
        Thread.sleep(5000);
        System.out.println(ch.getTitle());
        ch.switchTo().window(firstid);
        Thread.sleep(5000);
        System.out.println(ch.getTitle());
        
	}

}
