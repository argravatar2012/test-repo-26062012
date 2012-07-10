package abs;

public abstract class Animal {

	protected int age;
	
	public abstract void makeSound();
	
	public void actSurprised(){
		System.out.println("Ahhhh!!!!");
		makeSound();
	}
	
}
