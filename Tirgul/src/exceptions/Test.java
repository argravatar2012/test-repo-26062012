package exceptions;

public class Test {

	public static void main(String[] args)  {
		Merakezet merakezet = new Merakezet();
		
		merakezet.sendInstructor();
		
		try {
			merakezet.sendInstructor2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			merakezet.sendInstructor3();
		} catch (Exception e) {
			
		}
		
		System.out.println("Normal shut down");
	}
}
