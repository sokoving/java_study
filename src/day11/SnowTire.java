package day11;

import java.security.PublicKey;

class Tire{
    public void roll(){
        System.out.println("일반 타이어가 회전합니다.");
    }
}

public class SnowTire extends Tire{
    @Override
    public void roll(){
        System.out.println("스노우 타이어가 회전합니다.");
    }

    public void snowsnow(){
        System.out.println("snowsnow");
    }

    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
        Tire realTire = new Tire();

        snowTire.roll();
        tire.roll();
        realTire.roll();

        snowTire.snowsnow();
//        tire.snowsnow();
//        realTire.snowsnow();
    }
}
