package jokbopr0527;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		String source = "70 70 70";
		Scanner sc = new Scanner(source);
		
		int math = sc.nextInt();
		int english = sc.nextInt();
		int science = sc.nextInt();
				
		Grade me = new Grade(math, science, english);
		
		System.out.println("∆Ú±’¿∫"+me.average());
	}

}
