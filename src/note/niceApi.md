# Stack
- int형 Stack 선언 :  Stack<Integer> stack = new Stack<>();
- char형 Stack 선언 :  Stack<String> stack = new Stack<>();
- import java.util.Scanner;
- stack.push(value); 스택의 최상단에 값 추가
- stack.pop();       스택의 최상단의 값 삭제(삭제한 값 리턴)
- stack.clear();     스택 값 전체 삭제
- stack.peek();      스택의 최상단 값 출력
- stack.empty();     스택이 비어있는지 확인(비어있으면 true, 아니면 false 리턴)

# StringBuilder
- 문자열 String에 반복해서 문자를 더하면 메모리가 계속 생겨 메모리가 부족해질 수 있다.
- StringBuilder는 메모리를 새로 만들지 않고 자체에 메모리를 더한다.
- StringBuilder s = new StringBuilder();
- s.append("추가할 문자");