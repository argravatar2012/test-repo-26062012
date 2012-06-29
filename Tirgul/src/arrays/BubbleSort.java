package arrays;

public class BubbleSort {

	public void sort(int[] a){
		int n = a.length;
		boolean changed = false;
		do{
			changed = false;
			for (int i = 1; i < n; i++) {
				if(a[i-1]>a[i]){
					int temp = a[i];
					a[i] = a[i-1];
					a[i-1] = temp;
					changed = true;
				}
			}
			
		}while(changed);
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		
		int[] array = new int[]{999,3,6,1,9,5,2,0,8,-55,100,22};
		bs.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
}
