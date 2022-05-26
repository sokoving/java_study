# Scanner

## package 와 public class 사이에
+ import java.util.Scanner;

## 스캐너 api 사용
+ Scanner sc = new Scanner(System.in);

## 스캐너의 메서드들
+ sc.next(); 문자열을 입력받을 때, 공백 미포함 (공백 전까지만 반환)
+ sc.nextLine(); 문자열 입력, 공백 포함
   - 스트림에 남은 sc.next()의 공백을 날려버리는 데도 사용.
+ sc.nextInt(); 정수를 입력, 공백 미포함 (공백 전까지만 반환)
+ sc.nextDouble(); 실수를 입력

## 스캐너 메모리 해제
+ sc.close(); 

----------------------------------------------------------------------

# String (package day07, class StringMethod 참고)
+ charAt(index); 문자열 인덱스에 따른 단일문자 반환

+ substring(beginIdx, endIdx); 문자열의 특정 범위를 추출
   - substring(beginIdx); 인수부터 끝까지 추출

+ length(); 문자열의 총 길이 반환

+ 해당 문자가 있는 인덱스 반환 (공백 포함)
   - indexOf(str): 처음부터 탐색
   - lastIndexOf(str); 끝에서부터 탐색 
   - 해당 문자가 존재하지 않으면 -1 리턴

+ 대소문자 변경
  - toLowerCase();
  - toUpperCase();

+ replace(old, new); 문자열 내부에 모든 old문자를 탐색하여 new문자로 변경

+ 문자열 타입 변환
  - 문자열 -> 정수 : Integer.parseInt(str)
  - 문자열 -> 실수 : Double.parseDouble(str)
  -  ??   -> 문자열 : String.valueOf(data)
