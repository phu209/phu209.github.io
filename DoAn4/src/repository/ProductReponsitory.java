package repository;
import entity.Product;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductReponsitory {
    public void readProduct(ArrayList<Product> products) throws IOException {
        FileInputStream excel = new FileInputStream(new File("productData.xlsx"));
        Workbook workbook = new XSSFWorkbook(excel);
        Sheet sheet = workbook.getSheet("product");
        Iterator<Row> iterator = sheet.iterator();
        Row firstRow = iterator.next();
        while (iterator.hasNext()){
            Row currentRow = iterator.next();
            Product product = new Product((int) currentRow.getCell(0).getNumericCellValue(),
                    currentRow.getCell(1).getStringCellValue(),currentRow.getCell(2).getStringCellValue(),
                    currentRow.getCell(3).getStringCellValue(), (int) currentRow.getCell(4).getNumericCellValue(),
                    (int) currentRow.getCell(5).getNumericCellValue());
            products.add(product);
            workbook.close();
            excel.close();
        }
    }

    public void importProduct(ArrayList<Product> products) {
        try{
            readProduct(products);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printProduct(ArrayList<Product> products) {
        importProduct(products);
        System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("\t %-10s %-50s %-42s %-15s %-15s %-5s","ID","Điện thoại","Mô tả","Hãng","Số lượng","Giá\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Product product : products){
            System.out.println(product);
        }
    }
}
