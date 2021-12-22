
public class UseCharacterSample1 {
	public static void main(String[] args) {
		CharacterSample1 cs1 = new CharacterSample1();
		
		cs1.name = "ハロー";
		cs1.job = "勇者";
		cs1.hp = 100;
		cs1.mp = 50;
		
		System.out.println("名前:" + cs1.name);
		System.out.println("ジョブ:" + cs1.job);
		System.out.println("HP:" + cs1.hp);
		System.out.println("MP:" + cs1.mp);
	}
}
