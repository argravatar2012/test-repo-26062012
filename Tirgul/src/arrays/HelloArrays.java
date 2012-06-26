package arrays;

public class HelloArrays {

	public void firstEx(){
		
		int[] numbers = new int[10];
		for(int i=0;i<10;i++){
			numbers[i] = i*2;
		}
		System.out.println("Done initialization");
		for(int i=0;i<10;i++){
			System.out.println(numbers[i]);
		}
		
	}
	
	public void firstEx2(int numOfNumbers){
		
		int[] numbers = new int[numOfNumbers];
		System.out.println("numbers.length:"+numbers.length);
		
		for(int i=0;i<numbers.length;i++){
			numbers[i] = (int)(Math.random()*100);
		}
		System.out.println("Done initialization");
		int sum = 0;		
		for(int i=0;i<numbers.length;i++){
			sum += numbers[i];
		}
		System.out.println(sum/(float)numbers.length);
		
	}
	
	public void firstEx3(){
		int[] a = new int[]{1,2,3,4};
		System.out.println("Length="+a.length);
		for (int i = a.length-1; i >=0 ; i--) {
			System.out.println(a[i]);
		}
	}
	
	public void findMax(){
		//Find the max value of an array
		int[] numbers = new int[50];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*100);
			System.out.print(numbers[i]+" ");
		}
		System.out.println("---");
		
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]){
				max = numbers[i];
				maxIndex = i;
			}
		}
			
		System.out.println("Max:"+max);
		System.out.println("Max Index:"+maxIndex);
		
	}
	public static void main(String[] args) {
		HelloArrays helloArrays = new HelloArrays();
		helloArrays.findMax();
	}
	
}
