package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int col=sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=col;i++)
		{
			Cell cellinfo=sh.getRow(0).getCell(i);
		CellType type=	cellinfo.getCellType();
		if(type==CellType.STRING)
		{
			String value=cellinfo.getStringCellValue();
			System.out.println(value);
		}
		if(type==CellType.NUMERIC)
		{
			double value=cellinfo.getNumericCellValue();
			System.out.println(value);
		}
		if(type==CellType.BOOLEAN)
		{
			boolean value=cellinfo.getBooleanCellValue();
		System.out.println(value);
					
		}
		}
	}

}
