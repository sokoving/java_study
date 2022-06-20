package day19.lambda;

import day19.lambda.Apple.Color;

import java.util.ArrayList;
import java.util.List;

import static day19.lambda.Apple.Color.GREEN;
import static day19.lambda.Apple.Color.RED;

// 사과 필터링 기능 클래스
public class FilteringApple {

    /**
     * @solution try 1 - 사과리스트에서 녹색 사과들만 필터링해주세요
     * @problem
     * - 만약 빨간색 사과를 필터링하고 싶다면??
     * - filterRedApples를 만들것이냐?
     * - 색깔이 더 다양하다면?
     */

    public static List<Apple> filteringGreenApple(List<Apple> inventory){

        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if(apple.getColor() == GREEN){
                resultList.add(apple);
            }
        }
        return resultList;

    }

    /**
     * @solution - try2 : 색을 파라미터화 한다.
     * @problem
     *  - 만약 필터기준이 색상이 아니라 무게라면?
     *  - 무게 파라미터를 가진 메서드 filterApplesByWeight를 만들건가?
     *  - 만약 필터기준이 색상 + 무게
     *  - 어차피 조건문 빼고 코드가 똑같을 것 같은데?
     */
    public static List<Apple> filteringApple(List<Apple> inventory, Color color){

        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if(apple.getColor() == color){
                resultList.add(apple);
            }
        }
        return resultList;

    }

    /**
     * @solution - try3 : 동작 파라메터화  - 추상적 조건으로 필터링
     * a. 사과의 필터 조건에 따라 참, 거짓을 반환하게 하는 추상 메서드를 가진
     *     ApplePredicate 인터페이스를 정의한다.(클래스 내부에서만 쓸 거면 클래스 내부 클래스)
     * b. 특정 조건을 설정할 구현 클래스를 정의하고 기능을 오버라이딩
     * c. 위 내용을 기반으로 필터 메서드들을 사용
     * @problem
     * a. 조건마다 클래스 만들 거야? > 익명 함수로 주기
     * b. 필터 대상이 Apple이 아니라면?
     */
    // solution a
    @FunctionalInterface
    interface ApplePredicate{
        boolean test(Apple apple);
    }

    // solution b
    static class AppleWeightPredicate implements ApplePredicate{

        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 100;
        }
    }
    static class AppleColorPredicate implements ApplePredicate{
        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == RED;
        }
    }

    // solution c
    public static List<Apple> filterApples (List<Apple> inventory, ApplePredicate p){
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if(p.test(apple)){
                resultList.add(apple);
            }
        }
        return resultList;
    }

    /**
     * @solution - try4 : 타입을 제네릭 타입으로 처리
     */

    interface Predicate<T> {
        boolean test(T t);
    }

    // 제네릭 필터 메서드 생성(제네릭 타입을 쓸 때는 리턴타입에 다시 한 번 써준다
    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }


}
