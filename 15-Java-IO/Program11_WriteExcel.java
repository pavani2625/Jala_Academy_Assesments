import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program11_WriteExcel {

    public static void main(String[] args) {

        try (Workbook workbook = new XSSFWorkbook()) {

            Sheet sheet = workbook.createSheet("Students");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Name");
            header.createCell(1).setCellValue("Course");
            header.createCell(2).setCellValue("City");

            Row row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Razeena");
            row1.createCell(1).setCellValue("Java Full Stack");
            row1.createCell(2).setCellValue("Hyderabad");

            Row row2 = sheet.createRow(2);
            row2.createCell(0).setCellValue("Student2");
            row2.createCell(1).setCellValue("Java");
            row2.createCell(2).setCellValue("Hyderabad");

            try (FileOutputStream output =
                         new FileOutputStream("output.xlsx")) {

                workbook.write(output);
            }

            System.out.println("Excel file written successfully");

        } catch (IOException e) {

            System.out.println("Error writing Excel file: "
                    + e.getMessage());
        }
    }
}