
public class UseOriginalException {
	public static void main(String[] args) {
		try {
		OriginalException oe = new OriginalException("独自の例外");
		throw oe;
		} catch (OriginalException e) {
		System.out.println("強制的に独自例外を発生しました" + e);
		}
	}
}
