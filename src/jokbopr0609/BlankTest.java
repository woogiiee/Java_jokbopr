package jokbopr0609;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BlankTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			String s = sc.nextLine();
//			if(s.equals("exit")) {
//				System.out.println("�����մϴ�.");
//				break;
//			}
//			
//			StringTokenizer st = new StringTokenizer(s," ");
//			
//			int n = st.countTokens();
//			System.out.println("���� ������"+n);
//		}
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s," ");
			int n = st.countTokens();
			System.out.println("����������"+n);
		}
	}
}
