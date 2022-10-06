/*
Paka Nr.2. - Uzdevums Nr.1 (max 2 punkti)


Uzrakstīt programmu, kura izvada uz ekrāna viena mēneša kalendāru. Lietotājs norāda, cik mēnesī ir dienas un ar kuru nedēļas dienu mēnesis sākas:


Ievadi dienu skaitu menesi: 31
Ievadi nedelas dienu ar kuru menesis sakas
(1 = pirmdiena, 7 = svetdiena): 3
P    O    T    C    P    S    Sv
            1     2     3     4     5
6     7     8     9     10    11    12
13    14    15    16    17    18    19
20    21    22    23    24    25    26
27    28    29    30    31
Lai izvadītu mēneša dienas, izmantot for ciklu pa i no 1 līdz n, kur n ir dienu skaits mēnesī, un uz ekrāna tiek izvadīta i vērtība.

Iekš cikla ar if pārbaudīt vai nedēļas diena ir 7 (svētdiena); tādā gadījumā izvadīt newline simbolu '\n'.

 */

package majasDarbs1;

import java.util.Scanner;

public class Uzdevums7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadi dienu skaitu mēnesī: ");
		if (!scanner.hasNextByte()) {
			System.err.println("Nepareiza datu ievade: jāievada skaitlis 28 - 31");
			System.exit(0);
		}

		byte dienuSkaits = scanner.nextByte();
		if (dienuSkaits < 28 || dienuSkaits > 31) {
			System.err.println("Nepareiza datu ievade: jāievada skaitlis 28 - 31");
			System.exit(0);
		}
		System.out.println("Ievadi nedēļas dienu ar kuru mēnesis sākās" + "\n(1 = pirmdiena, 7 = svetdiena):");
		if (!scanner.hasNextByte()) {
			System.err.println("Nepareiza datu ievade: Kā nedēļas sākuma diena jāievada skaitlis 1 - 7");
			System.exit(0);
		}

		byte nedelasDiena = scanner.nextByte();
		if (nedelasDiena < 1 || nedelasDiena > 7) {
			System.err.println("Nepareiza datu ievade: Kā nedēļas sākuma diena jāievada skaitlis 1 - 7");
			System.exit(0);
		}

		scanner.close();
		System.out.println("P\tO\tT\tC\tP\tS\tSv");
		switch (nedelasDiena) {
		case 1:
			break;
		case 2:
			System.out.print("\t");
			break;
		case 3:
			System.out.print("\t\t");
			break;
		case 4:
			System.out.print("\t\t\t");
			break;
		case 5:
			System.out.print("\t\t\t\t");
			break;
		case 6:
			System.out.print("\t\t\t\t\t");
			break;
		case 7:
			System.out.print("\t\t\t\t\t\t");
			break;
		default:
			System.err.print("Nepareiza datu ievade. Nepieciesams ievadīt skaitli 1 - 7");
			break;

		}
		for (byte i = 1; i <= dienuSkaits; i++) {
			System.out.print(i + "\t");
			nedelasDiena++;
			if (nedelasDiena > 7) {
				System.out.print("\n");
				nedelasDiena = 1;
			}
		}
	}

}
