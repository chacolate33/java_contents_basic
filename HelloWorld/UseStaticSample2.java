
public class UseStaticSample2 {
	public static void main(String[] args) {
		double circleArea = StaticSample2.calcCircle(10);
		System.out.println("半径10の円の面積 = " + circleArea);
		System.out.println();
		
		StaticSample2 ss2 = new StaticSample2();
		int squareArea = ss2.calcSquare(5, 8);
		System.out.println("横幅 5 :高さ 8 の四角形の面積 = " + squareArea);
	}
}
