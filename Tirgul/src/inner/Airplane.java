package inner;

public class Airplane {
	private boolean canFeedPassangers;
	
	private ServiceCart[] serviceCarts = new ServiceCart[2];
	
	private Captain captain;
	private Captain coPilot;
	
	public Airplane() {
		serviceCarts[0] = new ServiceCart();
		serviceCarts[1] = new ServiceCart();
		
		captain = new Captain(){
			public void fly() {
				System.out.println("Flying the airplane");
			}
		};
		coPilot = new Captain() {
			public void fly() {
				System.out.println("I'm a co-pilot");
			}
		};
		
	}
	
	public class ServiceCart{
		String code;
		
		public void doRound(){
			if(canFeedPassangers){
				System.out.println("Doing round");
			}else{
				System.out.println("Not doing round");
			}
		}
	}

	public void setCanFeedPassangers(boolean canFeedPassangers) {
		this.canFeedPassangers = canFeedPassangers;
	}
	
	public static class Wing{
		private int length;
		private int width;
	}
	
}
