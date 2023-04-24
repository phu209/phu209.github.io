package handle;
import entity.Bill;
import entity.HouseHold;
import java.util.Scanner;

public class BillHandle {
    public Bill inputBill(Scanner sc) {
        HouseHoldHandle houseHoldHandle = new HouseHoldHandle();
        System.out.println("Mời nhập thông tin hộ sử dụng điện: ");
        HouseHold houseHold = houseHoldHandle.inputHouseHold(sc);
        System.out.println("Mời bạn nhập số điện cũ: ");
        int oldNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập số điện mới: ");
        int newNumber = Integer.parseInt(sc.nextLine());
        return new Bill(houseHold,oldNumber,newNumber);
    }
}
