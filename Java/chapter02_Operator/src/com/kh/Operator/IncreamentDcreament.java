package com.kh.Operator;

public class IncreamentDcreament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3.증감 연산자(increament,decreament)
		//증감 연산자는 변수의 값을 1씩 증가시키거나 감소시킬 때 사용
		//전위 증감 연산자(++x,--x) 후위 증감 연산자(x++,x--)
		/* * 1-1)전위 증감 연산자
		 * ++항의 값에 1을 더한다
		 * val = ++num;//num의 값이 1이 증가한 후 vam의 변수에 대해 대입
		 * val = --num;//num의 값이 1이 감소한 후 vam의 변수에 대해 대입
		 * */
		int val,val2;
		
		int num1 =10;
		
		val = ++num1; //num의 값이 1이 증가한 후 val의 값이 대입되기 떄문에 11이 대입
		System.out.println(val);
		
		val2 = --num1; //num의 값이 1이 감소한 후 val의 값이 대입
		System.out.println(val2);
		
		//1-2 후위 증감 연산자 : ++항의 값에 1을 더한다.
		int val3, val4;
		int num2 =10;
		System.out.println("num2의 값 : " + num2);
		val3 =num2++; //val2 변수에 기존 num3의 값을 대입한 후에 num3 값 증가
		//1번 val3=num2 값 추가하자
		//2번 num ++1 추가하자
		System.out.println(val3);
		System.out.println(num2);
		
		val4 = num2--;
		System.out.println("val4 : "+val4);
		System.out.println("num2의 값 : "+num2);
		
		
		
		
		

	}

}
