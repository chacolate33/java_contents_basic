import java.io.IOException;
public class ThrowThrowsSample {
	void testMethod(int i) throws IOException{
		String str = "a";
		if(i == 0) { 
			System.out.println(Integer.parseInt(str));
		} else if (i == 1) {
			throw new IOException();
		} else {
			System.out.println("例外無し");
		}
	}
}
