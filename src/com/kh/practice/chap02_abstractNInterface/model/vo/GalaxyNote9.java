package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

    public GalaxyNote9() {
        setMaker("삼성");
    }


    @Override
    public String printInformation() {
        return String.format("갤럭시 노트9는 %s에서 만들어졌고 제원은 다음과 같다.\n%s\n%s\n%s\n%s\n%s\n블루투스 펜 탑재 여부 : %b",
                getMaker(), makeCall(), takeCall(), picture(), charge(), touch(), bluetoothPen());
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름 ";
    }

    @Override
    public String takeCall() {
        return "수신 버튼을 누름";
    }

    @Override
    public String picture() {
        return "1200만 듀얼 카메라";
    }

    @Override
    public String charge() {
        return "고속 충전, 고속 무선 충전";
    }

    @Override
    public String touch() {
        return "정전식, 와콤펜 지원";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }



}
