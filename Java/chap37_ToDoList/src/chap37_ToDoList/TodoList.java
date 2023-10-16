package chap37_ToDoList;

import java.util.*;

public class TodoList {

	private static Map<Integer,String>tasks;
	private  int nextId;
	
	public TodoList() {
		tasks = new HashMap<>();
		nextId=1;
	}
	public void addTask(String task) {
		tasks.put(nextId, task);
		nextId++;
	}
	
	public void remoceTack(int Id) {
		if(tasks.containsKey(Id)) {
			tasks.remove(Id);
		}else{
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}	
	
	public void displayTasks() {
		System.out.println("���� ���θ���Ʈ");
		System.out.println();
		for(Map.Entry<Integer, String> entry : tasks.entrySet() ) {
			System.out.println( tasks.entrySet() );
		}
	}
	public static void main(String[] args) {
		
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("���� �߰�:add ����:remove ���Ϻ���:list ����:exit �Է��ϼ���");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("������ �Է��ϼ���");
				String task = sc.nextLine();
			
				todoList.addTask(task);
			}else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try{
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.remoceTack(index);
				}catch(Exception e) {
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
				}
			}else if(choice.equalsIgnoreCase("list")) {
				for(String todo : args) {
					System.out.println(todo);
				}
			}else if(choice.equalsIgnoreCase("exit")) {
				System.out.println("����!");
				break;
			}else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("�߸��� ����Դϴ�.");
		
		
	}

}
