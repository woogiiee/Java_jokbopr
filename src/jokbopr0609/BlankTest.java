package jokbopr0609;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BlankTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			String s = sc.nextLine();
//			if(s.equals("exit")) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			
//			StringTokenizer st = new StringTokenizer(s," ");
//			
//			int n = st.countTokens();
//			System.out.println("어절 개수는"+n);
//		}
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s," ");
			int n = st.countTokens();
			System.out.println("어절개수는"+n);
		}
	}
}
