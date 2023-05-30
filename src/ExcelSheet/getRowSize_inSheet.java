package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowSize_inSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\\\\\\\Velocity class\\\\\\\\selenium\\\\\\\\New Microsoft Excel Worksheet.xlsx");
		
		//                                                       this method shows index num so we add +1 for full size
	   int rwSize= WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1; 
	   
	   
	   System.out.println(rwSize);
	   
	
	}
	

}
