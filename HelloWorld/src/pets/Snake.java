package pets;

public class Snake {
	String name = "sssss";

	int legth;
	boolean isDeadly;
	double weight;
	
	public void print(){
		
		String name = "ffffffffffff";
		
		System.out.println(name);
		System.out.println(legth);
		System.out.println(isDeadly);
		System.out.println(weight);
	}
	
	public void print2(){
		
		String name = "ffffffffffff";
		
		float f = (float) weight/2;
		
		double d = f*30;
		
		System.out.println(name);
		System.out.println(legth);
		System.out.println(isDeadly);
		System.out.println(weight);
	}
	
	public String toString(){
		return "I am a snake and my name is "+name +" am I deady?"+isDeadly;
	}
}
