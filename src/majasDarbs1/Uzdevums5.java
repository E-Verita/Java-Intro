/*Paka Nr.1. - Uzdevums Nr.5 (max 2 punkti)
Uzrakstīt programmu, kura prasa lietotājam ievadīt (ielasa) piecus skaitļus robežās no 1 līdz 30. 
Pēc katra skaitļa ielasīšanas programma uz ekrāna vienā rindā izvada atbilstošu skaitu zvaigznīšu.

Ja lietotājs ir ievadījis nepareizu skaitli, izvadīt uz ekrāna atbilstošu paziņojumu un ļaut ievaīt skaitli no jauna. Programmas darbības piemērs:

Ievadi 5 skaitlus:

-> 4
* * * *
-> 10
* * * * * * * * * *
-> -5
Megini velreiz!
-> 5
* * * * **/
package majasDarbs1;

import java.util.Scanner;

public class Uzdevums5 {

	public static void main(String[] args) {

		byte ievadamieSkaitli = 5;
		System.out.println("Ievadi 5 skaitļus!");

		while (ievadamieSkaitli > 0) {
			Scanner scanner = new Scanner(System.in);
			if (!scanner.hasNextByte()) {
				System.err.println("Mēģini vēlreiz!");
			} else {
				byte skaitlis = scanner.nextByte();
				if (skaitlis < 0) {
					System.err.println("Mēģini vēlreiz!");
				} else {
					for (int i = 1; i <= skaitlis; i++) {
						System.out.print("* ");
					}
					System.out.println();
					ievadamieSkaitli--;
				}
			}

		}
	}
}
