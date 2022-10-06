/** Uzrakstīt programmu, kura izveido tabulu ar skaitļu no 1 līdz 8 faktoriāļiem, izmantojot for, while un do-while ciklu.
Piemēram,

n	 n!
1	1	
2	2	
3	6	
4	24	
5	120	
6	720	
7	5040	
8	40320
	
ll items:    0%
aprēķināta un izvadīta faktoriāla tabula, izmantojot for ciklu
aprēķināta un izvadīta faktoriāla tabula, izmantojot while ciklu
aprēķināta un izvadīta faktoriāla tabula, izmantojot do-while ciklu*/

package seminars3_cikli;

import java.util.Scanner;

public class Uzdevums9 {

	public static void main(String[] args) {
		arDoWhile();
	}

	public static void arFor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli");
		do {
			if (scanner.hasNextInt()) {
				int skaitlis = scanner.nextInt();
				if (skaitlis <= 0) {
					System.err.println("Nākamreiz, lūdzu, ievadi tikai pozitīvu, veselu skaitli:");
					scanner = new Scanner(System.in);
				}
				Long faktorialis = 1l;
				System.out.println("n" + "\tn!");
				for (int i = 1; i <= skaitlis; i++) {
					faktorialis *= i;
					System.out.println(i + "\t" + faktorialis);
				}
			} else {
				System.err.println("Nākamreiz, lūdzu, ievadi tikai pozitīvu, veselu skaitli:");
				scanner = new Scanner(System.in);
			}
			scanner.close();
		} while (true);
		
	}

	public static void arWhile() {
		Scanner scanner = new Scanner(System.in);
		String turpinat;
		do {
			System.out.println("Ievadi skaitli");
			if (scanner.hasNextInt()) {
				int skaitlis = scanner.nextInt();
				if (skaitlis <= 0) {
					System.err.println("Nākamreiz, lūdzu, ievadi tikai pozitīvu, veselu skaitli:");
					scanner = new Scanner(System.in);

				}
				System.out.println("n" + "\tn!");
				Long faktorialis = 1l;
				int i = 1;
				while (i <= skaitlis) {
					faktorialis *= i;
					System.out.println(i + "\t" + faktorialis);
					i++;
				}
			} else {
				System.err.println("Lūdzu, ievadi tikai pozitīvu, veselu skaitli:");
				scanner = new Scanner(System.in);

			}

		} while (true);
	}

	public static void arDoWhile() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Ievadi skaitli");
			if (scanner.hasNextInt()) {
				int skaitlis = scanner.nextInt();
				if (skaitlis <= 0) {
					System.err.println("Nākamreiz, lūdzu, ievadi tikai pozitīvu, veselu skaitli:");
					scanner = new Scanner(System.in);
				}
				System.out.println("n" + "\tn!");
				Long faktorialis = 1l;
				int i = 1;
				do {
					faktorialis *= i;
					System.out.println(i + "\t" + faktorialis);
					i++;
				} while (i <= skaitlis);
			} else {
				System.err.println("Nākamreiz, lūdzu, ievadi tikai pozitīvu, veselu skaitli:");
				scanner = new Scanner(System.in);
			}

		} while (true);
	}
}
