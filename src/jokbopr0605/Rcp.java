package jokbopr0605;

import java.util.Scanner;

public class Rcp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int win= 0, lose=0, draw =0, fail=0;
		
		System.out.println("코인을 집어 넣으세요(최대 10판)");
		
		int coin = sc.nextInt();
		
		if(coin>10) {
			System.out.println("10회 이상 사용할 수 없습니다.");
			return;
		}
		
		System.out.println("=============GAME START============");
		System.out.println("어떤걸 내시겠습니까? 가위[1] 바위[2] 보[3]");
		for(int i=0;i<coin;i++) {
			int computer = (int)(Math.random()*3)+1;
			int user = sc.nextInt();
		}
	}
}
