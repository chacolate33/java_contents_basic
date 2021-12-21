public class CommandLineSample1 {
	public static void main(String[] args) {
		
//		コマンドライン引数の数をlengthで取得して表示
		System.out.println("args.length の値は" + args.length);
		
//		引数の数分繰り返し
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]の値は" + args[i] + "です。");
		}
	}
}
