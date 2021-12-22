
public class UseCharacterSample2 {
	public static void main(String[] args) {
		CharacterSample2 chara1 = new CharacterSample2("ハロー", 100);
		CharacterSample2 chara2 = new CharacterSample2("ワールド", 50);
		
		System.out.println("---キャラクター1---");
		System.out.println("名前：" + chara1.name);
		System.out.println("HP：" + chara1.hp + "\n");
		System.out.println("---キャラクター2---");
		System.out.println("名前：" + chara2.name);
		System.out.println("HP：" + chara2.hp);
	}
}
