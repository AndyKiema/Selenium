package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesandiframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver wd= new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.get("https://ui.vision/demo/webtest/frames/");
        wd.manage().window().maximize();
        WebElement frame=wd.findElement(By.xpath("//frame[@src='frame_1.html']"));
        wd.switchTo().frame(frame);
        wd.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("Welcome");
        wd.switchTo().defaultContent();
        WebElement we=wd.findElement(By.xpath("//frame[@src='frame_2.html']"));
        wd.switchTo().frame(we);
        wd.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("Second");
        wd.switchTo().defaultContent();
        WebElement third = wd.findElement(By.xpath("//frame[@src='frame_3.html']"));
        wd.switchTo().frame(third);
        wd.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("Third");
        wd.switchTo().frame(0);
        wd.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	}

}
