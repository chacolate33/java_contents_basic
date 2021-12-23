
public class UseLocker {
	public static void main(String[] args) {
		
	Locker loc1 = new Locker();
	
	loc1.data = 10;
	System.out.println("loc1のdata: " + loc1.data);
	
	Locker loc2 = loc1;
	System.out.println("loc2のdata: " + loc2.data + "\n");

	loc1.data = 500;
	System.out.println("loc1のdata: " + loc1.data);
	System.out.println("loc2のdata: " + loc2.data);
	}
}
