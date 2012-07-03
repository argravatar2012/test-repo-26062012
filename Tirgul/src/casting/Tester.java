package casting;

public class Tester {

	public void test1() {
		Animal a = new Dog();
		if (a instanceof Dog) {
			Dog temp = (Dog) a;
			temp.bark();
		}
	}

	public void test2() {
		Animal a = new Dog();
		if (a instanceof Dog) {
			((Dog) a).bark();
		}
	}
	public void test3() {
		Animal a = new Dog();
		a = new Cat();
		if(a instanceof Dog){
			((Dog) a).bark();
		}else if(a instanceof Cat){
			((Cat) a).miau();
		}else{
			System.out.println("Un-known animal...");
		}
		/* Big no-no
		Dog d = new Dog();
		Cat c = new Cat();
		d = (Dog)c;
		*/
	}
	public void test4() {
		Animal a = new Dog();
		((Dog) a).bark();
		
		((Cat) a).miau();
		/* Big no-no
		Dog d = new Dog();
		Cat c = new Cat();
		d = (Dog)c;
		*/
	}

	public static void main(String[] args) {
		Tester t = new Tester();
		t.test1();
		t.test2();
		t.test3();
		t.test4();
	}
}
