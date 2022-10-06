/*Uzrakstīt programmu, kura prasa lietotājam ievadīt dienas kārtas numuru gadā (tiek pieņemts, ka gadā ir 365 dienas) un programma atgriež datumu, minot mēnesi un dienu. Piemēram,

Ievadiet skaitli no 1 lidz 365: 100
Datums: 10.aprīlis*/

package majasDarbs1;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class Uzdevums6 {

	public static void main(String[] args) throws ParseException {

		LocalDate datums = LocalDate.parse("2021-12-31");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli, kas norādītu dienas kārtas numuru gadā: ");
		if (!scanner.hasNextInt()) {
			System.err.println("Nepareiza datu ievade - jāievada vesels, pozitīvs skaitlis.");
			System.exit(0);
		}

		int skaitlis = scanner.nextInt();
		if (skaitlis < 0) {
			System.err.println("Nepareiza datu ievade - jāievada vesels, pozitīvs skaitlis.");
			System.exit(0);
		}
		scanner.close();
		datums = datums.plusDays(skaitlis);
		int diena = datums.getDayOfMonth();
		int month = datums.getMonthValue();
		String menesis = null;
		switch (month) {
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
			System.err.println("Kļūda!");
			break;
		}
		System.out.println("Datums: " + diena + ". " + menesis);

	}

}
