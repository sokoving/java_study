package day16.api.obj;

// 객체 복사를 사용하려면 Clonable 인터페이스를 구현해야 함
public class Pen extends Object implements Cloneable {

    Company company; // 제조사 정보
    long serial; // 일련번호
    String color; // 색상
    int price; // 가격


    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    public Pen(Company company, long serial, String color, int price) {
        this(serial, color, price);
        this.company = company;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pen){
            Pen p = (Pen) obj;
            return  this.serial == p.serial;
        }
        return false;
    }

    // clone : 객체 복사(얕은 복사, shallow copy) >> company를 새로 생성하지 않고 주소값만 복사해온다
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    // 깉은 복사: 해당 객체뿐만 아니라 컴포지션된 객체도 모두 복사
    public Pen deepClone() throws CloneNotSupportedException {
        // 1. 우선 얕은 복사 진행
        Pen copy = (Pen) this.clone();
        // 2. 컴퍼니도 implements Cloneable, clone() 오버라이딩
        copy.company = (Company) copy.company.clone();

        return copy;
    }


    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
