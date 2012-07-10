package interfaces;

public class BirdManager {

	public void testFlight(Flyer flyer){
		flyer.tackoff();
		flyer.fly();
		flyer.land();
	}
	
	public void testAnimal(Animal animal){
		animal.eat();
		animal.shit();
		
		if(animal instanceof Dove){
			Dove d = (Dove) animal;
			d.doNothing();
		}
	}
	
	public static void main(String[] args) {
		BirdManager manager = new BirdManager();
		
		Eagle eagle = new Eagle();
		
		manager.testFlight(eagle);
		manager.testAnimal(eagle);
		
		Dove dove = new Dove();
		manager.testFlight(dove);
		manager.testAnimal(dove);
		
	}
}
