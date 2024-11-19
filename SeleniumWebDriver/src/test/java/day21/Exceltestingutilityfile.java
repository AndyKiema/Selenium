package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltestingutilityfile {
    //Create static methods and variables
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet st;
	public static XSSFRow rw;
	public static XSSFCell cl;
	public static CellStyle style;
	
	public static int getRowCount(String xlfilepath, String xlsheet) throws IOException {
		fi= new FileInputStream(xlfilepath);
		wb= new XSSFWorkbook(fi);
		st=wb.getSheet(xlsheet);
		int rownum=st.getLastRowNum();
		wb.close();
		fi.close();
		return rownum;
	}
	
	public static int getCellCount(String xlfilepath, String xlsheet, int rownum) throws IOException {
		fi=new FileInputStream(xlfilepath);
		wb= new XSSFWorkbook(fi);
		st=wb.getSheet(xlsheet);
		rw=st.getRow(rownum);
		int cellno=rw.getLastCellNum();
		wb.close();
		fi.close();
		return cellno;
	}
	
	public static String getCellData(String xlfilepath, String xlsheet, int rownum, int cellnum) throws IOException {
		fi= new FileInputStream(xlfilepath);
		wb= new XSSFWorkbook(fi);
		st=wb.getSheet(xlsheet);
		rw=st.getRow(rownum);
		cl=rw.getCell(cellnum);
		String data= cl.toString();
		wb.close();
		fi.close();
		return data;
	}
	
	public static String setCellData(String xlfilepath, String xlsheet, int rownum, int cellnum, String value) throws IOException {
		fi= new FileInputStream(xlfilepath);
		wb= new XSSFWorkbook(fi);
		st=wb.getSheet(xlsheet);
		rw=st.getRow(rownum);
		
		cl=rw.createCell(cellnum);
		cl.setCellValue(value);
		fo= new FileOutputStream(xlfilepath);
		wb.write(fo);
		wb.close();
		fo.close();
		
	}
}
