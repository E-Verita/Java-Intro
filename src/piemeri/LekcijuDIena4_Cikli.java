package piemeri;

import java.util.Scanner;

public class LekcijuDIena4_Cikli {
	public static void main(String[] args) {
		WhileCiklsNepareizaIevade();
		forEachcikls();
		whileCikls();
		doWhileCikls();
	}

	private static void forEachcikls() {
		// 0 1 2 3 4 5 6 7
		// [2][6][7][8][9][0][1][3]
		String telefons = "26789013";

		// FOR:
		for (int i = 0; i < telefons.length(); i++) {
			System.out.print(telefons.charAt(i) + " ");
		}

		System.out.println();

		// FOR EACH:
		for (char temp : telefons.toCharArray()) {
			System.out.print(temp + " ");

		}

	}

	private static void whileCikls() {
		int studentuSkaititajs = 1;
		Scanner scanner = new Scanner(System.in);
		String atbilde = "j";
		short summa = 0;
		while (atbilde.equalsIgnoreCase("j")) {
			System.out.println("Lūdzu, ievadiet " + studentuSkaititajs + " . studenta atzīmi!");
			byte atzime = scanner.nextByte();
			summa = (short) (summa + atzime);
			studentuSkaititajs++;
			System.out.println("Vai vēlies turpināt? j - jā, n - nē.");
			atbilde = scanner.next();

		}
		System.out.println("Paldies! Ievadīti dati par " + (studentuSkaititajs - 1) + " studentiem!");
		System.out.println("Vidējā vertība = " + (summa / (studentuSkaititajs - 1)));
		scanner.close();
	}

	private static void doWhileCikls() {
		int studentuSkaititajs = 1;
		Scanner scanner = new Scanner(System.in);
		String atbilde = "j";
		short summa = 0;

		do {
			System.out.println("Lūdzu, ievadiet " + studentuSkaititajs + " . studenta atzīmi!");

			byte atzime = scanner.nextByte();
			summa = (short) (summa + atzime);
			studentuSkaititajs++;
			System.out.println("Vai vēlies turpināt? j - jā, n - nē.");
			atbilde = scanner.next();

		} while (atbilde.equalsIgnoreCase("j"));

		System.out.println("Paldies! Ievadīti dati par " + (studentuSkaititajs - 1) + " studentiem!");
		System.out.println("Vidējā vertība = " + (summa / (studentuSkaititajs - 1)));
		scanner.close();
	}

	private static void WhileCiklsNepareizaIevade() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lūdzu, ievadiet skaitli robežās no 1 līdz 20!");
		byte skaitlis = 0;

		while (!scanner.hasNextByte()) {
			System.out.println("Lūdzu, ievadiet atkārtoti!");
			scanner.next();
		}
		skaitlis = scanner.nextByte();
		System.out.println("Skaitlis: " + skaitlis);
		scanner.close();
	}
}
