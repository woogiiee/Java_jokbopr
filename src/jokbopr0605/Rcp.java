package jokbopr0605;

import java.util.Scanner;

public class Rcp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int win= 0, lose=0, draw =0, fail=0;
		
		System.out.println("������ ���� ��������(�ִ� 10��)");
		
		int coin = sc.nextInt();
		
		if(coin>10) {
			System.out.println("10ȸ �̻� ����� �� �����ϴ�.");
			return;
		}
		
		System.out.println("=============GAME START============");
		System.out.println("��� ���ðڽ��ϱ�? ����[1] ����[2] ��[3]");
		for(int i=0;i<coin;i++) {
			int computer = (int)(Math.random()*3)+1;
			int user = sc.nextInt();
		}
	}
}
