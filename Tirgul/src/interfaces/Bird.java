package interfaces;

public abstract class Bird implements Flyer, Animal {
	
	final public void eat(){
		System.out.println("Yummmmm!!!!");
	}
	
	public void tackoff(){
		System.out.println("flap flap");
	}
}
