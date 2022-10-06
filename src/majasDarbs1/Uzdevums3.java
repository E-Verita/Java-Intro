/*Uzrakstīt programmu, kura pārbauda vai no klaviatūras ievadīts apstiprinājums – jā vai nē. Apstiprinoša atbilde ir ‘y’ vai ‘Y’, bet noraidoša atbilde ir ‘n’ vai ‘N’. Izmantot switch.

Programmai uz ekrāna jāizvada sekojoša informācija:

Ievadiet Y vai N: y
Jus atbildejat apstiprinosi.
VAI

Ievadiet Y vai N: n
Jus atbildejat noraidosi.
VAI

Ievadiet Y vai N: b
Jus neatbildejat korekti..*/
package majasDarbs1;

import java.util.Scanner;

public class Uzdevums3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadiet Y vai N:");
		String atbilde = scanner.nextLine();
		switch (atbilde.toLowerCase()) {
		case "y":
			System.out.println("Jūs atbildējāt apstiprinoši!");
			break;
		case "n":
			System.out.println("Jūs atbildējāt noraidoši!");
			break;
		default:
			System.out.println("Jūs neatbildējāt korekti.");
		}
		scanner.close();

	}

}
