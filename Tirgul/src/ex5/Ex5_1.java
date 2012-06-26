package ex5;

public class Ex5_1 {
	private double num1 = Math.random();
	private double num2 = Math.random();
	
	public void printBigger(){
		System.out.println(num1+" , "+num2);
		
		if(num1>num2){
			System.out.println(num1);
		}
		if(num2>num1){
			System.out.println(num2);
		}
	}
}
