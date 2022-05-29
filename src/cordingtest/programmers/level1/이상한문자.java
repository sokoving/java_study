package cordingtest.programmers.level1;

//https://programmers.co.kr/learn/courses/30/lessons/12930
public class 이상한문자 {
    public static StringBuilder solution(String s) {
        StringBuilder newS = new StringBuilder(s);

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') counter = -1;

            if (counter%2 == 0){
                char upper = Character.toUpperCase(s.charAt(i));
                newS.setCharAt(i, upper);
                counter++;
            } else  {
                char lower = Character.toLowerCase(s.charAt(i));
                newS.setCharAt(i, lower);
                counter++;
            }
        }

        return newS;
    }

    public static void main(String[] args) {
        System.out.println(solution("aaa aa aaaa aaaa"));

    }

}