package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class excelProvider extends Abstractdp  {
	
	static XSSFWorkbook workbook;
	public static XSSFRow row;
	public static XSSFSheet sheet;
    public static	int rowsize=0;
	public static int columnsize=0;
		
		public static String[][] getAllSheetData(String sheetName) {

			String[][] data = null;

			try {
				File src=new File("./data/"+sheetName+".xlsx");
				FileInputStream fis = new FileInputStream(src);
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(0);	

				// get the number of rows
				int rowCount = sheet.getLastRowNum();

				// get the number of columns
				int columnCount = sheet.getRow(0).getLastCellNum();
				data = new String[rowCount][columnCount];


				// loop through the rows
				for(int i=1; i <rowCount+1; i++){
					try {
						XSSFRow row = sheet.getRow(i);
						for(int j=0; j <columnCount; j++){ // loop through the columns
							try {
								String cellValue = "";
								try{
									if(row.getCell(j).getCellType() == 1)
										cellValue = row.getCell(j).getStringCellValue();
									else if(row.getCell(j).getCellType() == 0)
										cellValue = ""+row.getCell(j).getNumericCellValue();
									

								}catch(NullPointerException e){

								}

								data[i-1][j]  = cellValue; // add to the data array
							} catch (Exception e) {
	 							e.printStackTrace();
							}				
						}

					} catch (Exception e) {
	 					e.printStackTrace();
					}
				}
				//fis.close();
				workbook.close();
			} catch (Exception e) {
	 			e.printStackTrace();
			}

			return data;

			
			
		}





	}




     