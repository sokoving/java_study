package day02;

public class BitOperator {
    public static void main(String[] args) {
        // +
        // 숫자 + 숫자 > 산술 연산
        // 문자 + 문자 > 결합 연산

        // 비트 연산자
        byte a = 5; // 2진수(8자리 비트) 0000 0101
        byte b = 3; // 2진수(8자리 비트) 0000 0011

        // & (비트곱) : 각 비트 자릿수를 곱하세요.(1 & 1 == 1)
        System.out.println(a & b); // 0000 0001 = 1
        // | (비트합) : 각 비트 자릿수를 더하세요. 단 1+1=1로 처리
        System.out.println(a | b); // 0000 0111 = 7
        // ^ (베타적 논리합) : 각 비트 자리의 비트를 비교해서 베타적이면(다르면) 1 같으면 0.
        System.out.println(a ^ b); // 0000 0110 = 6

        //비트 이동 연산자
        // << 왼쪽으로 이동 -> 2의 이동 숫자만큼 제곱으로 "곱해라"
        // >> 오른쪽으로 이동 -> 2의 이동 숫자만큼 제곱으로 "나눠라"

             // 192 == 00000000 00000000 00000000 11000000
        int x = 192;
        // 192 << 3 == 00000000 00000000 00000110 00000000
        System.out.println(x << 3); // 192 * (2*2*2) = 1536
        // 192 >> 2 == 00000000 00000000 00000000 00110000
        System.out.println(x >> 2); // 192 / (2*2) = 48

        // 비트 반전(~) - 단항 연산자
        int y = 8;              // 0000 1000 = 8
        System.out.println(~y); // 1111 0111 = -9
    }
}
