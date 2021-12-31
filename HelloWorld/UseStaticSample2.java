
public class UseStaticSample2 {
	public static void main(String args[]) {
		
		System.out.println("半径 10 の面積 = ");
		System.out.println(StaticSample2.calcCircle(10));
		System.out.println();
		
		StaticSample2 ss2 = new StaticSample2();
		System.out.println("横幅 5 :高"
				+ "さ 8 の四角形の面積 = " +  ss2.calcSquare(5, 8));
		
		
		
	}
}
