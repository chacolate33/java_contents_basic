import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionSample3 {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] resort = {"1: 「ハワイ」", "2:「バリ島」", "3:「ケアンズ」"};
		for (String place : resort) {
			System.out.print(place + " ");
		}
		System.out.println();
		
		try {
			System.out.println("好きなリゾート地を選んで番号を入力してください");
			String inputNum = reader.readLine();
			int intNum = Integer.parseInt(inputNum);
			System.out.println("選んだ場所は、" + resort[intNum - 1] + "です");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\n選択肢以外の数値が入力されました！！");
		} catch(Exception e) {
			System.out.println("\n何かの例外が発生しました！！");
		}
		System.out.println("正常終了");
	}
	}
