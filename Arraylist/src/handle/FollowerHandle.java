package handle;

import entity.Follower;

import java.util.Scanner;

public class FollowerHandle {
    public Follower inputFollower(Scanner sc) {
        System.out.println("Nhập tên follower: ");
        String name = sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập Number of like: ");
        int numberOfLike = Integer.parseInt(sc.nextLine());
        return new Follower(name, email, numberOfLike);
    }
}
