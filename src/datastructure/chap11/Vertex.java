package datastructure.chap11;

// 정점 설계 : 데이터를 보관할 공간
public class Vertex {

    private int id; // 정점의 고유 번호
    private String data; // 정점에 저장할 데이터
    private boolean visitFlag; // 정점 방문 여부

    public Vertex(String data) {
        this.data = data;
        this.id = -1; // 처음 생성할 때는 아이디 없음
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisitFlag() {
        return visitFlag;
    }

    public void setVisitFlag(boolean visitFlag) {
        this.visitFlag = visitFlag;
    }
}
