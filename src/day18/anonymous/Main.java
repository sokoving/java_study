package day18.anonymous;

public class Main {

    // 내부 클래스 : 클래스 안에 클래스를 만듦
    // 외부 클래스에는 static 못 붙이지만 내부 클래스에서는 static 붙일 수 있음
    public static class SubOperator implements Calculator{

        @Override
        public int operate(int n1, int n2) {
            return n1-n2;
        }
    }

    public static void main(String[] args) {
//메서드 오버라이딩 하는 방법 4개

        // 1. 외부에 새 클래스를 만들어 implements Calculator
        Calculator addCal = new AddOperator();
        System.out.println(addCal.operate(1, 2));

        // 2. 내부에 클래스 만들어 implements Calculator
        Calculator subCal = new SubOperator();
        System.out.println(subCal.operate(20, 10));

        // 3. 익명 클래스                     () 다음에 class 어쩌구가 생략 > 익명 클래스
        Calculator multiCal = new Calculator(){  // {}은 클래스를 선언하겠다는 뜻
            @Override                            // Calculator는 인터페이스라 객체를 생성 못 하지만 바로 클래스 선언 가능
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };
        System.out.println(multiCal.operate(3, 15));

        // 4. 람다
        Calculator divCal = (n1, n2) -> n1 / n2;
        System.out.println(divCal.operate(100, 50));

        System.out.println("================================================");
        PowerfulOperator po = (f, s, cal) ->  cal.operate(f, s);
                                                            // new AddOperator(): Calculator 구현체
        System.out.println(po.powerOpertator(300, 500, new AddOperator()));
        System.out.println(po.powerOpertator(300, 500, new SubOperator()));
        System.out.println(po.powerOpertator(300, 500, new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }));

        System.out.println(po.powerOpertator(1000, 200, (n1, n2)->n1/n2));

    }

}
