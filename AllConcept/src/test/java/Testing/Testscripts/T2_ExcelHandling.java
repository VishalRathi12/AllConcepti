package Testing.Testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Pkg1.XLSXAssignemtReadToWrite;

public class T2_ExcelHandling {
	
	

	 void readtoWriteFileMethod() throws IOException
	{
		
		
		File f = new File("C:\\Users\\pc\\Documents\\PractiseOne.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xs = new XSSFWorkbook(fi);
		XSSFSheet xt = xs.getSheet("Sheet1");
		int r = xt.getPhysicalNumberOfRows();
		
		
		File f1 = new File("C:\\Users\\pc\\Documents\\KJJJJJJJJ.xlsx");
		FileOutputStream fo = new FileOutputStream(f1);
		XSSFWorkbook xs1 = new XSSFWorkbook();
		XSSFSheet xt1 = xs1.createSheet("Sheet1");
		
	
		
		for(int i=0;i<r;i++)
		{
			XSSFRow xr = xt.getRow(i);
			
			XSSFRow xr1 = xt1.createRow(i);
			
			int c= xr.getPhysicalNumberOfCells();
			for(int j =0;j<c;j++)
			{
				XSSFCell xc = xr.getCell(j);
				System.out.println(xc.getStringCellValue());
				
				XSSFCell xc1 = xr1.createCell(j);
				xc1.setCellValue(xc.getStringCellValue());
				
				
			}
		}
		
		 xs.write(fo); //will move data to Output stream
		 fo.flush();//will move data  to the file
		 fo.close();
		
	}
	
	


		
		
	
	
	public static void main(String[] args) throws IOException {
		
	//----------------------Excel HAndling Inpiut Stream --------------------------------------	
		

		File f = new File("C:\\Users\\pc\\Documents\\PractiseOne.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xs = new XSSFWorkbook(fi);
		XSSFSheet xt = xs.getSheet("Sheet1");
		int r = xt.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			XSSFRow xr = xt.getRow(i);
			int c= xr.getPhysicalNumberOfCells();
			for(int j =0;j<c;j++)
			{
				XSSFCell xc = xr.getCell(j);
				System.out.println(xc.getStringCellValue());
				
				
			}
		}
		
	//---------------Excel Read To Write------------------------------------------------------------------------------------------
		
		
		
		
		XLSXAssignemtReadToWrite obj1 = new XLSXAssignemtReadToWrite();
		obj1.readtoWriteFileMethod();
		
		
		
		
		//------------------Excel file mai se input value ko lena
		
		{
			File f = new File("C:\\Users\\pc\\Documents\\PractiseOne.xlsx");
			FileInputStream fi = new FileInputStream(f);
			XSSFWorkbook xs = new XSSFWorkbook(fi);
			XSSFSheet xt = xs.getSheet("Sheet1");
			int r = xt.getPhysicalNumberOfRows();
			for(int i=0;i<r;i++)
			{
				XSSFRow xr = xt.getRow(i);
				int c= xr.getPhysicalNumberOfCells();
				for(int j =0;j<c;j++)
				{
					XSSFCell xc = xr.getCell(j);
					System.out.println(xc.getStringCellValue());
				}
			}
			
		//------------------------excel out stream value set krni hoti hai cell ke ander ------------------- -------------
			
			

			File f = new File("C:\\Users\\pc\\Documents\\PractiseOne.xlsx");
			FileOutputStream fo = new FileOutputStream(f);
			XSSFWorkbook xs = new XSSFWorkbook();
			XSSFSheet xt = xs.createSheet("Sheet1");
			
			
			for(int i=0;i<5;i++)
			{
				XSSFRow xr = xt.createRow(i);
				for(int j =0;j<5;j++)
				{
					XSSFCell xc = xr.createCell(j);
					xc.setCellValue("Vishal");
				}
			}
			
	 xs.write(fo); //will move data to Output stream
	 fo.flush();//will move data  to the file
	 fo.close();
	 
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
