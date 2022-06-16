package day17.collection.map;

import java.util.*;

class Student {
    String name; // 이름
    int grade; //학년

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s(%d학년)",name, grade);
    }
}

public class MapExample {
    public static void main(String[] args) {

        // public interface Map<K, V>
        // 제너릭 타입 K : key  // 제너릭 타입 V : Value
        // 키와 값을 묶어 엔트리라고 부른다(js의 프로퍼티와 비슷)
        Map<String, Student> map = new HashMap<>();

        // put(k, v) : 데이터 추가
        map.put("짹짹이", new Student("최승철", 5));
        map.put("냥냥이", new Student("이지훈", 4));
        map.put("멍멍이", new Student("최한솔", 2));

        System.out.println("map의 size : " + map.size()); // 3
        System.out.println("map의 toString : " + map);
        
        // put(k, v) : 데이터 수정 (중복된 key 객체로 put을 하면 value가 수정된다)
        map.put("냥냥이", new Student("이순영", 4));
        System.out.println("동일 key에 push하면 value가 수정됨 : " + map);

        // get(key) : 저장된 value 참조
        Student stu = map.get("냥냥이");
        System.out.println("stu = " + stu);
        
        stu.name = "서명호";  // stu와 map의 냥냥이는 같은 주소
        System.out.println(map.get("냥냥이"));
        
        // containsKey(key) : map에 key가 있는지 유무 확인
        System.out.println(map.containsKey("꽉꽉이"));
        System.out.println(map.containsKey("냥냥이"));

        // map 루프 처리 (map이 아닌, keySet으로 키들을 Set에 담아 iter 돌림)
        Set<String> keySet = map.keySet();//map의 모든 키를 Set에 담아 리턴
        System.out.println("keySet = " + keySet);
        for (String key : keySet) {
            System.out.print(key + " : ");
            System.out.println(map.get(key));
        }

        // remove(key) : key에 해당하는 Entry 삭제
        map.remove("냥냥이");
        System.out.println("remove(key)로 삭제 : " + map);

        map.clear();
        System.out.println("clear()로 전체 삭제 : " + map);

        // 맴의 value값으로 list를 사용하려면
        Map<String, List<Integer>> mapList = new HashMap<>();
        Map<String, Set<Integer>> mapList2 = new HashMap<>();

    }
}
