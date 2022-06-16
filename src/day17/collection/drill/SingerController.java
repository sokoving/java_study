package day17.collection.drill;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SingerController {

    //key는 가수명을 사용
    private final Map<String, Singer> singerMap;

    public SingerController() {
        singerMap = new HashMap<>();
    }

    // 등록된 가수 수를 리턴하는 메서드
    public int howManySinger(){
        return singerMap.size();
    }

    // 가수의 노래를 리턴하는 메서드
    public HashSet<String> songInform(String singer){
        HashSet<String> songs = singerMap.get(singer).getSongs();
        return songs;
    }

    // 가수가 있는지 확인하는 메서드
    public boolean haveSinger(String singer){
        return singerMap.containsKey(singer);
    }

// 맵에 가수와 노래 이름을 추가하는 메서드
    // 새 가수와 노래를 추가하는 메서드
    public void putNewData(String singer, String song) {
        if (!singerMap.containsKey(singer)) {
            Singer newSinger = new Singer(singer, song);
            singerMap.put(singer, newSinger);
        // 있는 가수에 노래 추가
        }
    }
// 있는 가수에 새 노래 추가하는 메서드
    public boolean putData(String singer, String song){
        return singerMap.get(singer).addSongs(song);
    }

}