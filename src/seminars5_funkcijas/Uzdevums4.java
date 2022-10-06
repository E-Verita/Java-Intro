package seminars5_funkcijas;

import java.util.Scanner;

public class Uzdevums4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String turpinat = null;
		do {
			System.out
					.println("Izvēlies darbību:\n1 - sekunžu pārvēršana h:min:sec\n2 - h:min:sec pārvēršana sekundēs:");
			do {
				if (sc.hasNextInt()) {
					int skaitlis = sc.nextInt();
					if (skaitlis == 1) {
						calculateTime();
						break;
					} else if (skaitlis == 2) {
						calculateSeconds();
						break;
					} else {
						System.err.println("Lūdzu ievadi skaitli 1 vai 2!");
						sc = new Scanner(System.in);
					}

				} else {
					System.err.println("Lūdzu ievadi skaitli 1 vai 2!");
					sc = new Scanner(System.in);
				}
			} while (true);
			System.out.println("\nVai vēlaties turpināt?\ny - jā, vēlos!\nn - nē, nevēlos!");
			turpinat = sc.next();
		} while (turpinat.equalsIgnoreCase("y"));
		System.out.println("Paldies, programma apturēta!");
	}

	private static void calculateTime() {
		sc = new Scanner(System.in);
		System.out.println("Ievadi sekunžu skaitu!");
		do {
			if (sc.hasNextInt()) {
				int ievadSekundes = sc.nextInt();
				if (ievadSekundes > 0) {
					int sekundes = (ievadSekundes % 60);
					int minutes = ((ievadSekundes - sekundes) / 60) % 60;
					int stundas = (ievadSekundes - sekundes - minutes * 60) / (60 * 60);
					System.out.println(
							ievadSekundes + " sekundes ir " + stundas + "h " + minutes + " min " + sekundes + " sec");
					break;
				} else {
					System.err.println("Lūdzu ievadi pozitīvu skaitli!");
					sc = new Scanner(System.in);
				}
			} else {
				System.err.println("Lūdzu sekunžu skaitu veselos skaitļos!");
				sc = new Scanner(System.in);
			}
		} while (true);

	}

	private static void calculateSeconds() {
		System.out.println("Ievadi stundu skaitu!");
		int sekundes = 0;

		int ievSekundes = 0;
		int minutes = 0;
		int stundas = 0;

		do {
			if (sc.hasNextInt()) {
				stundas = sc.nextInt();
				if (stundas >= 0) {
					sekundes += stundas * 60 * 60;
					break;
				} else {
					System.err.println("Nedrīkst ievadīt negatīvu skaitli!");

				}
			} else {
				System.err.println("Lūdzu ievadi stundu skaitu veselos skaitļos!");
				sc = new Scanner(System.in);
			}
		} while (true);
		System.out.println("Ievadi minūšu skaitu!");
		do {
			if (sc.hasNextInt()) {
				minutes = sc.nextInt();
				if (minutes >= 0) {
					sekundes += minutes * 60;
					break;
				} else {
					System.err.println("Nedrīkst ievadīt negatīvu skaitli!");

				}
			} else {
				System.err.println("Lūdzu ievadi stundu skaitu veselos skaitļos!");
				sc = new Scanner(System.in);
			}
		} while (true);
		System.out.println("Ievadi sekunžu skaitu!");
		do {
			if (sc.hasNextInt()) {
				ievSekundes = sc.nextInt();
				if (ievSekundes >= 0) {
					sekundes += ievSekundes;
					break;
				} else {
					System.err.println("Nedrīkst ievadīt negatīvu skaitli!");

				}
			} else {
				System.err.println("Lūdzu ievadi sekunžu skaitu veselos skaitļos!");
				sc = new Scanner(System.in);
			}
		} while (true);

		System.out.println(stundas + "h " + minutes + " min " + ievSekundes + " sec ir " + sekundes + " sekundes");
	}
}
