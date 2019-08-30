package exclefacebook;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcleFilereader {

    HSSFWorkbook workbook;
    HSSFSheet sheet;


    public String[] getExcelData(String path, int sheetIndex) {

        String[] data = {};

        try {
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            workbook = new HSSFWorkbook(fis);
            sheet = workbook.getSheetAt(sheetIndex);
            int numberOfRows = sheet.getLastRowNum()+1;
            int numberOfColumns = sheet.getRow(0).getLastCellNum();
            data = new String[numberOfRows-1];

            for (int i = 1; i < numberOfRows; i++) {
                HSSFRow row = sheet.getRow(i);
                for (int j = 0; j < numberOfColumns; j++) {
                    HSSFCell cell = row.getCell(j);
                    data[i-1]  = cell.getStringCellValue();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
