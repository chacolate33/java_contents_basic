
public class Object {
	public static void main(String[] args) {
//	String x = new String("あ");
//	String y = new String("あ");
	Dessert x = Dessert.APPLE;
	Dessert y = Dessert.APPLE;
	System.out.println(x == y);
	System.out.println(x.equals(y));
	
	System.out.println(Dessert.APPLE.name());
	System.out.println(x.name());
	
	Dessert apple = Dessert.valueOf("APPLE");
	System.out.println(apple);
	
	Dessert orange = Dessert.valueOf("ORANGE");
	
	}
}
