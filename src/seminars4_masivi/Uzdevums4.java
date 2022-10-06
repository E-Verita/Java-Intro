/*Uzrakstīt programmu, kas veic skaitļa meklēšanu un citas operācijas masīvā 


All items:    0%
prasīt lietotājam ievadīt 10 veselus skaitļus un saglabāt tos masīvā;
pēc tam lietotājam prasa ievadīt kādu skaitli X;
programma meklē, vai skaitlis X atrodas masīvā;
ja šāds skaitlis ir atrasts, tad to dzēš no masīva, visus aiz tā sekojošos elementus pabīdot par vienu vietu uz kreiso pusi. Masīva beigās tiek pielikta 0;
ja šāds skaitlis nav atrasts, tad attēlo atbilstošu ziņojumu;
uz ekrāna tiek izvadīts masīva saturs.*/

package seminars4_masivi;

import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int skaits = 5;
		System.out.println("Lūdzu ievadi " + skaits + " veselus skaitlus");

		int[] mas = new int[skaits];
		for (int i = 0; i < skaits; i++) {
			do {
				if (sc.hasNextInt()) {
					int skaitlis = sc.nextInt();
					if (skaitlis > 0) {
						mas[i] = skaitlis;
						break;
					}

				}
				sc = new Scanner(System.in);
				System.err.println("Lūdzu ievadi skaitli!");
			} while (true);

		}
		System.out.println("Lūdzu ievadi vienu skaitli, ko vēlies atrast masīvā!");
		int ievadskaitlis;
		int[] jaunais = new int[mas.length];
		int atkartojas = 0;
		do {
			if (sc.hasNextInt()) {
				ievadskaitlis = sc.nextInt();
				if (ievadskaitlis > 0) {
					for (int i = 0; i < mas.length; i++) {
						if (mas[i] != ievadskaitlis) {
							jaunais[i - atkartojas] = mas[i];
						} else {
							atkartojas++;
						}
					}
					if (atkartojas == 0) {
						System.out.println("Ievadītais skaitlis " + ievadskaitlis + " nav atrodams masīvā!");
					}
					break;
				}
			}
			sc = new Scanner(System.in);
			System.err.println("Lūdzu ievadi skaitli!");
		} while (true);
		System.out.println("Ievadītais Masīvs: " + Arrays.toString(mas));
		System.out.println("Jaunais Masīvs: " + Arrays.toString(jaunais));
		sc.close();
	}

}