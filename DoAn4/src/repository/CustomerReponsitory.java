package repository;
import entity.Customer;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomerReponsitory {

    /*public void writeExcel() throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("CustomerSheet");
        int rowCount =0;
        Row firstRow = sheet.createRow(rowCount++);
        Cell firstCell = firstRow.createCell(0);
        firstCell.setCellValue("stt");
        firstRow.createCell(1).setCellValue("name");
        firstRow.createCell(2).setCellValue("email");
        firstRow.createCell(3).setCellValue("password");
        firstRow.createCell(4).setCellValue("phone");
        firstRow.createCell(5).setCellValue("address");

        for (Customer customer : customers) {
            Row row = sheet.createRow(rowCount++);
            Cell cell1 = row.createCell(0);
            cell1.setCellValue(customer.getId());
            Cell cell2 = row.createCell(1);
            cell2.setCellValue(customer.getUserName());
            Cell cell3 = row.createCell(2);
            cell3.setCellValue(customer.getEmail());
            Cell cell4 = row.createCell(3);
            cell4.setCellValue(customer.getPassword());
            Cell cell5 = row.createCell(4);
            cell5.setCellValue(customer.getPhoneNumber());
            Cell cell6 = row.createCell(5);
            cell6.setCellValue(customer.getAddress());
        }
        FileOutputStream fos = new FileOutputStream("userData.xlsx");
        workbook.write(fos);
        workbook.close();
    }*/

   /* public void readExcel(ArrayList<Customer> customers) throws IOException {
        FileInputStream excel = new FileInputStream(new File("userData.xlsx"));
        Workbook workbook = new XSSFWorkbook(excel);
        Sheet sheet = workbook.getSheet("CustomerSheet");
        Iterator<Row> iterator = sheet.iterator();
        Row firstRow = iterator.next();
        while (iterator.hasNext()){
            Row currentRow = iterator.next();
            Customer customer = new Customer((int) currentRow.getCell(0).getNumericCellValue(),
                    currentRow.getCell(1).getStringCellValue(),currentRow.getCell(2).getStringCellValue(),
                    currentRow.getCell(3).getStringCellValue(),currentRow.getCell(4).getStringCellValue(),
                    currentRow.getCell(5).getStringCellValue());
            customers.add(customer);
            workbook.close();
            excel.close();
        }
    }

    public void importCustomer(ArrayList<Customer> customers){
        try {
            *//*customers.add(new Customer(1,"phungphu","phungphu2092@gmail.com","Phu2092@","0358909973","Hải Dương"));
            customers.add(new Customer(2,"phungphu2","phungphu20920@gmail.com","Phu2092@","0986754256","Hà Nội"));*//*
            readExcel(customers);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }*/
}
