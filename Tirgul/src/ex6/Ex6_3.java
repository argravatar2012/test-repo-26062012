package ex6;

public class Ex6_3 {
	
	//Using for loop
	public void usingForLoop(){
		int random = (int)(Math.random()*1000);
		System.out.println("Prining even numbers from 0 to "+random);
		for(int i=2;i<random;i+=2){
			System.out.println(i);
		}
		/* Not encouraged
		for (int i = 0; i < random; i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}*/
	}
	
	public void usingWhileLoop(){
		int random = (int)(Math.random()*1000);
		System.out.println("Prining even numbers from 0 to "+random);
		int i=2;
		while(i<random){
			System.out.println(i);
			i+=2;
		}
	}
	
	
	public void printRandom(){
		int num = 0;
		int counter = 0;
		while(num<900){
			num = (int)(Math.random()*1001);
			counter++;
		}
		System.out.println("It took "+counter+" tries to get "+num);
	}

}
