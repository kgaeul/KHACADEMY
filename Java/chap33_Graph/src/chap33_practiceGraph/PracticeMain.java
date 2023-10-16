package chap33_practiceGraph;

import java.util.LinkedList;

public class PracticeMain {

	private int V;
	private LinkedList<Integer>[] adjList;
	
	public PracticeMain(int ver) {
		V= ver;
		adjList = new LinkedList[ver];
		for(int i=0; i<ver;i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int des) {
		adjList[source].add(des);
	}
	
	public void DFS(int startNode) {
		//�湮���θ� �����ϱ� ���� visited �迭 �ʱ�ȭ
		boolean[] visited = new boolean[V];
		DFSUtill(startNode,visited);
	}
	private void DFSUtill(int currentNode, boolean[]visited) {
		visited[currentNode]= true;
		System.out.println(currentNode+" ");
		
		for(int neighbor : adjList[currentNode]) {
			if(!visited[neighbor]) {
				DFSUtill(neighbor,visited);
			}
		}
	}
}