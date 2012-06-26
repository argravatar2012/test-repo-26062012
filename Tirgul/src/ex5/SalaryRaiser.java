package ex5;

public class SalaryRaiser {

	private int oldSalary = (int)(Math.random()*1001)+5000;
	
	public int raiseSalary1(){
		int newSalary = (int)( this.oldSalary * 1.1f);
		if(newSalary >= 6000){
			newSalary = oldSalary;
		}
		return newSalary;
	}
	
	public int raiseSalary2(){
		if(this.oldSalary * 1.1f >= 6000){
			return this.oldSalary;
		}else{
			int newSalary = (int)( this.oldSalary * 1.1f);
			return newSalary;
		}
	}
	
	public int raiseSalary3(){
		if(this.oldSalary * 1.1f < 6000){
			int newSalary = (int)( this.oldSalary * 1.1f);
			return newSalary;
		}else{
			return oldSalary;
		}
	}
	
}
