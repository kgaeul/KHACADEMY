package chap33_Graph;

import java.util.LinkedList;
/*
 Graph class : ��������Ʈ�� ����ؼ� ���� ������ ����
 */
public class GraphMain {

		private int V;
		private LinkedList<Integer>[] adjList;
		/*
		adjList : ��������Ʈ�� �����ϴ� �迭
		  �� ��帶�� ����� ������ �����ϱ� ���� LinkedList ��ü�迭�� �ʱ�ȭ
		 */
		
		/*�׷��� ������
		 �׷��� ũ��( ��� �� ) �� �޾ƿͼ� �׷����� �ʱ�ȭ
		 adjList  �迭�� �� ���Ҹ� LinkedList�� �ʱ�ȭ �ϰڴ�.
		 
		*/
		public GraphMain (int ver) {
			V=ver;
			adjList = new LinkedList[ver];
			for(int i=0;i<ver;i++) {
				adjList[i] = new LinkedList<>();
			}
		}
		
		//addEde : �׷����� ���ο� ������ �߰�
		public void addEdge(int source, int des) {
			//source���� des�� ���� ������ �߰��ϸ� adjList �迭���� soruce�� �ش��ϴ�  linkedList�� des �߰�
			adjList[source].add(des);
		}
		
		//�׷���Ž��(���� �켱 Ž��)
		//���� �켱 Ž���� �����ϰ� ���� ��帣 �Ű������� ����
		public void DFS(int startNode) {
			//�湮���θ� �����ϱ� ���� visited �迭 �ʱ�ȭ
			boolean[] visited = new boolean[V];
			DFSUtill(startNode,visited);
		}
		private void DFSUtill(int currentNode, boolean[]visited) {
			visited[currentNode]= true;
			System.out.println(currentNode+" ");
			
			//�湮���� ���� ������带 �����(������ �ڸ��� ���ƿ��ų� �ǵ��ƿ��� ��)���� �湮
			for(int neighbor : adjList[currentNode]) {
				if(!visited[neighbor]) {
					DFSUtill(neighbor,visited);
				}
			}
		}
}
