package wrapper;

import java.util.ArrayList;

public class DemonstratWrappers {

	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		
		array.add(2); // => array.add(new Integer(2));
		array.add(6); // => array.add(new Integer(6));
		
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
			// -> array[i]
		}
		
		int a = ((Integer)array.get(0))*((Integer)array.get(1));
		System.out.println(a);
		
		
		double x = Double.parseDouble("556.5");
		System.out.println(x*2);
		
	}
}
