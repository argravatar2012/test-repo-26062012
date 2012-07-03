package poly;

public class Canvas {

	//Good polymorphism practice
	public void drawShape(Shape shape){
		shape.draw();
	}
	
	//Bad polymorphism practice
	public void print(Squere squere){
		squere.draw();
	}

	public void print(Circle circle){
		circle.draw();
	}
	
}
