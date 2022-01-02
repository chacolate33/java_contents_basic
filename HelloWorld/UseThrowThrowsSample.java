import java.io.IOException;
public class UseThrowThrowsSample {
	public static void main(String[] args) {
		try {
			ThrowThrowsSample tt = new ThrowThrowsSample();
			int i = Integer.parseInt(args[0]);
			tt.testMethod(i);
			System.out.println("メソッド呼び出し完了");
		} catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("NumberFormatException例外:" + e);
		} catch(IOException e) {
			System.out.println("IOException例外:" + e);
		}
	}
}
