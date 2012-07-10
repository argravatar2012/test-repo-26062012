package ex_8;

public class Cube extends Square {
	
	public int getVolume(int base){
		int a = super.getVolume(base);
		return a*base;
	}
}
