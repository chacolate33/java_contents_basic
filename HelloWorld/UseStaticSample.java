
public class UseStaticSample {
	public static void main (String[] args) {
		System.out.println("クラス変数 staticNum = " + StaticSample.staticNum);
		System.out.println();
		System.out.println("-- ss1オブジェクト --");
		StaticSample ss1 = new StaticSample();
		System.out.println("インスタンス変数 num = " + ss1.num);
		System.out.println("クラス変数 staticNum = " + ss1.staticNum);
		System.out.println("-- ss2オブジェクト --");
		StaticSample ss2 = new StaticSample();
		System.out.println("インスタンス変数 num = " + ss2.num);
		System.out.println("クラス変数 staticNum = " + ss2.staticNum);
		
		
		
	}
	
}
