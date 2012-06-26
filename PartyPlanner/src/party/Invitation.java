package party;

public class Invitation {
	
	private String orginizer;
	private String invitee;
	private String location;
	private float fee;
	private int day, month, year;
	
	public Invitation(String orginizer, String invitee){
		this.orginizer = orginizer;
		this.invitee = invitee;
	}

	public Invitation(String orginizer, String invitee, String location,
			float fee, int day, int month, int year) {
		this.orginizer = orginizer;
		this.invitee = invitee;
		this.location = location;
		this.fee = fee;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getOrginizer() {
		return orginizer;
	}

	public String getInvitee() {
		return invitee;
	}
	
	public void print(){
		System.out.println("orginizer:"+orginizer+", invitee:"+invitee
				+", location:"+location+", fee:"+fee+", date:"+day+"/"+month+"/"+year);
	}
	
	public String toString(){
		return "orginizer="+orginizer+"; invitee="+invitee
				+"; location="+location+"; fee="+fee+"; date="+month+"/"+day+"/"+year;
	}
	
	public void setDiscount(){
		if(day == 1){
			fee = fee*0.5F;
		}else{
			fee *= 0.95F;
		}
	}
}
