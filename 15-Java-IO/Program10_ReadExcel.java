import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Program10_ReadExcel {

    public static void main(String[] args) {

        try (FileInputStream input =
                     new FileInputStream("input.xlsx");
             Workbook workbook = WorkbookFactory.create(input)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {

                for (Cell cell : row) {

                    System.out.print(cell.toString() + "\t");
                }

                System.out.println();
            }

        } catch (IOException e) {

            System.out.println("Error reading Excel file: "
                    + e.getMessage());

        } catch (Exception e) {

            System.out.println("Error processing Excel file: "
                    + e.getMessage());
        }
    }
}