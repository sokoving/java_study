package day13.poly.basic;

class Monitor{}
class LGMonitor extends Monitor{}
class HPMonitor extends Monitor{}

public class Computer {

    Monitor monitor;
//    LGMonitor lgMonitor;

    Computer(){
        this.monitor = new LGMonitor();
    }

    void changHPmonitor(){
        this.monitor = new HPMonitor();  // 부모 타입은 여러 자식 타입 중 골라 쓸 수 있다
//      this.lgMonitor = new HPMonitor();  // 상속 관계가 없다면 타입 교체가 안 된다
    }
}
