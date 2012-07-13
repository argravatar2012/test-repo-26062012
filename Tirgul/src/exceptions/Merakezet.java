package exceptions;

public class Merakezet {

	public void sendInstructor(){
		Instructor inst = new Instructor();
		try {
			inst.doLesson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The problem is:"+e.getMessage());
			
			System.out.println("I'm sorry");
		}
	}
	
	public void sendInstructor2() throws Exception{
		Instructor inst = new Instructor();
		inst.doLesson();
	}
	
	public void sendInstructor3() throws Exception{
		Instructor inst = new Instructor();
		try {
			inst.doLesson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The problem is:"+e.getMessage());
			System.out.println("I'm sorry");
			throw e;
		}
	}
}
