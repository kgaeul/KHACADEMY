package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		Animal[] Animal = new Animal[3];

		Animal[0]= new Animal("[�䳢]","���ѱ���","���",5);
		Animal[1]=new Animal("[������]","�쳢��","�ٳ���",7);
		Animal[2]=new Animal("[����]","������","���",9);
		
		for(int i=0;i<Animal.length;i++) {
			System.out.println(Animal[i].name +"�� "+ Animal[i].sound+" �Ҹ��� �����. "
					+ Animal[i].name +"�� "+ Animal[i].���� +"�� �Ծ��. " 
					+ Animal[i].name +"�� "+Animal[i].����+"�� �̿��� ." );
		}
		
		System.out.println("================================");	
		
		List<String>Animal1= new ArrayList<>();
		
		Animal1.add("[�䳢]");
		Animal1.add("[������]");
		Animal1.add("[����]");
						
		for(String Animals : Animal1) {
			System.out.print(Animals+ " ");
		}
	}

	

}
