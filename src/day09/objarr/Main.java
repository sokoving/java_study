package day09.objarr;

public class Main {

    public static void main(String[] args) {
        // 은행 생성
        Bank shinhan = new Bank("신한", 10);
        Bank kookmin = new Bank("국민", 5);
        Bank woori = new Bank("우리", 20);

        // 사람 생성
        Person park = new Person("박영희");
        Person kim = new Person("김철수");
        park.money = 100000;
        kim.money = 5000;

        // 계좌 생성
        park.makeAccount(shinhan);
        kim.makeAccount(woori);
        System.out.println("===================================");

        // 입금
        park.depasit(80000);
        kim.depasit(10000);
        System.out.println("==================================");

        // 계좌 이체
        park.sendMoney(kim, 5000);

        //계좌 확인
        shinhan.showAccount();
        woori.showAccount();
        kookmin.showAccount();
        System.out.println("==================================");
        park.checkBalance();
        System.out.printf("%s는 지갑에 %d원 있어.\n", park.name, park.money);
        kim.checkBalance();
        System.out.printf("%s는 지갑에 %d원 있어\n", kim.name, kim.money);

    }
}
