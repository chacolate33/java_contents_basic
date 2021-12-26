
public class PlayGame3 {
	public static void main(String[] args) {
		Fighter3 c1 = new Fighter3();
		Wizard3 c2 = new Wizard3();
		c1.name = "戦士ハロー";
		c2.name = "魔法使いワールド";
		
		System.out.println(c1.name + "と" + c2.name + "が冒険にでた\n");
		System.out.println("---" + c1.name + "のターン---");
		c1.attack();
		System.out.println("---"  + c2.name + "のターン---");
		c2.attack();
	}
}
