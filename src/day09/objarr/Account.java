package day09.objarr;

// 계좌 클래스
public class Account {

//    필드
    String bankName; // 은행명
    int balance; // 예금 잔액
    // 예금주 정보
    Person owner;

//    생성자
    Account(Person p) {   // 계좌가 생성될 때 주인의 정보를 알아야 한다
        this.owner = p;
    }

}
