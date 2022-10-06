package seminars1_intro;

import java.util.Scanner;

public class Uzdevums5 {
	public static void main(String[] args) {
		/*
		 * izvadīt informāciju konsolē - lūdzu ievadiet divus skaitļus izveidot divus
		 * mainīgos skaitļu saglabāšanai izveidot Scanner tipa objektu izmantojot
		 * Scanner objektu, nolasīt divas skaitliskas vērtības no konsoles un saglabāt
		 * tās izveidotajos mainīgajos izvadīt konsolē abu skaitļu summu, starpību,
		 * reizinājumu, dalījumu un vidējo vērtību
		 */
		ievadiSkaitlus();
	}

	public static void ievadiSkaitlus() {
		System.out.println("\nLūdzu, ievadi 2 skaitļus! Pēc katra skaitļa nospied Enter!");
		Scanner scanner = new Scanner(System.in);

		try {
			float skaitlis1 = scanner.nextFloat();
			float skaitlis2 = scanner.nextFloat();
			System.out.println("Summa: " + (skaitlis1 + skaitlis2));
			System.out.println("Starpība: " + (skaitlis1 - skaitlis2));
			System.out.println("Reizinājums: " + (skaitlis1 * skaitlis2));
			System.out.println("Dalījums: " + (skaitlis1 / skaitlis2));
			System.out.println("Vidējā vērtība: " + (skaitlis1 + skaitlis2) / 2);
			ievadiSkaitlus();
		} catch (Exception e) {
			System.err.print("Netika ievadīts skaitlis");
			ievadiSkaitlus();
		}
		scanner.close();

	}

}
