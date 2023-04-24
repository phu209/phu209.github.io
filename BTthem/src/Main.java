import entity.Bill;
import handle.BillHandle;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillHandle billHandle = new BillHandle();
        System.out.println("Bạn mới nhập TT của bao nhiêu hộ dân: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> bills = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Bill bill = billHandle.inputBill(sc);
            bills.add(bill);
        }

        System.out.println(bills);
    }
}