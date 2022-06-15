package day16.api.obj;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Company monami = new Company("모나미", "111-111");
        Pen p1 = new Pen(123, "빨강", 1000);
        Pen p2 = new Pen(monami, 123, "노랑", 900);
        Pen p3 = new Pen(123, "주황", 1100);

        // 같은 일련번호를 가지면 같은 공장에서 생산된 제품이라고 가정
        System.out.println(p1.equals(p3));

        // p2를 복사해서 p4에 대입
//        Pen p4 = new Pen(p2.serial, p2.color, p2.price);
        Pen p4 = (Pen) p2.clone();
        Pen p5 = p2.deepClone();

        p2.company.address = "부산";

        System.out.println("p2 = " + p2);
        System.out.println("p4 = " + p4);
        System.out.println("p5 = " + p5);

        System.out.println("====================");

        Count c = null;
        for (int i = 0; i < 20; i++) {
                c = new Count(i + 1);
                c= null;
                System.gc(); //  가비지 컬렉터를 좀 더 발리 기동
        }
    }
}
