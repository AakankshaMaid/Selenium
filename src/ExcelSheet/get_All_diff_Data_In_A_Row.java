package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_All_diff_Data_In_A_Row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\\\\\\\Velocity class\\\\\\\\selenium\\\\\\\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int c=sh.getRow(0).getLastCellNum()-1;  //last index of cells
		
		for(int i=0;i<=c;i++)
		{
		  Cell cellInfo=sh.getRow(0).getCell(i);
		  CellType s1=cellInfo.getCellType();
		  
		  if(s1==CellType.STRING)
		  {
			  String value=cellInfo.getStringCellValue();
			  System.out.print(value+" ");
		  }
		  else if(s1==CellType.NUMERIC)
		  {
			  double value=cellInfo.getNumericCellValue();
			  System.out.print(value+" ");
			  
		  }
		  else if(s1==CellType.BOOLEAN)
		  {
			  boolean value=cellInfo.getBooleanCellValue();
			  System.out.print(value+" ");
		  }
		}
		
	}

}
