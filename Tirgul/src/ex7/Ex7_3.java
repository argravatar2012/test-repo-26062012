package ex7;

public class Ex7_3 {

	public void eliminate(){
		int []a = new int[10];
		int maxNum = 10;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*maxNum);
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
		
		int counter = 0;
		for (int j = 0; j < maxNum; j++) {
			for (int i = 0; i < a.length; i++) {
				if(a[i]==j){
					counter++;
					break;
				}
			}
		}
		
		System.out.println(counter);
		
		int b[] = new int[counter];		
		
		int k=1; //current index of b array
		b[0] = a[0]; //assign the first - always unique
		boolean found = false; //Will be used to indicate if the number exists
		for(int i=1;i<a.length;i++){ //Start from 1  - 0 is already set
			int num = a[i]; //get the current number to check
			for(int j=k-1;j>=0;j--){
				if(b[j]==num){
					found = true;
					break;
				}
			}
			if(!found){
				b[k] = num;
				k++;
			}
			found = false;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		
	}
	
	public static void main(String[] args) {
		Ex7_3 e = new Ex7_3();
		e.eliminate();
	}
}
