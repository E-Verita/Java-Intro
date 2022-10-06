package seminars3_cikli;

import java.util.Scanner;

public class Uzdevums8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String turpinat;
		do {
			System.out.println("Kurss:\nEUR - USD 1.18900\n" + "EUR - GBP 0.91740\n" + "EUR - PLN 4.23610\n"
					+ "EUR - SEK 9.46900");
			System.out.println("Ievadi summu EUR:");
			float naudaEUR = 0;
			do {
				if (scanner.hasNextFloat()) {
					naudaEUR = scanner.nextFloat();
					if (naudaEUR >= 0) {
						{
							break;
						}
					}
				}
				scanner = new Scanner(System.in);
				System.err.println("Lūdzu ievadiet skaitli!");

			} while (true);

			do {
				System.out.println("Lūdzu ievadiet valūtu, uz kuru konvertēt - USD, GBP, PLN, SEK");
				String atbilde = scanner.next();

				if (atbilde.equalsIgnoreCase("USD")) {
					System.out.printf("Iegūtie USD ir %.2f\n", (naudaEUR * 1.18900));
					break;
				} else if (atbilde.equalsIgnoreCase("GBP")) {
					System.out.printf("Iegūtie GBP ir %.2f\n", (naudaEUR * 0.91740));
					break;
				} else if (atbilde.equalsIgnoreCase("PLN")) {
					System.out.printf("Iegūtie SEK ir %.2f\n", (naudaEUR * 4.23610));
					break;
				} else if (atbilde.equalsIgnoreCase("SEK")) {
					System.out.printf("Iegūtie SEK ir %.2f\n", (naudaEUR * 9.46900));
					break;
				} else {
					System.err.print("Nav ievadīta pareiza valūta!");
					scanner = new Scanner(System.in);
				}

			} while (true);
			System.out.println("\nVai vēlaties vēl kaut ko konvertēt. Ja ja - raksti Jā ");
			turpinat = scanner.next();
		} while (turpinat.equalsIgnoreCase("jā"));
		System.out.println("Paldies!");
		scanner.close();
	}
}
