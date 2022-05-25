package day06;

// parameter(매개변수) : 함수가 외부에서 받아와야 하는 값을 저장하는 공간
public class MethodParam {

    // # 2개의 정수를 전달받아 그 합을 돌려주는 함수
    static int add(int n1, int n2) {
        System.out.println("함수 호출");
        int sum = n1 + n2;
        return sum;
    }

/*  # 매개변수에  (int[] numbers) 대신 ( int... numbers)
    [장점]
    인수에 배열로 묶어서 주거나 (new int[] {3, 6, 9})
                     풀어서도 (3, 6, 9) 줄 수 있다
   [주의]
   매개변수로 배열 하나만 받을 수 있다
            배열 두 개 이상 받으면 인수의 배열을 구분할 수 없다
*/

    // N개의 정수(배열) 를 전달받아 그 총합을 리턴하는 함수
    static int addAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
    static int[] compareLength(int[] nums1, int[] nums2){
        return nums1.length > nums2.length ? nums1 : nums2;
    }

    // # 리턴이 없는 함수 >> void
    static void hello(){
        System.out.println("안녕하십니까?");
    }



    public static void main(String[] args) {

        System.out.println("함수 호출 전");
        System.out.println(add(10, 20) + 50);
        // 실행 순서 : add 호출 > 30 반환 > 30 + 50 연산 > println 호출 > 콘솔 로그 80 반환
        System.out.println("함수 호출 후");

//      # 인수와 매개변수는 타입과 개수가 일치해야 한다
        System.out.println("====================");
//      add(10, 20, 30);  > 인수가 많다.
//      add(3.2 10); > 타입이 다르다 (다운캐스팅 안 됨)

        // short > int 타입이 다르지만 업캐스팅은 묵시적으로 됨
        short a = 10;
        int aa = add(10, a);
        System.out.println("aa = " + aa);

        // long > int 명시적 다운캐스팅
        long b = 123456789L;
        int bb = add(10, (int) b);
        System.out.println("bb = " + bb);

//      # 매개변수를 여러 개(몇 개인지 모름) 주고 싶으면 배열로 받아라
        System.out.println("====================");
        // 배열 선언 후 인수로 전달
        int[] arr = {10, 20, 30};
        int sum1 = addAll(arr);

        // 인수에 배열을 직접 전달
        int sum2 = addAll(new int[]{3, 6, 9, 12});

        // 묵시적 변환을 이용
        int sum3 = addAll(3, 6, 9);

        // 인수로 배열을 2개 이상 전달
        compareLength(new int[]{1, 3, 5}, new int[]{2, 4, 8});


    }
}
