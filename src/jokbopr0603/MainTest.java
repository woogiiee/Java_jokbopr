package jokbopr0603;

import java.util.Scanner;

class Calculator{
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	public static int min(int num1, int num2) {
		return num1-num2;
	}
	public static int div(int num1, int num2 ) {
		return num1/num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	
	void execute() {
		int num1, num2, result=0;
		String op;
		char yn;
		do {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.printf("ù ��° ���ڸ� ��������:");
		num1 = sc.nextInt();
		System.out.printf("�����ȣ�� ��������:");
		op = sc.next();
		System.out.printf("�� ��° ���ڸ� ��������:");
		num2 = sc.nextInt();
		
		switch (op) {
		case "+":
			result = this.add(num1,num2);
			break;
		case "-":
			result = this.min(num1,num2);
			break;
		case "/":
			result = this.div(num1,num2);
			break;
		case "*":
			result = this.mul(num1, num2);
			break;
			
		default:
			break;
			
		}System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
//		while(true) {
		
		
		System.out.print("continue? Y or N:");
		
		yn = sc.next().charAt(0);
		if(yn=='y' || yn=='Y') {
			continue;
		}else	{
			System.out.println("���α׷� ����");
		
			break;
		}
	}while(true);

}

	
}
public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.execute();
	}

}

