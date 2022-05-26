package day07;

public class StringMethod {
    public static void main(String[] args) {
        String str = "hello java";

        // charAt(index); 문자열 인덱스에 따른 단일문자 반환
        char c = str.charAt(4); // 'o'
        System.out.println("c = " + c);

        // substring(beginIdx, endIdx); 문자열의 특정 범위 추출
        String ss1 = str.substring(1, 5); // 1번 이상 5번 미만 슬라이싱
        System.out.println("ss1 = " + ss1);
        String ss2 = str.substring(6);
        System.out.println("ss2 = " + ss2); // 6번부터 끝가까지 슬라이스
        
        // length(); 문자열의 총 길이 반환 (공백 포함)
        int len = str.length();
        System.out.println("len = " + len);

        // 문자열의 인덱스 번호 탐색
        // 해당문자가 존재하지 않으면 -1을 리턴
        int idx1 = str.indexOf("l"); // 앞에서부터 탐색하여 먼저 나온 문자의 인덱스 번호를 알려줌
        int idx2 = str.lastIndexOf("l"); // 뒤에서부터 탐색하여 먼저 나온 문자의 인덱스 번호를 알려줌
        System.out.println("idx1 = " + idx1);
        System.out.println("idx2 = " + idx2);

        // 일괄 대소문자 변경
        String str2 = "Hello PRRorO";
        String lowerCase = str2.toLowerCase(); // 소문자 변경
        String upperCase = str2.toUpperCase(); // 대문자 변경

        // replace(old, new); 문자열 내부에 old문자를 모두 탐색하여 new문자로 변경
        String str3 = "python study, python app, python data";
        String replace = str3.replace("python", "java");
        System.out.println("replace = " + replace);
        
        // 문자열 > 정수 : Integer.parseInt(str)
        // 문자열 > 실수 : Double.parseDouble(str)
        String s1 = "100";
        String s2 = "200.1";

        double sum = Integer.parseInt(s1) + Double.parseDouble(s2);
        System.out.println("sum = " + sum);

        // 문자열이 아닌 것 > 문자열 :  String.valueOf(data)
        int s3 = 101;
        double s4 = 101.11;

        System.out.println(String.valueOf(s3) + String.valueOf(s4));

        System.out.println("==========================");
       
        // 종합: 파일 경로에서 확장자 추출 (공격 파일 업로드를 막아준다)
        String filePath = "D:/local/img/2022/05/26/lalalala.JPG";
        
        int dotIdx = filePath.lastIndexOf('.');
        System.out.println("dotIdx = " + dotIdx);

        String fileExtention = filePath.substring(dotIdx+1);
        System.out.println("fileExtention = " + fileExtention);

        switch (fileExtention.toLowerCase()) {
            case "jpg": case "gif": case "png": case "jpeg":
                System.out.println("이미지 파일입니다. ");
                break;
            default:
                System.out.println("이미지 파일이 아닙니다. ");
        }


    }
}
