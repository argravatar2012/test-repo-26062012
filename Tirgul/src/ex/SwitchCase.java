package ex;

public class SwitchCase {
	int dayOfWeek;
	
	public SwitchCase(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public void testV1(){
		System.out.println(dayOfWeek);
		if(dayOfWeek == 1){
			System.out.println("Sunday");
		}else if(dayOfWeek == 2){
			System.out.println("Monday");
		}else if(dayOfWeek == 3){
			System.out.println("Tuseday");
		}else if(dayOfWeek == 4){
			System.out.println("Wensday");
		}else if(dayOfWeek == 5){
			System.out.println("Thursday");
		}else{
			System.out.println("Week end");
		}
	}
	
	public void testV2(){
		System.out.println(dayOfWeek);
		switch (dayOfWeek) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuseday");
			break;
		case 4:
			System.out.println("Wensday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Week end");
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		SwitchCase sc = new SwitchCase((int)(Math.random()*7)+1);
		sc.testV2();
	}
	
}
