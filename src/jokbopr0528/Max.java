package jokbopr0528;
//���� �Ѱ�
import java.util.Arrays;
import java.util.Random;

class MaxValue {

	int[] execute() {

		int[] arr = new int[10];

		int min = 1;
		int max = 100;

		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (random.nextInt((max - min) + 1) + min);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("�ߺ��� ��ȣ ����" + arr[j]);
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		return arr;
	}

	static int getMaxValue(int[] arr) {

		Arrays.sort(arr);
		System.out.println("�ִ밪��: " + arr[arr.length - 1]);
		return arr[arr.length - 1];
	}
}

public class Max {
	public static void main(String[] args) {

		MaxValue maxvalue = new MaxValue();
		maxvalue.execute();

		int[] arr = maxvalue.execute();
		int max = MaxValue.getMaxValue(arr);

	}

}


