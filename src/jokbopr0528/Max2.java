package jokbopr0528;

public class Max2 {
	public static int getMaxValue(int[] arr) {
		int max=arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(max<arr[i]) {
				max= arr[i];
			}
		}
		return max;
	}
}
