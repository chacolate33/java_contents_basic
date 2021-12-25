
public class WrapperSample {
	public static void main(String[] args) {
		int num = 20;
		Integer iNum = num;
		
		double dNum = iNum.doubleValue();
		
		String str = "12.3";
		
		double dNum2 = Double.parseDouble(str);
		
		System.out.println("int型のnum: " + num);
		System.out.println("文字列型のstr : " + str);
		System.out.println("double型のdNum2 : " + dNum2);
		System.out.println();
		System.out.println("double型に変換したので小数点以下を持つ");
		System.out.println("double型のdNum : " + dNum);
		System.out.println();
		System.out.println("double型に変換したので計算可能");
		System.out.println("dNum2 × 2 = " + (dNum2 * 2));
	}
}
