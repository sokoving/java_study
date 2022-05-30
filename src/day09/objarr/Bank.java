package day09.objarr;

public class Bank {

//     필드
     String bankName; // 은행명

     // 등록된 계좌들
      Account[] accounts;

      // 총 보유 액수(시재)
     int totalCash;

     // 등록된 계좌 수
     int accountCount;

//     생성자
     Bank(String bankName, int accountCount){ //초기 계좌수
          this.bankName = bankName;
          this.accountCount = 0;
          this.accounts = new Account[accountCount];
          //this.accounts는 Account 배열 타입(배열 생성 문법과 같다 int[] newInt = new int[5];)
     }

//     메서드
     // 신규 계좌 등록 기능
     void registry(Account newAccount) {
          // 등록 가능한지 여부 : 총 계좌 등록 제한 개수를 넘지 않았는가
          if(accountCount < accounts.length) {
               accounts[accountCount++] = newAccount;
               System.out.println("신규 계좌가 등록되었습니다. ");
          } else {
               System.out.println("더이상 계좌를 등록할 수 없습니다. ");
               return;
          }

     }
          // 등록된 모든 계좌 조회 기능
     void showAccount() {
          System.out.printf("===== [%s은행] 등록계좌 (총 %d개) ====\n",
                  this.bankName, this.accountCount);
          for (int i = 0; i < this.accountCount; i++) {
               // # 1. 홍길동 님 계좌 - 잔액(10000원)
               // # 2. 김영희 님 계좌 - 잔액(30000원)
               System.out.printf("# %d. %s 님 계좌 - 잔액(%d원)\n",
                       i+1, accounts[i].owner.name,accounts[i].balance);

          }
          /*
               accounts > Account[] / accounts[0] > Account
               accounts[0].balance  - 첫 번째 계좌의 잔액 정보(int 타입 > 산술 연산 가능)
               accounts[0].owner -  첫 번째 계좌의 예금주 모든 정보(Person 타입)
               accounts[0].owner.name - 첫 번째 계좌의 예금주 이름((String 타입)
           */
     }


}
