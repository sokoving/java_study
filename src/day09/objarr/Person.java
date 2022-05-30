package day09.objarr;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Person {

//    필드
    String name; // 이름
    int money; // 현재 소유한 현금
    // 통장 정보 - 통장은 1개만 소유할 수 있다 가정
    Account myAccount;  // 객체 안에 객체(어카운트 여러 개 가지려면  Account[] 타입)

//    생성자
    Person(String name) {
        this.name = name;
        this.money = 0;         // 생성할 때 0과 null로 자동 초기화(생략)
        this.myAccount = null;
    }

//    메서드
    // 계좌 개설 기능
    void makeAccount(Bank bank){
        // 신규 계좌 생성
        this.myAccount = new Account(this); //Person 타입 매개변수로 "나" 정보 주기
        // 신규 계좌의 은행명 필드 초기화
        myAccount.bankName = bank.bankName;
        // 은행에 계좌정보 등록
        bank.registry(myAccount);
        System.out.printf("%s은행에 %s 님의 계좌가 신설되었습니다.\n", bank.bankName, this.name);
    }

    // 입금 기능
    void depasit(int depositMoney){
        // 입금하려는 금액(depositMoney)이 내 현금보다 많아야 한다
        if(money >= depositMoney) {
            //내 통장 잔액 증가
            myAccount.balance += depositMoney;
            //내 현금 잔액 감소
            this.money -= depositMoney;
            System.out.printf("%s은행 계좌에 %d원이 입금되었습니다.\n",
                    this.myAccount.bankName, depositMoney);
        } else {
            System.out.printf("입금 실패: 소지금이 %d 원 더 필요합니다.\n",
                    depositMoney - this.money);
        }
    }

    // 송금 기능(target에게 money원을 보낸다)
    void sendMoney(Person target, int money){
        if(this.myAccount.balance >= money){ // money 이체액, this.money 내 현금
            // target의 예금잔액이 money원 증가
            target.myAccount.balance += money;
            // this의 예금잔액이 money원 감소
            this.myAccount.balance -= money;
            System.out.printf("%s 님이 %s sladprp %d원을 송금했습니다.\n", this.name, target.name, money);
        } else {
            System.out.println("계좌 이체 실패 - 잔액 부족");

        }
    }

    // 잔액 조회 기능
    void checkBalance() {
        System.out.printf("%s 님의 현재 예금 잔액은 %d원입니다.\n", this.name, this.myAccount.balance);
    }


}
