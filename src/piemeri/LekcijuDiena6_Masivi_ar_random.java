package piemeri;

import java.util.Random;
import java.util.Scanner;

public class LekcijuDiena6_Masivi_ar_random {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Lietotajs ievada, cik vērtības generet
		System.out.println("Lūdzu ievadi, cik vērtības vēlēsies generēt?");
		int skaits = 9;
		do {
			if (sc.hasNextInt()) {
				skaits = sc.nextInt();
				if (skaits > 0) {
					break;
				}

			}
			sc = new Scanner(System.in);
			System.err.println("Lūdzu ievadi skaitli!");
		} while (true);

		// Genere vertibas
		int[] genVertibas = new int[skaits];
		Random ran = new Random();
		for (int i = 0; i < genVertibas.length; i++) {
			genVertibas[i] = ran.nextInt(1001); // 0-1000, bet nenodrošina unikālas
		}

		// Izprinte vertibas
		System.out.println("Generētās vērtības ir: ");
		int summa = 0;
		for (int i : genVertibas) {
			summa += i;
			System.out.print(i + " ");
		}
		System.out.println("\nSumma: " + summa);
		System.out.println("Vidējais aritmētiskais: " + summa / (skaits * 1f));
		sc.close();
	}

}
