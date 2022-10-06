
/*
 Uzrakstīt programmu, kura darbojas ar lietotāja ievadītajiem skaitļiem.


Programmas izvadam jāizskatās sekojoši (Pieņemot, ka ir ievadīti skaitļi: 1 1 2 2 3 4 5 6 7 8):

Masivs preteja seciba:
8 7 6 5 4 3 2 2 1 1
Visu elementu summa ir 39
Lielakais elements ir 8
Mazakais elements ir 1

izvadīt uz ekrāna masīva elementus pretējā secībā;
izvadīt uz ekrāna masīva elementu summu;
izvadīt uz ekrāna lielāko masīva elementu;
izvadīt uz ekrāna mazāko masīva elementu.
 */
package seminars4_masivi;

import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int masLielums = 3;
		int[] mas = new int[masLielums];
		int[] masPret = new int[mas.length];
		int summa = 0;
		int lielakais = Integer.MIN_VALUE;
		int mazakais = Integer.MAX_VALUE;

		System.out.println(Arrays.toString(mas));

		System.out.println("Ievadi " + masLielums + " skaitļus:");
		do {
			int i = 0;
			while (i < masLielums) {
				if (sc.hasNextInt()) {
					int ievade = sc.nextInt();
					mas[i] = ievade;
					masPret[masPret.length - 1 - i] = mas[i];
					if (ievade > lielakais) {
						lielakais = ievade;
					}
					if (ievade < mazakais) {
						mazakais = ievade;
					}
					summa += ievade;
					i++;
				} else {
					sc = new Scanner(System.in);
					System.err.println("Nepareiza datu ievade! Lūdzu ievadi skaitļus!");
				}
			}
			break;
		} while (true);
		System.out.println("Masīvs: " + Arrays.toString(mas));
		System.out.println("Pretējs masīvs: " + Arrays.toString(masPret));
		System.out.println("Summa: " + summa);
		System.out.println("Lielākais:" + lielakais);
		System.out.println("Mazākais: " + mazakais);
		sc.close();
	}
}
