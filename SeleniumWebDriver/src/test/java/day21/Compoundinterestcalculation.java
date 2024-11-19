package day21;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Compoundinterestcalculation {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver cd= new ChromeDriver();
       cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       cd.get("https://www.investor.gov/financial-tools-calculators/calculators/compound-interest-calculator");
       cd.manage().window().maximize();
       
       String xlfilepath=System.getProperty("user.dir")+ "\\Testdatafolder\\Compound interest data.xlsx";
       String xlsheet= "Sheet1";
       
       int rows=Exceltestingutilityfile.getRowCount(xlfilepath,xlsheet);	
       for(int i=1; i<=rows; i++) {
    	   //read data from excel
    	  String initial= Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,0); 
    	  String mcontribution= Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,1);
    	  String years= Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,2);
    	  String intrate=Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,3);
    	  String frequency=Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,4);
    	  String totamt=Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,5);
    	  String expectedamt=Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,6);
    	  String result=Exceltestingutilityfile.getCellData(xlfilepath,xlsheet,i,7);
    	  
    	  
    	  //pass data into application
    	  cd.findElement(By.xpath("//*[@id=\"edit-principal\"]")).sendKeys(initial);
    	  cd.findElement(By.xpath("//*[@id=\"edit-addition\"]")).sendKeys(mcontribution);
    	  cd.findElement(By.xpath("//*[@id=\"edit-num-years\"]")).sendKeys(years);
    	  cd.findElement(By.xpath("//*[@id=\"edit-interest-rate\"]")).sendKeys(intrate);
    	  Select cfreq= new Select(cd.findElement(By.xpath("//*[@id=\"edit-compound-interest\"]")));
    	  cfreq.selectByVisibleText(frequency);
    	  cd.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click(); //clicking submit button

    	  //Validation
    	 WebElement reflectedamt=cd.findElement(By.xpath("//*[@id=\"results_container\"]/div/h3/span[2]"));
    	 JavascriptExecutor js=(JavascriptExecutor)cd;
    	 js.executeScript("arguments[0].scrollIntoView();",reflectedamt);
    	  if(reflectedamt.toString().equals(totamt)) {
    		  System.out.println("Test passed");
    		  Exceltestingutilityfile.setCellData(xlfilepath, xlsheet, i, 8,"Passed");
    	  }
    	  else {
    		  System.out.println("Test failed");
    		  Exceltestingutilityfile.setCellData(xlfilepath, xlsheet, i, 8,"Failed");
    	  }
    	  cd.findElement(By.xpath("//*[@id=\"edit-reset\"]")).click();
       }
	}

}
