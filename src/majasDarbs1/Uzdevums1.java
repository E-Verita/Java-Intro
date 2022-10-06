/*Paka Nr.1. - Uzdevums Nr.1 (max 2 punkti)


Uzrakstīt programmu, kura prasa lietotājam ievadīt skaitli no 1 līdz 12 un izvada uz ekrāna atbilstošā mēneša nosaukumu. Izmantot switch.

Programmai uz ekrāna jāizvada sekojoša informācija:

Ievadiet skaitli no 1 lidz 12: 2
2. menesis ir februāris*/

package majasDarbs1;

import java.util.Scanner;

public class Uzdevums1 {

	public static void main(String[] args) {
		boolean vaiTurpinat = false;

		do {
			vaiTurpinat = false;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ievadi skaitli no 1 līdz 12:");
			if (!scanner.hasNextByte()) {
				System.err.println("Nepareiza datu ievade!");
				vaiTurpinat = true;
			} else {
				byte skaitlis = scanner.nextByte();
				String menesis = null;
				switch (skaitlis) {
				case 1:
					menesis = "janvāris";
					break;
				case 2:
					menesis = "februāris";
					break;
				case 3:
					menesis = "marts";
					break;
				case 4:
					menesis = "aprīlis";
					break;
				case 5:
					menesis = "maijs";
					break;
				case 6:
					menesis = "jūnijs";
					break;
				case 7:
					menesis = "jūlijs";
					break;
				case 8:
					menesis = "augusts";
					break;
				case 9:
					menesis = "septembris";
					break;
				case 10:
					menesis = "oktobris";
					break;
				case 11:
					menesis = "novembris";
					break;
				case 12:
					menesis = "decembris";
					break;
				default:
					System.err.println("Nepareiza datu ievade!");
					menesis = "ārpus dotā diapozona!";
					vaiTurpinat = true;
					break;
				}
				System.out.println(skaitlis + ". mēnesis ir " + menesis);
			}
		} while (vaiTurpinat);

	}

}
