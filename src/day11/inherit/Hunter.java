package day11.inherit;

public class Hunter extends Player {

    public int arrow; // 화살 수

    public Hunter(String name){
        super(name);
        this.job = "사냥꾼";
        this.arrow = 100;
    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println(" # arrow: " + arrow);
    }


    public void blazeShot(){
        System.out.println(name + " 님이 폭발 화살을 시전합니다. ");
    }



}
