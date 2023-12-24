public class RandomMethod {
	public static void main(String[] args) {

		int[] arr = new int[3];
		int result = 0;

		for (int x = 0; x < arr.length; x++) {
			arr[x] = (int)(Math.random() * 5);
			result += arr[x];
			System.out.println(arr[x]);
		}

		System.out.println("Total : " + result);
	}
}