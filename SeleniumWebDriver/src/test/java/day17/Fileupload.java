package day17;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        cd.manage().window().maximize();
        //cd.findElement(By.xpath("//*[@id=\"filesToUpload\"]")).sendKeys("C:\\Users\\ADMIN\\Desktop\\Andrew\\Image\\Abstract class vs Interface.jpg");
        WebElement nameoffileuploaded= cd.findElement(By.xpath("//*[@id=\"fileList\"]/li"));
        /*(if(nameoffileuploaded.getText().equals("Abstract class vs Interface.jpg")) {
        	System.out.println("Name captured correctly");
        }*/
        //uploading multiple files
        String file1= "C:\\Users\\ADMIN\\Desktop\\Andrew\\Image\\Abstract class vs Interface.jpg";
        String file2="C:\\Users\\ADMIN\\Desktop\\Andrew\\Image\\3rd Last Page.jpg";
        cd.findElement(By.xpath("//*[@id=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);
        List<WebElement>namesoffileuploaded= cd.findElements(By.xpath("//*[@id=\"fileList\"]/li"));
        if(namesoffileuploaded.size()==2) {
        	System.out.println("All files uploaded");
        }
        else {
        	System.out.println("Not all files uploaded");
        }
        WebElement firstfilename=cd.findElement(By.xpath("//*[@id=\"fileList\"]/li[1]"));
        WebElement secondfilename=cd.findElement(By.xpath("//*[@id=\"fileList\"]/li[2]"));
        if(firstfilename.getText().equals("Abstract class vs Interface.jpg") && secondfilename.getText().equals("3rd Last Page.jpg")) {
        	System.out.println("All names are accurate");
        }
        else {
        	System.out.println("Some names are wrong");
        }
	}

}
