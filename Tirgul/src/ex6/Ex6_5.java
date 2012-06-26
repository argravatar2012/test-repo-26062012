package ex6;

public class Ex6_5 {
	
	public void subEx1(){
		int randomNumber = (int)(Math.random()*1000000)+1;
		int numOfDigits = this.countDigits(randomNumber);
		System.out.println("Random "+ randomNumber + " has "+numOfDigits+" digits");
	}
	
	public void subEx1_2(){
		int randomNumber = 0;
		int numOfDigits = 0;
		int counter = 0;
		do{
			randomNumber = (int)(Math.random()*1000000)+1;
			numOfDigits = this.countDigits(randomNumber);
			counter++;
		}while(numOfDigits==6);
		System.out.println("Random "+ randomNumber + " has "+numOfDigits+" digits - took "+counter);
	}
	
	
	private int countDigits(int num){
		int counter = 0;
		while(num!=0){
			num = num/10;
			counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Ex6_5 e = new Ex6_5();
		e.subEx1_2();
	}
}
