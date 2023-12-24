public class MethodLesson {
	public static void main(String[] args) {
		System.out.println("Built-in (Standard Library)");
		System.out.println("MAX : " + Math.max(2,2));
		System.out.println("MIN : " + Math.min(2,4));
		System.out.println("POW : " + Math.pow(2,4));
		System.out.println("Customize");
		System.out.println("MAX : " + MethodLesson.maximum(528,1500));
		System.out.println("MIN : " + MethodLesson.minimum(528,1500));
		System.out.println("POW : " + MethodLesson.power(2,4));
	}
	public static int maximum(int int1, int int2) {
		if (int1 > int2)
			return int1;
		else if (int2 > int1)
			return int2;
		else
			return int1;
	}
	public static int minimum(int int1, int int2) {
		if (int1 < int2)
			return int1;
		else if (int2 < int1)
			return int2;
		else
			return int1;
	}
	public static int power(int base, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++)
			result *= base;
		return result;
	}
}