package day20;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdatatospecificcell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\Testdatafolder\\Specific.xlsx"); //Specific is the name of the file
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Specific cell"); //Specific cell is the name of the sheet
		XSSFRow row=sheet.createRow(2);
		XSSFCell cell=row.createCell(2);
		cell.setCellValue("Code");
		workbook.write(file); //Attach workbook to file
		workbook.close();
		file.close();
	}

}
