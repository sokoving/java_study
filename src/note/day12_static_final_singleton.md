# static final 사용 예시
## 1. 상수를 임폴트한 경우
- package com.kh.practice.chap01_poly.view.LibraryMenu
- import static com.kh.practice.chap01_poly.controller.LibraryController.*;
``` 상수의 경로를 안 써도 쓸 수 있다.
int result = lc.rentBook(bookNo - 1);
    switch (result) {
        case RENT_SUCCESS:
            System.out.println("# 성공적으로 대여 되었습니다.");
            break;
```

## 2. 상수를 리턴값에 활용한 경우
- com.kh.practice.chap01_poly.controller.LibraryController
- rentBook();

---------------------------------------------------------------------


# static member / intance member

# 스태틱을 참조할 때는 클래스 참조
