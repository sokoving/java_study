package day10.encap;

public class Car {

    private String model; //모델명
    private int speed; // 현재 속도
    private char mode;  // 변속 모드(O, N, R, P)
    private boolean start; // 사용 온오프 상태

// 생성자
    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

// 메서드
    // setter: 필드값 변경을 대리하는 메서드
    // 이름 관례: set+Field
    public void setSpeed(int Speed) {
        if (speed < 0 || speed > 200) {  // 외부에서 속도를 클래스 내부에서 정한 범위 내에서만 변경할 수 있다.
            return;
        }
        this.speed = speed;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D':
            case 'R':
            case 'N':
            case 'P':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }

    // 필드 접근제한자가 private면 참조도 막히기 때문에 get 메서드도 만들어줘야 함
    public int getSpeed() {
        return this.speed;
    }



    // 시동 거는 기능
    public void engineStart(){
        System.out.println("시동 버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        movecylinder();
        System.out.println("시동이 걸렸습니다. ");
    }

    //엔진에 연료가 주입되는 기능
    private void injectGasoline(){  //  내연기관을 직접 건드리는 기능은 외부에서 사용할 수 없게 한다.
        System.out.println("엔진에 연료가 주입됩니다.");
    }
    // 엔진오일이 주입되는 기능
    private void injectOil(){
        System.out.println("엔진 오일이 순환합니다. ");
    }
    // 실린더가 움직이는 기능
    private void movecylinder(){
        if(start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("차가 고장났습니다. ");
        }
    }

    // 시동을 끄는 기능
    public void engineStop(){
        if (this.speed > 0){
            System.out.println("주행 중에는 시동을 끌 수가 없습니다. ");
            return;
        }
        this.start = false;
        System.out.println("시동이 꺼졌습니다. ");
    }


}
