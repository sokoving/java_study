# DFS (깊이 우선 탐색)

- 그래프 완전 탐색 기법 : 그래프의 데이터를 모두 순회한다

- 깊이 우선 탐색에서는 현재 시작하는 정점에 방문했음을 표기하고 그 주변의 정점을 스택에 하나씩 저장하고, 이 과정
  후에는 스택에서 정점을 하나씩 꺼내와서 해당 정점으로 이동합니다.
- 이동한 정점에서는 방문 여부를 표시하고 연결된 정점들을 스택에 저장하는 앞의 과정을 지속적으로 반복합니다.
- 깊이 우선 탐색의 시간 복잡도는 O(V + E)입니다. ( V는 정점 노드 수, E는 간선 수)
- 
  단계 1. 스택에서 정점을 하나 꺼내 온다(pop). 스택에 아무것도 없으면 탐색을 종료한다.
  단계 2. 꺼내온 정점으로 이동하고 방문했음을 표기한다.
  단계 3. 현재 정점에 연결된 다른 정점들을 찾아서 해당 정점에 방문한 적이 없으면 스택에
  집어넣는다.(push)
  단계 4. 현재의 정점에 연결되어 있고 방문하지 않은 정점들을 모두 스택에 넣고
  단계 1로 돌아간다

# BFS (너비 우선 탐색)