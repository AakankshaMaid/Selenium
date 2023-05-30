package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
	
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastindex=sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastindex;i++)
		{
			Cell cellinfo=sh.getRow(0).getCell(i);
			CellType s1=cellinfo.getCellType();
			if(s1==CellType.STRING)
			{
				String value=cellinfo.getStringCellValue();
				System.out.println(value);
				
			}
			else if(s1==CellType.NUMERIC)
			{
				double value=cellinfo.getNumericCellValue();
				System.out.println(value);
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value=cellinfo.getBooleanCellValue();
				System.out.println(value);
			}
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
