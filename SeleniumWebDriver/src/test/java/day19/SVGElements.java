package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        cd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        cd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(4000);
        cd.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//*[name()='svg']")).click();
	}
}
