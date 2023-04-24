package handle;

import entity.Member;

import java.util.Scanner;

public class MemberHandle {
    public Member inputMember(Scanner sc){
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dob = sc.nextLine();
        System.out.println("Nhập nghề nghiệp:");
        String job = sc.nextLine();
        return new Member(name,dob,job);
    }
}
