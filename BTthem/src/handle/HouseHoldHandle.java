package handle;
import entity.HouseHold;
import java.util.Scanner;

public class HouseHoldHandle {
    public HouseHold inputHouseHold(Scanner sc){
        System.out.println("Mời bạn nhập họ tên chủ hộ: ");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập số nhà: ");
        int address = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập mã số công tơ: ");
        int maCongTo = Integer.parseInt(sc.nextLine());
        return new HouseHold(name,address,maCongTo);
    }
}
