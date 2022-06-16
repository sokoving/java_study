package day17.collection.song.model.vo;

import java.util.*;

public class Artist {

    private String name; // 가수명
    private List<String> songs; // 노래 목록


    public Artist(String name, List<String> songs) {
        this.name = name;
        this.songs = songs;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
