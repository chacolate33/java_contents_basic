
public class ExceptionSample2 {
	public static void main(String[] args) {
		try {			
			int[] num;
			num = new int[3];
			
			num[3] = 10;
			System.out.println("num[3]に10を代入しました");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えています！" + e);
			e.printStackTrace();
		}
		System.out.println("正常終了");
	}
}
