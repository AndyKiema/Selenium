package day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticwebtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver chd= new ChromeDriver();
        chd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chd.get("https://testautomationpractice.blogspot.com/");
        chd.manage().window().maximize();
        List<WebElement>rowsnumber=chd.findElements(By.xpath("//table[@name='BookTable']/descendant::tr"));
        //System.out.println("Number of rows in book table is:"+rowsnumber.size());
        List<WebElement>columnno=chd.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
        //System.out.println("Number of columns is: "+columnno.size());
        /*for(WebElement col:columnno) {
        	System.out.println(col.getText());
        }*/
        WebElement focus=chd.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[6]/td[1]"));
        System.out.println(focus.getText());
        /*for(int k=0; k<=columnno.size(); k++) {
        	System.out.println(columnno.get(k).getText());
        }
        /*for(int i=2; i<=rowsnumber.size();i++){
        
        		String items=chd.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[2]")).getText();
        		System.out.printf("%-20s", items);
        	
        	System.out.println();
        }*/
        //%: Begins a format specifier.
        //-20s: Left-aligns the text within a field width of 20 characters. Adjust 20 to fit your data better if needed.
	}

}
