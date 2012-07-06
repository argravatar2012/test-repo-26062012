package static_ex;

import java.util.Arrays;
import java.util.Collections;

public class ChairFactory {

	public void buildChairs(){
		for(int i=0;i<100;i++){
			new Chair();
		}
		System.out.println(Chair.getNumOfChairs());
	}
	public void buildChairs2(){
		for(int i=0;i<1000;i++){
			new Chair();
		}
		System.out.println(Chair.getNumOfChairs());
	}
	
	public static void main(String[] args) {
		ChairFactory chairFactory = new ChairFactory();
		chairFactory.buildChairs();
		chairFactory.buildChairs2();
	}
}
