package arrays;

import java.util.Arrays;

public class MoreSorts {

	public void sort(int[] a){
		Arrays.sort(a);
	}
	
	public static void main(String[] args) {
		MoreSorts ms = new MoreSorts();
		int[] array = new int[]{999,3,6,1,9,5,2,0,8,-55,100,22};
		ms.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
}
