
public class PlaySample {
	public static void main (String[] args) {
		PlayIF player;
		if (Integer.parseInt(args[0]) == 1) {
			player = new CDPlayer();
		} else {
			player = new BDPlayer();
		}
		System.out.println(player.name + "\n");
		player.play();
	}
}
