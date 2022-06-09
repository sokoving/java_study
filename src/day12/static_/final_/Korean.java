package day12.static_.final_;

public class Korean {
    String name; // 이름
    final String id; // 주민번호
                        // 한번 초기화하면 어디서든 수정 불가(클래스 내부 메서드 포함)
                        // 불변성은 있으나 유일성은 없음(필드에서 초기화 안 하면 생성자에서 초기화할 때 변동 가능)

    // 상수 : 불변성(final)과 유일성(static) 모두 만족해야 상수
    public static final String nation = "대한민국"; // 국적
    // psf > public static final 자동완성

    public Korean(String name, String id){
        this.name = name;
        this.id = id;
    }


    public String toString(){
        return "이름: " + name + ", 주민번호: " + id + ", 국적: " + nation;
    }

/*    // 주민번호를 바꾸는 메서드
    public void changeId(String id){  >> praivate id는 클래스 내부 메서드서 변경 가능하지만
        this.id = id;                    final id는 클래스 내부 메서드서도 변경 불가
    }*/

}
