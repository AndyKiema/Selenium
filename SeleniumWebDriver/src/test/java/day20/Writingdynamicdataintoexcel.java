package day20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdynamicdataintoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\Testdatafolder\\Dynamicdatatoinput.xlsx"); //Datatoinput is the name of the file
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Dynamic Info"); //Info is the name of the sheet
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rows?");
		int noofrows=sc.nextInt();
		
		System.out.println("How many cells?");
		int noofcells=sc.nextInt();
		
		for(int r=0; r<=noofrows; r++) {
			XSSFRow targetrow=sheet.createRow(r);
			for(int c=0; c<noofcells; c++) {
				XSSFCell targetcell=targetrow.createCell(c);
				targetcell.setCellValue(sc.next()); //sc.next() accommodates all types of values
			}
		}
		workbook.write(file); //Attach workbook to file
		workbook.close();
		file.close();
		
	}

}
