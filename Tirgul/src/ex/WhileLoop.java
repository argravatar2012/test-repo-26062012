package ex;

public class WhileLoop {
	
	public WhileLoop(){
		int n = 0;
		
		while(n*n<1000000){
			System.out.println("n^2 = "+n*n);
			n++;
		}
	}

	
	public static void main(String[] args) {
		WhileLoop whileLoop = new WhileLoop();
	}
}
