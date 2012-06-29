package inheritance;

public class Circle extends Shape{

	private int radius;
	public Circle(int radius) {
		super("My Shape");
		this.radius = radius;
		this.area = Math.PI*radius*radius;
		System.out.println(super.getArea());
	}
	
	public double getArea(){
		System.out.println("Getting area");
		return getArea();
	}
}
