package day15.inter;

// 인터페이스 : 객체의 규격(기능)을 표준화해서 명세하는 역할
public interface Pet {

    // 인터페이스는 객체화될 수 없다
    //  >> 인스턴스 필드와 메서드 못 씀
    //  >> 필드 선언하면 자동으로 public static final를 붙여 상수로 만들고
    //  >> 메서드에는 자동으로 abstract를 붙여 추상 메서드로 만든다.
    //  >>>> 상수와 추상메서드만 선언 가능

    public static final String PLAY_GROUND = "애완동물 카페"; // 애동이 노는 데

    public abstract void play();        // 애동이 노는 기능

}
