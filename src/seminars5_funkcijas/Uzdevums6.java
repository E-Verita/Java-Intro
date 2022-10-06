package seminars5_funkcijas;

public class Uzdevums6 {

	public static void main(String[] args) {
		System.out.println(gcd(75, 30));
		System.out.println(gcd(15, 30));
		System.out.println(gcd(120, 30));
		System.out.println(gcd(25, 2500));

	}

	public static int gcd(int m, int n) {
		int r = 0;
		if (m % n == 0) {
			return n;
		}

		if (n % m == 0) {
			return m;
		}

		do {
			if (m % n == 0) {
				m = m / n;
				break;
			} else {
				r = m % n;
				m = n;
				n = r;
			}
		} while (r == 0);
		return m;

	}
}
