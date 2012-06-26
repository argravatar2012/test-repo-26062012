package ex;

public class ForLoop {

	public void printNumbers(){
		for(int i=1;i<=1000;i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ForLoop forLoop = new ForLoop();
		forLoop.printNumbers();
	}
}
