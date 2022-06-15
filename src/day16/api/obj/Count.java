package day16.api.obj;

public class Count {
    int n;

    public Count(int n) {
        this.n = n;
        System.out.println(n + "번 객체 생성");
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println(n + "번 객체 소멸");
    }
}
