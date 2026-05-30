package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static Workbook workbook;

    static Sheet sheet;

    public ExcelUtils(String path,
                      String sheetName) {

        try {

            FileInputStream fis =
                    new FileInputStream(path);

            workbook =
                    new XSSFWorkbook(fis);

            sheet =
                    workbook.getSheet(sheetName);

        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }

    public int getRowCount() {

        return sheet.getPhysicalNumberOfRows();
    }

    public String getCellData(int row,
                              int col) {

        return sheet.getRow(row)
                .getCell(col)
                .toString();
    }
}