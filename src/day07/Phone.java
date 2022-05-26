package day07;

// class Phone : Phone의 설계도용 클래스
    // * 설계용 class에는 main을 만들지 않는다 (main: 실행을 담당한다)
// 클래스 : 객체를 생성할 때 쓰는 설계도
// 객체 : 클래스를 기반으로 만들어져 기능을 실행한다
public class Phone {

// 속성(field): 객체의 데이터

    //고유 속성 : 잘 바뀌지 않는 속성
    String model; // 모델명
    String color; // 색상
    int price; // 출고가

    // 상태 속성 : 자주 변하는 속성
    int messageCount; // 받은 문자메시지 수
    boolean on; // 전원 상태

    // 부품 속성
    // 문자메시지함
    String[] receiveMessages = new String[3];



// 생성자 (constructor) : 객체의 초기화를 담당하며 객체 생성 시 반드시 호출
    // 하나도 선언하지 않을 시 자동으로 기본 생성자(default constructor)가 만들어진다
    // 생성자 선언은 함수 정의 방식과 유사하다
    // 생성자의 이름은 반드시 class의 이름과 대소문자까지 일치해야 한다
    // 생성자의 타입은 void 고정이며 생략한다.
    Phone() {  // 기본 생성자(default constructor): 매개변수가 없는 생성자
        System.out.println("1번 기본 생성자 호출");
        model = "애니콜";
        color = "그레이";
        price = 120000;
        powerOn();
        Math.random();
    }

    // 생성자 오버로딩 : 생성자 중복 선언
    Phone(String pModel) {
        System.out.println("2번 생성자 호출");
        model = pModel;     //인수로 받은 모델명이 모델명이 된다
        color = "사파이어";  // 어떤 모델이든 color, price 고정
        price = 50000;
        powerOn();
    }

    Phone(String pModel, String pColor){
        System.out.println("3번 생성자 호출");
        model = pModel;     //인수로 받은 pModel이 모델명이 된다
        color = pColor;  // 인수로 받은 pColor이 색이 된다.
        price = 800000;
        powerOn();
    }

    Phone(String pModel, String pColor, int pPrice){
        System.out.println("4번 생성자 호출");
        model = pModel;     //인수로 받은 pModel이 모델명이 된다
        color = pColor;  // 인수로 받은 pColor이 색이 된다.
        price = pPrice;
        powerOn();
    }


// 기능(method): 객체의 행위, 동작
    // * 설계도의 메서드는 "static"을 붙이지 말 것!

    // 전원을 끄는 기능
    void  powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }

    // 전원을 켜는 기능
    void  powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다.");
    }

    // 핸드폰 정보를 알려주는 기능
    void showSpec() {
        if(!on) {
            System.out.println(model + "의 전원을 먼저 켜주세요");
            return;
        }
        System.out.println("\n# 휴대폰 정보");
        System.out.println(" * 모델명: " +model);
        System.out.println(" * 색상: " + color);
        System.out.println(" * 가격: " + price);
    }

    // 메세지를 보내는 기능
    // 코드 예시) 아이폰.메세지를 보낸다(갤럭시, 메시지 내용);
    // 코드 예시) 고양이.먹는다(참치캔);
    void sendMessage(Phone targetPhone, String msg){
        // 상대방의 메시지함이 가득 차 있나?
        if(targetPhone.receiveMessages.length > targetPhone.messageCount){
            //상대방 메시지함에 메시지 넣기
            targetPhone.receiveMessages[targetPhone.messageCount++] = msg + " by " + model;

        } else { // 가득 찬 경우
            System.out.println(msg);
            System.out.println("System: " + targetPhone.model +"의 메시지함이 가득 차 반송됩니다.");

        }
    }


    // 수신메시지를 확인하는 기능
    void checkMessages() {
        System.out.printf("\n========= [%s]의 메시지함 ==========\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }



} // end class
