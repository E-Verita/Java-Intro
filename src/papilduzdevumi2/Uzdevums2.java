package papilduzdevumi2;

public class Uzdevums2 {

	public static void main(String[] args) {
		System.out.println(vaiIrPalindroms("abba"));
		System.out.println(vaiIrPalindroms("Taco cat"));
		System.out.println(vaiIrPalindroms("Borrow or rob?"));
		System.out.println(vaiIrPalindroms("tacocat"));

	}

	private static boolean vaiIrPalindroms(String string) {
		char[] mas = string.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
		int sakrit = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == mas[mas.length - 1 - i]) {
				sakrit++;
			} else {
			}
		}

		if (sakrit == mas.length) {
			return true;
		} else
			return false;

	}

}
