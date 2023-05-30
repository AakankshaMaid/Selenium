package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get_All_StringData_InSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\\\\\\\\\\\\\\\Velocity class\\\\\\\\\\\\\\\\selenium\\\\\\\\\\\\\\\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2"); //for navigate sheet
		
		int rw=sh.getLastRowNum();//for last index of row
		
	 
		
		
			for(int i=0;i<=rw;i++)
			{
				int col=sh.getRow(i).getLastCellNum()-1;
				for(int j=0;j<=col;j++)
				{
					String value=sh.getRow(i).getCell(j).getStringCellValue();
				     System.out.print(value+" ");
				}
				
			
			System.out.println();
		}
		
		

       
        	
        	
        

		
		
	}

}
