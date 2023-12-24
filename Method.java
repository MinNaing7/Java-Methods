public class Method {

	public static void main(String[] args) {
		System.out.println("MESSAGE: " + getMessage());
	}

	public static void hello() {
		System.out.println("Hello...");
	}

	public static int getNumber() {
		return 109110;
	}

	public static void add() {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println("ADD: " + c);
	}

	public static String getMessage() {
		System.out.println("Hello Message!");
		return "Hi";
	}
}