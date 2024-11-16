package day19;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        ChromeDriver chr= new ChromeDriver();
        chr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chr.get("http://www.deadlinkcity.com/");
        chr.manage().window().maximize();
        List<WebElement>links=chr.findElements(By.tagName("a")); //get all links from website
        //System.out.println(links.size());
        int noOfBrokenLinks= 0;
        for(WebElement link:links) {
        	String hrefvalue=link.getAttribute("href");
        	if(hrefvalue==null || hrefvalue.isEmpty()) { //null means href attribute is not there
        		System.out.println("Not possible to check");
        		continue;
        	}
        	//send url to server
        	try {
        	URL linkofurl= new URL(hrefvalue); // Converted Href value from string to URL format
        	HttpURLConnection connection=(HttpURLConnection)linkofurl.openConnection(); //open connection to server
        	connection.connect(); // connect to server and send request to it
        	connection.getResponseCode();
        	if(connection.getResponseCode()>=400) {
        		System.out.println(hrefvalue+" is a broken link");
        		noOfBrokenLinks++;  //Count number of broken links
        	}
        	else {
        		System.out.println(hrefvalue+" is not a broken link");
        	}
            } 
        	catch(Exception e){
        		
        	}
        }
    	System.out.println("The number of broken links are: "+ noOfBrokenLinks); //41
	}

}
