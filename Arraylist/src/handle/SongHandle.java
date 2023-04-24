package handle;

import entity.Song;

import java.util.Scanner;

public class SongHandle {
    public Song inputSong(Scanner sc) {
        System.out.println("Nhập tên bài hát: ");
        String name = sc.nextLine();
        System.out.println("Nhập tên ca sĩ: ");
        String singer = sc.nextLine();
        return new Song(name,singer);
    }
}
