
public class UseOverloadSample1 {
	public static void main(String[] args) {
		int returnValue;
		
		OverloadSample1 sv = new OverloadSample1 ();
		
		returnValue = sv.sumValue(10, 20);
		System.out.println("引数2つの合計は" + returnValue + "\n");
		
		returnValue = sv.sumValue(10, 20, 30);
		System.out.println("引数3つの合計は" + returnValue);
	}
}
