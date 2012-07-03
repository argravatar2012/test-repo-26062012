package poly;

public class CanvasTester {
	//Good
	public void testPoly(){
		Canvas canvas = new Canvas();
		/*
		...
		*/
		Shape shape;
		
		if(System.nanoTime() % 2 == 0){
			shape = new Squere();
		}else{
			shape = new Circle();
		}
		
		canvas.drawShape(shape);
		
	}
	
	//Bad
	public void testNonPoly(){
		Canvas canvas = new Canvas();
		
		if(System.nanoTime() % 2 == 0){
			Squere sq = new Squere();
			canvas.print(sq);
		}else{
			Circle ci = new Circle();
			canvas.print(ci);
		}
		
	}
	
	
	public static void main(String[] args) {
		CanvasTester ct = new CanvasTester();
		ct.testPoly();
		ct.testNonPoly();
	}
}
