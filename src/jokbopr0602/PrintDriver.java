package jokbopr0602;

import java.awt.print.Printable;

public class PrintDriver {
	public static void main(String[] args) {
		String myDoc = "This is a repor about...";
		
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		prn = new LPrinterDriver();
		prn.print(myDoc);
		
		
}
