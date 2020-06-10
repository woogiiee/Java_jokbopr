package jokbopr0528;

public class Mainsort {

	
	
	public static int[]	getSortDESC(int[] arr) {
		int temp = 0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0 ; j<arr.length -i -1;j++) {
				if(arr[j]<arr[j+1]) {//부등호만 바꿔주면 오름차순으로 바꿔진다
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
}

