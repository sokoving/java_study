package cordingtest.programmers.level1;

// https://programmers.co.kr/learn/courses/30/lessons/81301
public class 숫자_문자열과_영단어2 {
    public static int solution(String s) {
        int answer = 0;
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < nums.length; i++) {
            s = s.replaceAll(nums[i], String.valueOf(i));
        }

        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(">> " + solution("one4seveneight"));


    }

}