package piemeri;

public class LekcijuDiena8_funkcijas {
	public static void main(String[] args) {
		System.out.println(multiply(3, 6));
		System.out.println(divide(3, 0));

	}

	public static long multiply(int a, int b) {
		long result = a * b;
		return result;
	}

	public static float divide(int a, int b) {
		if (b == 0) {
			System.err.println("Nevar dalt ar 0!");
			return -1;
		} else {
			float result = a / (b * 1f);
			return result;
		}
	}

}
