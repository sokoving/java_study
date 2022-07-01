package datastructure.chap12;

import datastructure.chap11.Vertex;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// 인접 리스트 형식 그래프 구현
public class GraphList {

    // 정점들을 저장할 리스트
    private List<Vertex> vertices;

    // 그래프들의 연관관계를 저장할 인접 리스트
    private List<List<Vertex>> adjList;

    public GraphList(){
        vertices = new LinkedList<>(); // 정점들이 저장될 1차원 리스트
        adjList = new LinkedList<>(); // 정점의 관계들이 저장될 2차원 리스트
    }

    // 정점 추가 메서드
    public void addVertex(Vertex v){
        v.setId(vertices.size()); // 정점에 id 부여
        vertices.add(v);    // 정점을 정점 리스트에 추가
        adjList.add(new LinkedList<>()); // 인접리스트에 1차원리스트 추가
    }

    // 간선 연결하기 (무방향 그래프)
    public void addEdge(Vertex departure, Vertex destination){
         adjList.get(departure.getId()).add(destination);
         adjList.get(destination.getId()).add(departure);
    }

    // 인접 리스트 그래프 출력
    public void showGraph() {

        for (int i = 0; i < adjList.size(); i++) {
            System.out.printf("%s | ", vertices.get(i).getData());
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.printf("%s ", adjList.get(i).get(j).getData());
            }
            System.out.println();
        }
    }

    // 깊이우선 탐색 구현 - 스택 바익
    public void DFS(Vertex start)  {

        // 정점들을 저장할 스택
        Stack<Vertex> stack = new Stack<>();
        // 0. 탐색 시작 정점을 스택에 저장
        stack.push(start);

        // 스택이 빌 때까지 스택 탐색 수행
        while (!stack.isEmpty()){
            // 1. 스택에서 정점을 꺼낸다
            Vertex current = stack.pop();
            // 2. 해당 정점에 방문 처리
            current.setVisitFlag(true);

            // 3. 방문한 정점의 데이터를 출력
            System.out.print(current.getData() + " ");

            // 4. 해당 정점에 연결되어 있는 다른 정점들을 찾아서 모두 스택에 저장
            List<Vertex> connectedVertices = adjList.get(current.getId());
            for (Vertex cv : connectedVertices) {
                // 방문한 적 없는 정점만 스택에 추가
                if(!cv.isVisitFlag()){
                    stack.push(cv);
                }
            }
        }
        System.out.println();
    }

    //길이 우선 탐색 구현 - 재귀
    // 스택을 안 쓰기 때문에 메모리 여유가 있다)
    public void DFS2(Vertex current){
        // 재귀 탈출 조건 - 이미 방문했으면 나오기
        if(current.isVisitFlag()){
            System.out.println();
            return;
        }

        // 1. 현재 정점에 방문 처리
        current.setVisitFlag(true);
        // 2. 현재 정점을 출력
        System.out.print(current.getData() + " ");
        // 3. 현재 정점에 연결된 모든 정점을 가져오기
        List<Vertex> connectedVertices = adjList.get(current.getId());

        for (int i = connectedVertices.size() - 1; i >= 0; i--) {
            // 연결된 정점하나 가져오기
            Vertex v = connectedVertices.get(i);
            if (!v.isVisitFlag()) {
                DFS2(v); // 방문되지 않은 정점 재귀호출
            }
        }

    }

}
