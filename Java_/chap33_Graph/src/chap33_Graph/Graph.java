package chap33_Graph;

public class Graph {

	public static void main(String[] args) {

		int ver =5; //����� ���� 5�� ����
		GraphMain GraphM = new GraphMain(ver);
		
		//������ �߰��� ��
		GraphM.addEdge(0,1); //��� 0���� 1�� ������ �ִ� ���� �߰�
		GraphM.addEdge(0,2); //��� 0���� 2�� ������ �ִ� ���� �߰�
		GraphM.addEdge(1,3); //��� 1���� 2�� ������ �ִ� ���� �߰�
		GraphM.addEdge(2,4); //��� 2���� 4�� ������ �ִ� ���� �߰�
		GraphM.addEdge(3,5);
		GraphM.addEdge(4,7);
		
		System.out.println();
		GraphM.DFS(0); //DFS Ž���� ������ ����� ��ȣ�� ����
		
		/*
		 DFS Ž���� �����Ͽ� �� ����� ���
		 Ž�� ����� ���� ��忡�� ����Ͽ� ���� �켱���� Ž�� �� ��带 �湮�� ������� ���
		 */
	}

}
