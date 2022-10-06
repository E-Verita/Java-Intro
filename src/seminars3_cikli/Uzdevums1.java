/*Uzrakstīt programmu, kas veic summas apreķinu skaitļiem no 1 līdz 8
aprēķināt un izvadīt visu skaitļu no 1 līdz 8 summu
papildiniet programmu tā, lai tiktu aprēķināta summa no 1 līdz lietotāja ievadītam skaitlim
 */

package seminars3_cikli;

import java.util.Scanner;

public class Uzdevums1 {

	public static void main(String[] args) {
		int summa = 0;
		for (int i = 1; i <= 8; i++) {
			summa += i;
			System.out.println("i = " + i + "\nSumma = " + summa);
		}
		System.out.println("\nGala summa = " + summa);
		System.out.println("--------------------------");

		int manaSumma = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi savu skaitli! Skaitlim jābūt pozitīvam!");
		if (scanner.hasNextInt()) {
			int mansSkaitlis = scanner.nextInt();
			if (mansSkaitlis > 0) {
				for (int i = 1; i <= mansSkaitlis; i++) {
					manaSumma += i;
					System.out.println("i = " + i + "\nSumma = " + manaSumma);
				}
				System.out.println("\nGala summa = " + manaSumma);
			} else {
				System.err.print("Skaitlis nav pozitīvs!");

			}
		} else {
			System.err.print("Bija jāievada skaitlis!");
		}
		scanner.close();
	}

}
