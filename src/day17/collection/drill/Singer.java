package day17.collection.drill;


import java.util.HashSet;

// 가수 클래스
public class Singer {

    private String name; //가수명
    HashSet<String> songs; // 노래 목록


    public Singer(String name, String song) {
        this.name = name;
        this.songs =  new HashSet<>();
        addSongs(song);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<String> getSongs() {
        return songs;
    }

    public boolean addSongs(String songTitle) {
        return songs.add(songTitle);
    }

}
