package day10.encap;

public class Car {

    private String model; //모델명
    private int speed; // 현재 속도
    private char mode;  // 변속 모드(O, N, R, P)
    private boolean start; // 사용 온오프 상태

    //
    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    //
    // setter: 필드값 변경을 대리하는 메서드
    // 이름 관례: set+field
    public void setSpeed(int Speed) {
        if (speed < 0 || speed > 200) {
            return;
        }
        this.speed = speed;
    }

    // 필드 접근제한자가 private면 참조도 막히기 때문에 get 메서드도 만들어줘야 함
    public int getSpeed() {
        return this.speed;
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
                break;
        }
    }

}
