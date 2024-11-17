package day20;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\Testdatafolder\\Data.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook(file); //Getting workbook
        //workbook.getSheet("Sheet 1"); Getting sheet or:
        XSSFSheet sheet=workbook.getSheetAt(0);
        int noofrows=sheet.getLastRowNum(); //Finds number of rows
        int noofcells=sheet.getRow(1).getLastCellNum(); //Number of cells 
        //System.out.println("Number of rows are " + noofrows);
        //System.out.println("Number of cells are " + noofcells);
        for(int r=0; r<=noofrows; r++) {
        	XSSFRow targetrow= sheet.getRow(r);
        	for(int c=0; c<noofcells; c++) {
        		XSSFCell targetcell=targetrow.getCell(c); //Get cell per row
        		System.out.printf("-%20s", targetcell.toString());
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();
	}

}
