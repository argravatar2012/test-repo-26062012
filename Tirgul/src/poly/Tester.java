package poly;

public class Tester {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Circle circle = new Circle();
		circle.draw();
		
		Shape myCircle = new Circle();
		myCircle.draw();
		myCircle.sayHi();
		//Will not work: myCircle.getRadius();
		
		//will not work: Circle circle2 = new Shape();
	}
}
