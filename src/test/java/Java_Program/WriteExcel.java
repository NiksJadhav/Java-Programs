package Java_Program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel 
{
	public static void main(String[] args) throws IOException
	{
			FileInputStream fis=new FileInputStream("C:\\Users\\nikit\\OneDrive\\Documents\\DataDrivenTestingFile.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheetAt(0);
			XSSFRow row=sheet.createRow(7);
			row.createCell(0).setCellValue("Nikita");
			row.createCell(1).setCellValue("Jadhav");
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\nikit\\OneDrive\\Documents\\DataDrivenTestingFile.xlsx");
			workbook.write(fos);
			fis.close();
			
			
		
	}

}
