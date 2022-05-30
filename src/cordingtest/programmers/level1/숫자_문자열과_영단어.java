package cordingtest.programmers.level1;

// https://programmers.co.kr/learn/courses/30/lessons/81301
public class 숫자_문자열과_영단어 {
    public static long solution(String s) {
        long answer = 0;

        String[] numbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int beginIdx = 0;
        int count = 1;
        int endIdx = 0;

        while (endIdx < s.length()) {
            endIdx = beginIdx + count;

            String temp = s.substring(beginIdx, endIdx);

            for (int i = 0; i < numbers.length; i++) {
                // temp가 배열에 있을 경우
                if (temp.equals(numbers[i])) {
                    answer = (answer + i % 10) * 10;
                    beginIdx += count;
                    count = 1;
                    break;
                } else {
                    if ( i == 19) {
                        count++;
                    }
                }
            }
        }


        answer /= 10;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(">> " + solution("one4seveneight"));


    }

}