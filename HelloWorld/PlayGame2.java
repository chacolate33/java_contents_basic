
public class PlayGame2 {
	public static void main(String[] args) {
		Fighter c1 = new Fighter();
		Wizard2 c2 = new Wizard2();
		c1.name = "戦士ハロー";
		c2.name = "魔法使いワールド";
		
		System.out.println(c1.name + "と" + c2.name + "が冒険に出た\n");
		System.out.println("---" + c1.name + "のターン---");
		c1.attack();
		System.out.println("---" + c2.name + "のターン---");
		c2.move();
		c2.attack();
		
	}
}
