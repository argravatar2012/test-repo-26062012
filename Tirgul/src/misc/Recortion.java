package misc;

public class Recortion {

	public void doSomethig(int i){
		if(i>10){
			return;
		}
		doSomethig(i+1);
		System.out.println("Doing something: "+i);
		
	}
	
	public static void main(String[] args) {
		Recortion r = new Recortion();
		r.doSomethig(5);
	}
}
