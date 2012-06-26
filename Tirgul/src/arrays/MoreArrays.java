package arrays;

public class MoreArrays {

	public void testStringArray(){
		String[] names = new String[]{
			"Assaf","Moshe","Avi", "Eli"	
		};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//This will cause an exception
		System.out.println(names[4]);
	}
	
	public void testMultiDimention(){
		int[][] multi = new int[10][10];
		
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				multi[i][j] = (i+1)*(j+1);
			}
		}
		
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
	
	public void initMulti(){
		//Not recommended...
		int[][] multi = new int[][]{
				{1,2,3,4},
				{5,6,7,8,9}
		};
		
		System.out.println("multi.length:"+multi.length);
		System.out.println("multi[0].length:"+multi[0].length);
		System.out.println("multi[1].length:"+multi[1].length);
	}
	
	public void testArrayCopy(){
		int a[] = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*100);
			System.out.print(a[i]+"\t");
		}
		System.out.println("");
		
		
		int b[] = new int[a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println("");
		
		int c[] = new int[5];
		
		System.arraycopy(a, 0, c, 0, c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"\t");
		}
		
		System.out.println("");
		
		System.arraycopy(a, 2, c, 0, c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"\t");
		}
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		MoreArrays m = new MoreArrays();
		//m.testStringArray();
		//m.testMultiDimention();
		//m.initMulti();
		m.testArrayCopy();
	}
}
