
public class OverloadSample1 {
	int sumValue(int value1, int value2) {
		System.out.println("引数が2つのsumValueメソッドが呼び出されました");
		System.out.println("値1:" + value1 + " 値2:" + value2);
		return(value1 + value2);
	}
	
	int sumValue(int value1, int value2, int value3) {
		System.out.println("引数が3つのsumValueメソッドが呼び出されました");
		System.out.println("値1" + value1 + " 値2:" + value2 + " 値3:" + value3);
		return(value1 + value2 + value3);
	}
}
