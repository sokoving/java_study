package cordingtest.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/81301
public class Solution {
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
        System.out.println(">> " + solution("23four5six7"));
        System.out.println(">> " + solution("2three45sixseven"));
        System.out.println(">> " + solution("123"));


    }

}