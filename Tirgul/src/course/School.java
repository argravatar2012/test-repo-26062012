package course;

public class School {

	public void operate(){
		ClassRoom classRoom = new ClassRoom();
		Group g1 = new WebDev();
		
		Group g2 = new MobileDev();
		
		Group g3 = new DbAdmin();
		
		System.out.println(g1);
		System.out.println(g2);
		
		classRoom.active(g1);
		classRoom.active(g2);
		classRoom.active(g3);
	}
	
	public static void main(String[] args) {
		School school = new School();
		school.operate();
	}
}
