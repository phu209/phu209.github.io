package entity;

import java.util.ArrayList;

public class TikTok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;

    public TikTok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
