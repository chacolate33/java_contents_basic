import java.util.ArrayList;
public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList<String> resort = new ArrayList<>();
		
		resort.add("ハワイ");
		resort.add("バリ島");
		System.out.println("行きたいリゾート地:" + resort);
		System.out.println("要素の数:" + resort.size());
		System.out.println();
		
		System.out.println("----要素を追加----");
		resort.add("ケアンズ");
		System.out.println("行きたいリゾート地:" + resort);
		System.out.println("要素の数:" + resort.size());
		System.out.println();
		
		for (int i = 0; i < resort.size() ; i++) {
			System.out.println("index番号" + i + "番の要素:" + resort.get(i));
		}
		System.out.println();

		System.out.println("----index番号1番の要素を削除----");
		resort.remove(1);
		System.out.println("行きたいリゾート地:" + resort);
		System.out.println("要素の数:" + resort.size());
	}
}
