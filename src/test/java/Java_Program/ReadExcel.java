package Java_Program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream inputStream = new FileInputStream("C:\\Users\\nikit\\eclipse-workspace\\SeleniumPractice\\TestData\\MyStoreTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet= workBook.getSheetAt(0);
		
		int row=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<=row;i++)
		{
			int cell=sheet.getRow(i).getLastCellNum();
			System.out.println("Row "+i+" data is");
			
			for(int j=0;j<cell;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
	
			}
			
			System.out.println();
		}
	
		

	}

}
