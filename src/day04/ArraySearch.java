package day04;

public class ArraySearch {
    public static void main(String[] args) {

        // 배열 탐색 알고리즘 - 순차 탐색(인덱스 0부터 일치하는지 검사)
        // 인덱스 찾기, 유무 확인
        // index 초기값을 -1로 할당, 탐색 수행 후 index 값으로 탐색과 유무를 동시에 판단 가능

        String[] foods = {"치킨", "피자", "삼겹살", "파스타"};
        String target = "치킨";  // 찾을 데이터

        int index = -1; //  찾은 인덱스를 저장할 변수
                   // -1 : 정상 인덱스 아님 > 아직 인덱스 번호가 없음을 상징
                   // 탐색 결과로 반환되는 index 값을 보고 유무 확인까지 가능
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])){
                index = i;
                break;
            }
        } // end for
        System.out.println("찾은 인덱스: " + index);

        // 반환되는 index 값이 -1 이면 타겟이 배열에 없음(false), -1이 아니면 배열에 있음(true)
        boolean hasFood = index != -1;
        System.out.println("존재 유무: " + hasFood);




    }
}
