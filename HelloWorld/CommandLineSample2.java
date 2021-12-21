
public class CommandLineSample2 {
	public static void main(String[] args) {
//		データ型変換
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= num ; i++) {
			System.out.println(i + "回目の挨拶");
			printGreet();
		}
	}
	
	public static void printGreet() {
		System.out.println("いらっしゃいませ！");
		System.out.println("毎度ありがとうございます！");
		System.out.println();		
	}
}
