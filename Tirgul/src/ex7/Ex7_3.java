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
		
		
		
	}
	
	public static void main(String[] args) {
		Ex7_3 e = new Ex7_3();
		e.eliminate();
	}
}
