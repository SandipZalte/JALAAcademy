package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getdata(String name, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");

//		File path= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx");
//		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return value;

	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String s1=getdata("login",1,0);
		System.out.println(s1);
		String s2=getdata("login",1,1);
		System.out.println(s2);
	}
	

}
