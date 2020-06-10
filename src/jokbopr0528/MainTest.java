package jokbopr0528;

import java.util.Random;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class colorTV extends TV {
	private int inch;

	public colorTV(int size, int inch) {
		super(size);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void printProperty() {
		System.out.println(super.getSize() + "ÀÎÄ¡´Â" + this.getInch());
	}
}
	public class MainTest {
		public static void main(String[] args) {
//		int[] arr = new int[10];
//		
//		Random random = new Random();
//		
//		for(int i = 0;i<arr.length;i++) {
//			arr[i]=random.nextInt(100)+1;
//			System.out.println(arr[i]);
//		}
//		int max = Max2.getMaxValue(arr);
//		System.out.println(max);
//		System.out.println("=====================================");

//		int[] arr2= new int[10];
//		int[] sortArr = getSortDESC(arr);
//			

			colorTV myTV = new colorTV(32, 1024);
			myTV.printProperty();
		}
	}



