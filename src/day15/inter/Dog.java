package day15.inter;
// 구현 클래스가 인터페이스를 구현할 때는 implements 키워드 사용
// 상속이랑 비슷하긴 함
// 근데 필드를 쓰려면 추상클래스를 만들어서 상속받아야 함
// 인터페이스는 다중 상속이 가능.
// 추상클래스 상속과 인터페이스를 사용하면 쉽게 클래스를 만들 수 있다
public class Dog extends Animal implements Pet{

    @Override
    public void play() {
        System.out.println("인터페이스는 오버라이딩을 강제한다");
    }

    @Override
    public void eat() {

    }
}
