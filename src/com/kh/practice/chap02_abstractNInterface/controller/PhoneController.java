package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
    private String[] result = new String[2];

    public String[] method(){
        Phone[] phones = new Phone[2];
        phones[0] = new GalaxyNote9();
        phones[1] = new V40();


        for (int i = 0; i < phones.length; i++) {

            if (phones[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) phones[i];
                result[i] = smartPhone.printInformation();
            }


/*
            if (phones[i] instanceof GalaxyNote9) {
                GalaxyNote9 galaxyNote9 = (GalaxyNote9) phones[i];
                result[i] = galaxyNote9.printInformation();
            } else if (phones[i] instanceof V40) {
                V40 v40 = (V40) phones[i];
                result[i] = v40.printInformation();
            }

        for (int i = 0; i < phones.length; i++) {
            String msg;
            if (phones[i] instanceof GalaxyNote9){
                msg = ((GalaxyNote9) phones[i]).printInformation();
            } else if (phones[i] instanceof V40) {
                msg = ((V40) phones[i]).printInformation();
            } else {
                msg = "지원하지 않는 기종입니다.";
            }
            result[i] = msg;
        }
*/
        }

        return result;
    }


}
