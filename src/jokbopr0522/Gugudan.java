package jokbopr0522;

public class Gugudan {
	int dan;
	
	Gugudan(int dan){
		this.dan = dan;
	}
	void setDan(int dan) {
		this.dan =dan;
	}
	void show() {
		for(int i=1;i<=9;i++) {
		System.out.println(dan+"x"+i+"="+(dan*i));
	}
}
}