/*Uzrakstīt programmu, kura izveido pakāpju tabulu skaitļiem no 1 līdz 10, izmantojot for ciklu. Tabulai jāizskatās sekojoši:

n	 n^2 	 n^3
1	1	1
2	4	8
3	9	27
4	16	64
5	25	125
6	36	216
7	49	343
8	64	512
9	81	729
10	100	1000

All items:    0%
izveidot aprēķināšanu tikai vienam skaitlim, piemēram, skaitlim 1. Rezultats būs 1 1 1
apreķina algoritmu ielikt for ciklā, kas iterē no 1 līdz 10, lai iegūtu arī pārējiem skaitļiem pakāpes rezultātus
*papildināt programmu, lai tā spēj aprēķināt katra skaitļa pakāpes rezultātus cikliski
*papildināt programmu, lai lietotājs var norādīt, līdz kurai pakāpei ir jāveic apreķini. 
*Piemēram, ievadot 4, tad visi skaitļi tiks kāpināti pirmajā, otrajā, trešajā un ceturtajā pakāpē*/

package seminars3_cikli;

import java.util.Scanner;

public class Uzdevums2 {
	public static void main(String[] args) {
		// vienamSkaitlim(8);
		// ciklā10();
		// cikliski();
		aprekinatCikliski();
	}

	public static void vienamSkaitlim(int i) {
		System.out.println("n \t\tn^2 \t\tn^3");
		System.out.println(i + "\t\t" + i * i + "\t\t" + i * i * i);
		System.out.println("-------------------------------------");
	}

	public static void ciklā10() {
		System.out.println("n \t\tn^2 \t\tn^3");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t\t" + i * i + "\t\t" + i * i * i);
		}
		System.out.println("-------------------------------------");
	}

	public static void cikliski() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli!");
		int skaitlis = scanner.nextInt();
		System.out.println("n \t\tn^2 \t\tn^3");
		for (int i = 1; i <= skaitlis; i++) {
			System.out.println(i + "\t\t" + (int) Math.pow(i, 2) + "\t\t" + (int) Math.pow(i, 3));
		}
		scanner.close();
	}

	public static void aprekinatCikliski() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli!");
		int skaitlis = scanner.nextInt();
		System.out.println("Ievadi pakāpi!");
		int pakape = scanner.nextInt();

		System.out.println();
		for (int i = 1; i <= pakape; i++) {
			if (i == 1) {
				System.out.print("n");
			} else {
				System.out.print("\tn^" + i);
			}
		}
		System.out.println();

		for (int i = 1; i <= skaitlis; i++) {
			int rezultats = 1;
			for (int j = 1; j <= pakape; j++) {
				rezultats = rezultats * i;
				System.out.print(rezultats + "\t");
			}
			System.out.println();
		}
		scanner.close();

	}
}

/*
 * for (int i = 1; i <= pakape; i++) { if (i == 1) { System.out.print("n"); }
 * else { System.out.print("\tn^" + i); } }
 */
