package exceptions;

public class Instructor {
	int students;
	
	public void doLesson () throws Exception{
		if(students == 0){
			System.out.println("Oh no!!! - throwing Exception");
			throw new Exception("Empty classroom");
		}
		
		System.out.println("Doing lesson");
	}
}
