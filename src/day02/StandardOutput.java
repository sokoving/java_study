package day02;

public class StandardOutput {
    public static void main(String[] args) {
        // 표준 입출력 : 데이터 입출력을 위한 주변장치의 기본값
        // 표준 입력 - 키보드 / 표준 출력 - 단말기 화면

        String dog = "멍멍이", cat = "야옹이";
        // 자바의 표준 출력 함수
        System.out.println(dog);    // println > 줄 개행 기능(\n)이 들어가 있다
        System.out.print(dog+"\n"); //   print > 줄 개행 기능(\n)이 들어가 있지 않다

        int month = 7;
        int day = 17;
        String anniversary = "제헌절";
        System.out.println(month + "월 " + day + "일은 " + anniversary + "입니다.\n");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anniversary);
        // printf() > js의 `${}`와 같은 기능
        // 포맷 지정자 | %d : 10진수 정수 | %f: 실수 | %s: 문자열 | %c: 단일문자
        // 쉼표(,) 뒤에 전달할 인수(변수)를 순서대로 쓴다.

        double rate = 25.1234567893456;
        // %f : 강제로 소수점 6자리를 표현합니다. (자릿수가 부족하면 25.120000 넘치면 25.123457)
        System.out.printf("비율은 %f입니다.\n", rate);
        // %4.f : 강제로 소수점 4자리를 표현합니다 (25.1235)
        System.out.printf("비율은 %.4f입니다.\n", rate);
        System.out.printf("비율은 %.2f입니다.\n", rate);
        // %2.f%% : 특수문자를 표시하려면 두 번 쓰기 %% > % \\ > \
        System.out.printf("비율은 %.2f%%입니다.\\\n", rate);


    }}
