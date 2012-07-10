package interfaces;

public class Eagle extends Bird implements Animal,Flyer{

	public void tackoff() {
		System.out.println("Eagle: Tackoff");
	}

	public void land() {
		System.out.println("Eagle: land");
	}

	public void fly() {
		System.out.println("Eagle: fly");
	}

	public void shit() {
		System.out.println("Eagle: shit");
	}

}
