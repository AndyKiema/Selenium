package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://testautomationpractice.blogspot.com/");
        cd.manage().window().maximize();
        List<WebElement>button=cd.findElements(By.xpath("//div[@class='table-container']/ul/li/a"));
        for(int i=1; i<=button.size(); i++) {
        		cd.findElement(By.xpath("//div[@class='table-container']/ul/li/a[text()="+i+"]")).click();
        		 List<WebElement> rows = cd.findElements(By.xpath("//div[@class='table-container']/table/tbody/tr"));
        		for(int r=1; r<=rows.size(); r++) {
        			List<WebElement> columns = cd.findElements(By.xpath("//div[@class='table-container']/table/tbody/tr[" + r + "]/td"));
        			for(int c=1; c<=columns.size(); c++) {
        				String data=cd.findElement(By.xpath("//div[@class='table-container']/table/tbody/tr["+r+"]/td["+c+"]")).getText();
        				System.out.printf("-%20s", data);
        			}
        			System.out.println();
        		}
        		Thread.sleep(3000);
        }
	}

}
