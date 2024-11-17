package day20;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingstaticdataintoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       // Creating new excel file
	   FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\Testdatafolder\\Datatoinput.xlsx"); //Datatoinput is the name of the file
	   XSSFWorkbook workbook= new XSSFWorkbook();
	   XSSFSheet sheet= workbook.createSheet("Info"); //Info is the name of the sheet
	   //Creating rows and their cells
	   XSSFRow firstrow=sheet.createRow(0);
	   firstrow.createCell(0).setCellValue("Welcome");
	   firstrow.createCell(1).setCellValue("to");
	   firstrow.createCell(2).setCellValue("Selenium");
	   
	   XSSFRow secondrow=sheet.createRow(1);
	   secondrow.createCell(0).setCellValue("Automation");
	   secondrow.createCell(1).setCellValue("Testing");
	   secondrow.createCell(2).setCellValue("Lessons");
	   
	   XSSFRow thirdrow=sheet.createRow(2);
	   thirdrow.createCell(0).setCellValue("My");
	   thirdrow.createCell(1).setCellValue("Name is");
	   thirdrow.createCell(2).setCellValue("Andrew");
	   
	   workbook.write(file); //Attach workbook to file
	   workbook.close();
	   file.close();
	   System.out.println("File created");
	}

}
