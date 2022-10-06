package seminars5_funkcijas;

public class Uzdevums1 {
	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		int c = multiply(a, b);
		System.out.println("Skaitļu " + a + " un " + b + " reizinājums: " + c);
		float d = divide(a, b);
		System.out.println("Skaitļu " + a + " un " + b + " dalījums: " + d);

	}

	private static float divide(int i, int j) {
		if (j == 0) {
			System.err.println("Ar 0 Nevar dalīt!");
			return -1;
		} else {
			float k = i / (j * 1f);
			return k;
		}

	}

	private static int multiply(int i, int j) {
		return i * j;
	}
}
