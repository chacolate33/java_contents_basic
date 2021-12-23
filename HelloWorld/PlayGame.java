public class PlayGame {
	public static void main(String[] args) {
		Wizard player = new Wizard();
		player.name = "魔法使いハロー";
		
		System.out.println(player.name + "が冒険に出た" + "\n");
		
		player.main();
		player.castSpell();
		
	}
}