package day07;

// class PhoneFactory  : Phon의 실행용 클래스
//    // * 실행용 class에는 main을 만든다 (main: 실행을 담당한다)
public class PhoneFactory {
    public static void main(String[] args) {

        //Phone 객체 생성
        // class Phone을 통해 만들어진 객체의 타입은 Phone(참조 타입)
        Phone galaxy = new Phone();
//      ↑ galaxy 타입       ↑ 기본 생성자 함수 호출

/*  class Phone에서 생성자 함수에서 초기값을 설정했다
        // 객체의 속성과 기능을 참조( 도트 연산자(.) 사용)
        galaxy.model = "갤럭시 S21";   // model은 String 타입
        galaxy.color = "펄블루";
        galaxy.price = 1000000;
*/
        galaxy.showSpec();

        System.out.println("=================================");

        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("=================================");

        Phone gNote = new Phone("갤럭시 노트", "제니레드");
        gNote.showSpec();

        System.out.println("=================================");

        Phone xhaomi = new Phone("샤오미 3.0", "화이트", 200000);
        xhaomi.showSpec();

    }
}
