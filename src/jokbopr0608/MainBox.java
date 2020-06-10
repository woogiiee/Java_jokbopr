package jokbopr0608;

public class MainBox {
	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
		Box<Double> dBox = BoxFactory.<Double>makeBox(7.59);
		System.out.println(sBox.get());
		System.out.println(dBox.get());
	}
}
