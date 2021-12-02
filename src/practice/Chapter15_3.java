package practice;

public class Chapter15_3 {
	public static void main(String[] args) {
		int i1 = 123;
		double d1 = i1;
		System.out.println(d1);
	
		double d2 = 12.345;
		int i2 = (int) d2;
		System.out.println(i2);
		
		int i3 = 1;
		int i4 = 2;
		double d3 = i3;
		double d4 = i4;
		double d5 = d3 / d4;
		System.out.println(d5);
		
		int i5 = -128;
		byte b1 = (byte) i5;
		System.out.println(b1);
	}
}
