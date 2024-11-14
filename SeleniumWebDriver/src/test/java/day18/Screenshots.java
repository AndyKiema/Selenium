package day18;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver ch= new ChromeDriver();
        ch.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ch.get("https://testautomationpractice.blogspot.com/");
        ch.manage().window().maximize();
        
        //Screenshot of full page
       /* TakesScreenshot ts= (TakesScreenshot)ch;
        File fullscreenshotfile=ts.getScreenshotAs(OutputType.FILE);
        //File targetlocation= new File("C:\\Users\\ADMIN\\git\\Selenum\\SeleniumWebDriver\\Screenshotsfolder\\fullpage.jpg"); Converted to the code below
        File targetlocation= new File(System.getProperty("user.dir")+"\\Screenshotsfolder\\fullpage.jpg");
        fullscreenshotfile.renameTo(targetlocation); // copied to targetlocation
        
        //Screenshot of specific area
        WebElement dynamicwebtable=ch.findElement(By.xpath("//*[@id=\"HTML1\"]"));
        File specificscreenshot=dynamicwebtable.getScreenshotAs(OutputType.FILE); //getScreenshotAs method comes from WebElement interface
        File specifictargetlocation= new File(System.getProperty("user.dir")+"\\Screenshotsfolder\\dynamictable.jpg");
        specificscreenshot.renameTo(specifictargetlocation);*/
       // ch.quit()
        
        //Screenshot of a web element
        WebElement firsttitle=ch.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div/h3/a"));
        File titlescreenshot=firsttitle.getScreenshotAs(OutputType.FILE); 
        File titlelocation= new File(System.getProperty("user.dir")+"\\Screenshotsfolder\\guielements.jpg");
        titlescreenshot.renameTo(titlelocation);
	}

}
