package com.maegen.generic.fileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDataFromExcel(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/data.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 String data=wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		 wb.close();

		 return data;	
	}
	public void getMultipleStringDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("sheetName");
		int rowcount=s.getLastRowNum();
		for(int i=0;i<rowcount;i++) {
			Row r=s.getRow(i);
            if (r == null) continue;
			int cellcount = r.getLastCellNum();
			for(int j=0;j<cellcount;j++) {
				Cell c=r.getCell(j);
				if(c!=null) {
				String data = c.getStringCellValue();
				System.out.print(data+"\t");}
				else {
					System.out.print("null\t");
				}
			}
			System.out.println();
		}
	}
	public int getIntDataFromExcel(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/data.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 int data=(int) wb.getSheet(sheetName).getRow(rownum).getCell(cellnum).getNumericCellValue();
		 wb.close();

		 return data;	
	}
	public int getRow(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/data.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 int rowcount=wb.getSheet(sheetName).getLastRowNum();
		 wb.close();

		 return rowcount;	
	}
	
	public void setDataintoExcel(String sheetName,int rownum,int cellnum,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/data.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 wb.getSheet(sheetName).getRow(rownum).createCell(cellnum);
		 FileOutputStream fos =new  FileOutputStream("./testdata/data.xlsx");
		 wb.write(fos);
		 wb.close();
	}
	

	    /**
	     * Reads multiple rows and columns from an Excel sheet and returns a 2D Object array.
	     * Useful for data-driven testing (e.g., TestNG @DataProvider).
	     *
	     * @param excelPath Path to the Excel file
	     * @param sheetName Sheet from which data is to be read
	     * @return Object[][] containing Excel data
	     * @throws IOException if file not found or inaccessible
	     */
	    public Object[][] readMultipleDataFromExcel(String excelPath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(excelPath);
	        Workbook wb = WorkbookFactory.create(fis);
	        Sheet sheet = wb.getSheet(sheetName);

	        int rowCount = sheet.getLastRowNum(); // Total rows excluding header
	        int colCount = sheet.getRow(0).getLastCellNum(); // Columns count from header row

	        Object[][] data = new Object[rowCount][colCount];

	        for (int i = 1; i <= rowCount; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < colCount; j++) {
	                Cell cell = row.getCell(j);
	                if (cell != null) {
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            data[i - 1][j] = cell.getStringCellValue();
	                            break;
	                        case NUMERIC:
	                            data[i - 1][j] = cell.getNumericCellValue();
	                            break;
	                        case BOOLEAN:
	                            data[i - 1][j] = cell.getBooleanCellValue();
	                            break;
	                        default:
	                            data[i - 1][j] = "";
	                    }
	                } else {
	                    data[i - 1][j] = ""; // if cell is blank
	                }
	            }
	        }

	        wb.close();
	        fis.close();

	        return data;
	    }
	}

	


