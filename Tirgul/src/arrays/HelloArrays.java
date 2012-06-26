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
	
	public static void main(String[] args) {
		HelloArrays helloArrays = new HelloArrays();
		helloArrays.firstEx2(10000000);
	}
	
}
