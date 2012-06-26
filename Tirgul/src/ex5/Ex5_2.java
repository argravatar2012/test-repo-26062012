package ex5;

public class Ex5_2 {
	private int num = (int)(Math.random()*100);
	
	public Ex5_2(){
		System.out.println(num);
		if(num>50){
			System.out.println("Big !");
		}else{
			if(num<50){
				System.out.println("Small !");
			}else{
				System.out.println("Bingo !");
			}
		}
	}
	
}
