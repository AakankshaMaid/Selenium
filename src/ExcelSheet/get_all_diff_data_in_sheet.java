package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_all_diff_data_in_sheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
		int lastindexrw=sh.getLastRowNum();
		int lastindexcol=sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastindexrw;i++)  //row
		{
		  for(int j=0;j<=lastindexcol;j++)
		  {
			  Cell cellinfo=sh.getRow(i).getCell(j);
			 CellType s1= cellinfo.getCellType();
			 
			 if(s1==CellType.STRING)
			 {
				String value= cellinfo.getStringCellValue();
				System.out.print(value+" ");
			 }
			 else if(s1==CellType.NUMERIC)
			 {
				 double value=cellinfo.getNumericCellValue();
				 System.out.print(value+" ");
			 }
			 else if(s1==CellType.BOOLEAN)
			 {
				 boolean value=cellinfo.getBooleanCellValue();
				 System.out.print(value+" ");
			 }
			 
		  }		
			System.out.println();
		}
	}

}
