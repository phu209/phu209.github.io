import entity.*;
import handle.IdolHandle;
import handle.MemberHandle;
import handle.SongHandle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        //Add
        list.add(1);
        list.add(4);
        list.add(6);
        System.out.println(list);

        //get
        System.out.println(list.get(2));

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("P","Q","T"));

        System.out.println(arrayList1.contains("P"));

        //set
        arrayList1.set(0,"A");
        System.out.println(arrayList1);

        //remove
        arrayList1.remove(1);
        System.out.println(arrayList1);

        arrayList1.removeAll(arrayList1);
        System.out.println(arrayList1);*/

        Scanner sc = new Scanner(System.in);
        /*MemberHandle memberHandle = new MemberHandle();
        Member member1 = memberHandle.inputMember(sc);
        Member member2 = memberHandle.inputMember(sc);
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(member1,member2));

        System.out.println("Mời nhập số nhà: ");
        String address = sc.nextLine();
        HouseHole houseHole = new HouseHole(members,address);
        System.out.println(houseHole);*/

        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Idol> idols = new ArrayList<>();

        System.out.println("Mời bạn nhập số bài hát muốn tạo ra: ");
        int numberOfSong = Integer.parseInt(sc.nextLine());

        //Khởi tạo giá trị danh sách cho các bài hát
        SongHandle songHandle = new SongHandle();
        for (int i = 0; i < numberOfSong; i++) {
            Song song = songHandle.inputSong(sc);
            songs.add(song);
        }

        //Khởi tạo danh sách các Idol
        System.out.println("Mời nhập số lượng Idol tạo ra: ");
        int numberOfIdol = Integer.parseInt(sc.nextLine());
        IdolHandle idolHandle = new IdolHandle();
        for (int i = 0; i < numberOfIdol; i++) {
                Idol idol = idolHandle.inputIdol(sc);
                idols.add(idol);
        }

        TikTok tikTok = new TikTok(idols,songs);
        System.out.println(tikTok);
    }
}