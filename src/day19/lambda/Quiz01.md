#### 람다 규칙에 맞지 않는 표현식은?
1. () -> {}
2. () -> "Raoul"
  - return Raoul
3. () -> { return "Mario" }
  - return을 쓰려면 중괄호 있어야 함
4. (Integer i) -> return "Alan" + i
  + (Integer i) -> "Alan" + i
  + (i) -> "Alan" + i
5. (String s) -> { "Iron Man" }
  + (String s) -> { return "Iron Man" }
  + (s) -> { return "Iron Man" }
---
정답: 4, 5