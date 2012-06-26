package ex6;

public class Tester {

	public void testEx6_3(){
		Ex6_3 e = new Ex6_3();
		e.usingForLoop();
	}
	
	public void testPrintRandom(){
		Ex6_3 e = new Ex6_3();
		e.printRandom();
	}
	
	public static void main(String[] args) {
		Tester t = new Tester();
		t.testPrintRandom();
	}
}
