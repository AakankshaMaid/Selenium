package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_Data_By_Verifying_Type_Of_Cell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\\\Velocity class\\\\selenium\\\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet sh =WorkbookFactory.create(file).getSheet("Sheet1");
				Cell c=sh.getRow(0).getCell(3);
				CellType s1=c.getCellType();
		
		if(s1==CellType.STRING)
		{
			String value=c.getStringCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.NUMERIC)
		{
			double value=c.getNumericCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean value=c.getBooleanCellValue();
			System.out.println(value);
		}

		
	}

}
