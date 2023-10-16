package chap33_Graph;

import java.util.LinkedList;
/*
 Graph class : 인접리스트를 사용해서 노드와 간선을 저장
 */
public class GraphMain {

		private int V;
		private LinkedList<Integer>[] adjList;
		/*
		adjList : 인접리스트를 저장하는 배열
		  각 노드마다 연결된 노드들을 저장하기 위해 LinkedList 객체배열로 초기화
		 */
		
		/*그래프 생성자
		 그래프 크기( 노드 수 ) 를 받아와서 그래프를 초기화
		 adjList  배열의 각 원소를 LinkedList로 초기화 하겠다.
		 
		*/
		public GraphMain (int ver) {
			V=ver;
			adjList = new LinkedList[ver];
			for(int i=0;i<ver;i++) {
				adjList[i] = new LinkedList<>();
			}
		}
		
		//addEde : 그래프에 새로운 간선을 추가
		public void addEdge(int source, int des) {
			//source에서 des로 가는 엣지를 추가하면 adjList 배열에서 soruce에 해당하는  linkedList에 des 추가
			adjList[source].add(des);
		}
		
		//그래프탐색(깊이 우선 탐색)
		//깊이 우선 탐색을 수행하고 시작 노드르 매개변수로 받음
		public void DFS(int startNode) {
			//방문여부를 추적하기 위한 visited 배열 초기화
			boolean[] visited = new boolean[V];
			DFSUtill(startNode,visited);
		}
		private void DFSUtill(int currentNode, boolean[]visited) {
			visited[currentNode]= true;
			System.out.println(currentNode+" ");
			
			//방문하지 않은 인접노드를 재귀적(원래의 자리로 돌아오거나 되돌아오는 것)으로 방문
			for(int neighbor : adjList[currentNode]) {
				if(!visited[neighbor]) {
					DFSUtill(neighbor,visited);
				}
			}
		}
}
