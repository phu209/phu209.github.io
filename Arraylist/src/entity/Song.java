package entity;

public class Song {
    private int id;
    private static int autoId;
    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.id = ++autoId;
        this.name = name;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
