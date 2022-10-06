/*Paka Nr.1. - Uzdevums Nr.4 (max 2 punkti)
Uzrakstīt programmu, kura vispirms ļauj lietotājam izvēlēties vienu no iespējām:
1) Konvertēt temperatūru no Celsija grādiem uz Fārenheita grādiem.

2) Konvertēt temperatūru no Fārenheita grādiem uz Celsija grādiem.


Kad lietotājs ir veicis izvēli, programma prasa ievadīt temperatūras vērtību un izvada konvertēšanas rezultātu.

Aprēķinu formulas ir sekojošas:

C = (F – 32)*5/9

F = C*9/5 + 32

kur C ir grādi celsijos un F ir Fārenheita grādi.

Programmai uz ekrāna jāizvada sekojoša informācija:

Izvelies konverteshanu.
Ja no C uz F - ievadi C
ja no F uz C - ievadi F
-> f // f ir lietotāja ievadītā vērtība
Ievadiet temperaturu: 100 // 100 ir lietotāja ievadītā vērtība
100.00 F ir 37.78 C

/// parent / message / title / type

-------------------------*/

package majasDarbs1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uzdevums4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean turpinat = false;
		do {
			turpinat = false;
			System.out.println("Izvēlies konvertēšanu.\nJa no C uz F - ievadi C\nJa no F uz C - ievadi F");

			String konvertesanaNo = scanner.nextLine();
			if (!konvertesanaNo.toLowerCase().matches("[cf]")) {
				System.err.println("Jūs neievadījāt izvēli korekti!");
				turpinat = true;

			} else {
				try {
					System.out.println("Ievadiet temperatūru:");
					float temperatura = scanner.nextFloat();
					switch (konvertesanaNo.toLowerCase()) {
					case "c":
						System.out.println(String.format("%.02f", temperatura) + " C ir "
								+ String.format("%.02f", (temperatura * 9 / 5 + 32)) + " F");
						break;
					case "f":
						System.out.println(String.format("%.02f", temperatura) + " F ir "
								+ String.format("%.02f", ((temperatura - 32) * 5 / 9)) + " C");
						break;
					default:
						System.err.println("Jūs neievadījāt datus korekti!");
						turpinat = true;
						break;
					}
				} catch (InputMismatchException e) {
					System.err.println("Jūs neievadījāt izvēli korekti!");
					turpinat = true;
				}
			}
		} while (turpinat);
		scanner.close();
	}

}
