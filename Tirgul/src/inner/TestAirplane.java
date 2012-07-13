package inner;


public class TestAirplane {

	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		
		Airplane.ServiceCart serviceCart1 = airplane.new ServiceCart();
		Airplane.ServiceCart serviceCart2 = airplane.new ServiceCart();
		
		serviceCart1.doRound();
		
		airplane.setCanFeedPassangers(true);
		serviceCart1.doRound();
		
		//Static inner
		Airplane.Wing wing = new Airplane.Wing();
		
	}
}
