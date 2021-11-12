
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			int answer;
			System.out.println(number * number);
			number++;
		}
		
		int[] array = {3, 10, 9, 2};
		for (int count = 0; count < array.length; count++) {
			System.out.println(array[count]);
		}
		
		for (int content :array) {
			if (content % 2 == 0) {
				continue;				
			}
			System.out.println(content);
			
		}
	}
}
