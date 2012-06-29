package inheritance;

public class Shape {

	protected double area;
	
	public Shape(){
		System.out.println("Shape created");
	}
	public Shape(String s){
		System.out.println("Shape created :: "+s);
	}
	public double getArea(){
		return area;
	}
}
