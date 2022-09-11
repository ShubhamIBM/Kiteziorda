package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
public static String getTD(int rowindex,int colindex) throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Documents\\Framework.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;

	
}
}
