package handle;

import entity.Follower;
import entity.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolHandle {
    public Idol inputIdol(Scanner sc) {
        System.out.println("Nhập tên idol: ");
        String name = sc.nextLine();
        System.out.println("Nhập địa chỉ email: ");
        String email = sc.nextLine();
        System.out.println("Nhập tên Group: ");
        String group = sc.nextLine();

        System.out.println("Bạn muốn tạo ra bn followers?");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Follower> followers = new ArrayList<>();
        FollowerHandle followerHandle = new FollowerHandle();
        for (int i = 0; i < n; i++) {
            Follower follower = followerHandle.inputFollower(sc);
            followers.add(follower);
        }
        return new Idol(followers,name,email,group);
    }
}
