package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_All_Data_In_Row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\\\\\\\Velocity class\\\\\\\\selenium\\\\\\\\New Microsoft Excel Worksheet.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
	
	int col=sh.getRow(0).getLastCellNum();  //use for finding last index of colum
	
	//for printing all data in row we use for loop and loop run for colum becoz row no.is constant but col no.change
	//always take for loop for changing number
	for(int i=0;i<=col;i++)
	{
		String value=sh.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+" ");
	}
	
	
	
	
	}

}
