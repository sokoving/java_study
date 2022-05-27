package day08;
/*
 2. import 구문을 삽입하면 경로 안 적어도 됨.
import day08.fruit.Apple;
import day08.fruit.Banana;
import day08.fruit.Grape; */

// 3. import를 많이 불러와야 한다면 모든 하위 폴더를 *로 쓸 수 있다.
import day08.fruit.*;

/* import
 - 위치 : 패키지와 class 사이
 - 같은 패키지 내의 클래스르 불러온다면 import 없어도 됨
 */


public class Test {
    public static void main(String[] args) {
//  1. 인스턴스를 생성할 때 class Apple이 여러 개라면 풀네임을 명시해야 한다.
      /* day08.syrup.Apple apple = new day08.syrup.Apple();
        day08.fruit.Apple apple2 = new day08.fruit.Apple();  */

        Apple apple = new Apple();
//     1. 다른 패키지에 있는 클래스의 생성자를 호출하려면 무조건 풀네임을 명시해야 한다 (같은 패키지라면 X)
        new Banana();
        new Grape();


    }
}
