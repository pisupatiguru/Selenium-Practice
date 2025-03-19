package com.hclpages.utilities;


import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

    public static Map<String, String> getTestData(String filePath, String sheetName, int rowNum) {
        Map<String, String> testData = new HashMap<>();

        try (FileInputStream file = new FileInputStream(new File(filePath));
             Workbook workbook = WorkbookFactory.create(file)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet '" + sheetName + "' not found.");
            }

            Row headerRow = sheet.getRow(0);
            Row dataRow = sheet.getRow(rowNum);

            if (dataRow == null) {
                throw new IllegalArgumentException("Row " + rowNum + " not found.");
            }

            for (Cell headerCell : headerRow) {
                String header = headerCell.getStringCellValue();
                Cell dataCell = dataRow.getCell(headerCell.getColumnIndex());

                if (dataCell != null) {
                    switch (dataCell.getCellType()) {
                        case STRING:
                            testData.put(header, dataCell.getStringCellValue());
                            break;
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(dataCell)) {
                                testData.put(header, dataCell.getDateCellValue().toString());
                            } else {
                                testData.put(header, String.valueOf(dataCell.getNumericCellValue()));
                            }
                            break;
                        case BOOLEAN:
                            testData.put(header, String.valueOf(dataCell.getBooleanCellValue()));
                            break;
                        default:
                            testData.put(header, ""); // Handle other cell types as needed
                    }
                } else {
                    testData.put(header, ""); // Empty cell
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return testData;
    }
}