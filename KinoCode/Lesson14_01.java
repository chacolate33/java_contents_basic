class Student {
	String name;
	
	public double calculateAvg(double[] data) {
		int sum = 0;
		for(int i = 0; i < data.length ; i++) {
			sum += data[i];
		}
		double Avg = sum/data.length;
		return Avg;
	}
	
	public String judge(double Avg) {
		String result;
		if(Avg >= 60) {
			result = "passed";
		} else {
			result = "failed";
		}
		return result;
	}
}

public class Lesson14_01 {
	public static void main(String[] args) {
		Student a001 = new Student();
		a001.name = "sato";
		double[] data = {1, 2, 3, 4, 5};
		double Avg = a001.calculateAvg(data);
		String result = a001.judge(Avg);
		System.out.println(Avg);
		System.out.println(a001.name + "" + result);
	}
 }