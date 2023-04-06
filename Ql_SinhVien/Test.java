package Ql_SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập tên sinh viên: ");
        String name = sc.nextLine();
        boolean checkStop = false;
        do {
            System.out.println("Mời bạn chọn: ");
            System.out.println("\t"+"1.Sinh viên TechMaster");
            System.out.println("\t"+"2.Sinh viên IT");
            System.out.println("\t"+"3.Sinh viên Biz");
            System.out.println("\t"+"4.Exit");
            System.out.println("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập ngành học: ");
                    String major = sc.nextLine();
                    System.out.println("Mời nhập điểm: ");
                    double point = Double.parseDouble(sc.nextLine());
                    SinhVienTechMaster svTechMaster = new SinhVienTechMaster(name,major,point);
                    svTechMaster.print();
                    break;
                case 2:
                    System.out.println("Mời nhập điểm Java: ");
                    double pointJava = Double.parseDouble(sc.nextLine());
                    System.out.println("Mời nhập điểm Html: ");
                    double pointHtml = Double.parseDouble(sc.nextLine());
                    System.out.println("Mời nhập điểm Css: ");
                    double pointCss = Double.parseDouble(sc.nextLine());
                    SvIT svIT = new SvIT(name,pointJava,pointHtml,pointCss);
                    svIT.print();
                    break;
                case 3:
                    System.out.println("Mời nhập điểm Marketting: ");
                    double pointMarketting = Double.parseDouble(sc.nextLine());
                    System.out.println("Mời nhập điểm Sales: ");
                    double pointSales = Double.parseDouble(sc.nextLine());
                    SvBiz svBiz = new SvBiz(name,pointMarketting,pointSales);
                    svBiz.print();
                    break;
                case 4:
                    checkStop = true;
                    System.out.println("Tạm biệt");
                    break;
            }
        }while (checkStop);
    }
}
