import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Câu 1: Viết chương trình thực hiện công việc:

        Nhập vào từ bàn phím họ và tên bạn
        Thực hiện chuẩn hóa chuỗi vừa nhập.
        */
        System.out.println("Nhập họ và tên của bạn: ");
        String name = sc.nextLine();
        name = name.trim();
        String[] words = name.split("\\s+");
        System.out.print("Họ và tên: ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
            System.out.print(words[i]+ "\s");
        }
        System.out.println();

        /*
        Câu 2: Viết chương trình thực hiện:

        Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
        Nhập các phần tử mảng
        In mảng ra màn hình
        Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
        VD: [1,4,7,6,2,3] -> [1,5,7,7,3,3]
        */

        System.out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị thứ "+(i+1)+ " : ");
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa tạo ra là: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                array[i]+=1;
            }
        }
        System.out.println("Mảng các phần tử chẵn tăng lên 1 phần tử là: ");
        System.out.println(Arrays.toString(array));

        /*
        Câu 3: Cho phép nhập số lượng mảng bất kỳ

        Tìm số lớn nhất trong mảng
        Tìm số nhỏ nhất trong mảng
        */

        System.out.println("Nhập số phần tử của mảng: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập giá trị thứ "+(i+1)+ " : ");
            array1[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa tạo ra là: ");
        System.out.println(Arrays.toString(array1));

        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println("Phần tử lớn nhất: "+max);

        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất: "+min);

    }
}