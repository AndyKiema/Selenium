package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamictableswithPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cdriv= new ChromeDriver();
        cdriv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cdriv.get("https://demo.opencart.com/admin/");
        cdriv.manage().window().maximize();
        Thread.sleep(5000);
        cdriv.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
        cdriv.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
        cdriv.findElement(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a")).click();
        String showingpagenos=cdriv.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[2]")).getText();
        //Showing 1 to 10 of 10053 (1006 Pages)
        int startIndex = showingpagenos.indexOf("(") + 1;
        int endIndex = showingpagenos.indexOf("Pages")-1;
        String pagenumbers=showingpagenos.substring(startIndex, endIndex);
        //System.out.println(pagenumbers);
        int totalpages= Integer.parseInt(pagenumbers);
        //System.out.println(totalpages);
        //Navigate through pages
        for(int i=1; i<=5; i++) {
        	if(i>1) {
        		WebElement button = cdriv.findElement(By.xpath("//ul[@class='pagination']/li/a[text()="+i+"]"));
        		Thread.sleep(5000);
                button.click();
        }
	}
  }
}
