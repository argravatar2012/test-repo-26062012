package ex;

public class Ex4 {

	int num1;
	int num2;
	
	public Ex4() {
		this.num1 = (int)(Math.random()*100)+1;
		this.num2 = (int)(Math.random()*100)+1;
	}
	
	public void printNumbers(){
		System.out.println("Numbers:"+num1+", "+num2);
	}
	
	public void printSum(){
		int sum = num1 + num2;
		System.out.println("sum = "+sum);
	}
	
	public void printAvg(){
		int sum = num1 + num2;
		float avg = sum/2F;
		System.out.println("Avg = "+avg);
	}
	
	public void printRemainder(){
		int rem1 = num1%10;
		int rem2 = num2%10;
		System.out.println("Remainder1="+rem1+", Remainder2="+rem2);
	}
	
	public void printArea(){
		int area = num1*num2;
		System.out.println("Area="+area);
	}
	
}
