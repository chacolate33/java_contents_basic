
public class StringSample2 {
	public static void main(String[] args) {
		String str1 = "helloWorld";
		
		String str2 = "hello";
		str2 = str2 + "World";
		
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println();
		System.out.println("str1(toUpper):" + str1.toUpperCase());
		System.out.println("str1(length):" + str1.length());
		System.out.println();
		
		if(str1 == str2) {
			System.out.println("str1 == str2 : true");
		} else {
			System.out.println("str1 == str2 : false");
		}
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2) : true\n");
		} else {
			System.out.println("str1.equals(str2) : false\n");
		}
		if(str1.equals("")) {
			System.out.println("str1は空です");
		} else {
			System.out.println("str1は空ではありません");
		}
		
	}
}
