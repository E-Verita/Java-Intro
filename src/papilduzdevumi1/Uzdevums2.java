/*Uzdevums Nr.2
Uzrakstīt programmu, kas veic skaitļu pārbaudes noteiktā intervālā


All items:    0%
pieprasa lietotājam ievadīt intervāla sākumu un beigas
pārbauda un, ja viss kartībā, tad saglabā intervāla robežas
pēc tam prasa lietotājam ievadīt 5 skaitļus un veic pārbaudi, vai katrs ievadītais skaitlis atrodas iepriekš definētajā intervālā*/

package papilduzdevumi1;

import java.util.Scanner;

public class Uzdevums2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sakums;
		int beigas;
		int temp;

		do {
			System.out.println("Ievadi intervāla sākumu!");
			if (sc.hasNextInt()) {
				sakums = sc.nextInt();
				break;
			}
			System.err.println("Ievadi veselu skaitli!");
			sc = new Scanner(System.in);
		} while (true);

		do {
			System.out.println("Ievadi intervāla beigas!");
			if (sc.hasNextInt()) {
				beigas = sc.nextInt();
				if (beigas < sakums) {
					temp = sakums;
					sakums = beigas;
					beigas = temp;
				}
				break;
			}
			System.err.println("Ievadi veselu skaitli!");
			sc = new Scanner(System.in);
		} while (true);
		System.out.println("Sākums: " + sakums);
		System.out.println("Beigas: " + beigas);

		System.out.println("Ievadi 5 skaitļus");
		for (int i = 1; i < +5; i++) {
			do {
				System.out.println("Ievadi " + i + ". skaitli!");
				if (sc.hasNextInt()) {
					int skaitlis = sc.nextInt();
					if (skaitlis >= sakums && skaitlis <= beigas) {
						System.out.println("Skaitlis " + skaitlis + " atrodas intervālā!");
					} else {
						System.out.println("Skaitlis " + skaitlis + " neatrodas intervālā!");
					}
					break;
				}
				System.err.println("Ievadi skaitli!");
				sc = new Scanner(System.in);
			} while (true);

		}
		System.out.println("Visi skaitļi salīdzināti! ");
		sc.close();
	}

}
