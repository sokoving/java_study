#### 다음 코드 실행 결과는 4, 5, 6, 42 중 무엇?

```java
public class MeaningOfThis {

    public final int value = 4; // lass MeaningOfThis 소속 필드

    public void doIt() {
        int value = 6;  // 지역 변수
        Runnable r = new Runnable() {
            public final int value = 5; // 익명 클래스의 필드
            @Override
            public void run() {
                int value = 42;  // 지역 변수
                System.out.println(this.value); 
                // this.value는 필드 > 지역변수인 6, 42 제외
                // 접근제한자 public은 지역변수에는 못 붙임(필드에만)
                // 4는 class MeaningOfThis 소속 필드
                // 5는 익명 클래스의 필드
                // 그래서 this.value는 익명 클래스의 필드를 가리킴
            }
        };
    }
    
    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}

```

---
정답: 5