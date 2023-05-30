package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_All_Data_In_Col {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\\\\\\\\\\\\\\\Velocity class\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int rw=sh.getLastRowNum();
		
		for(int i=0;i<=rw;i++)
		{
			String value=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value+" ");
		}
	}

}
