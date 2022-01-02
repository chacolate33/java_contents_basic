
public class A {
	public static void main(String[] args) {
		try {
//			if(num < 10) {
//				throw new Exception("範囲外の値です");
//			}
			B c = new B();
			c.method(100);
		} catch(Exception e) {
			System.out.println("例外発生！");
		}
		System.out.println("正常終了");
	}
}
