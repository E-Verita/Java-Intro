package seminars1_intro;

import java.util.Scanner;

public class Uzdevums4 {
	public static void main(String[] args) {
		/*
		 * Izvadīt uz ekrāna lūgumu ievadīt lietotāja vārdu Izveidot mainīgo ar
		 * nosaukumu "vards", kurā tiks glabāts lietotāja ievadītais vārds Izveidot
		 * Scanner tipa objektu ar sekojošām koda rindiņām: Scanner myScanner = new
		 * Scanner(System.in); Skaneris nepieciešams, lai spētu izgūt no konsoles
		 * ievadīto tekstu. Par objektiem un klasēm skatīsimies vēlāk. Izmantojot
		 * myScanner objektu ir iespējams izsaukt funkciju next(), ar kuras palīdzību
		 * var nolasīt tieši to, ko lietotājs ir ievadījis konsolē. Par funkcijām
		 * skatīsimies vēlāk. Tā kā next() funkcija uzreiz ievadīto rezultātu atdod
		 * atpakaļ java programmā, tad tā ir jāsaglabā. Saglabāšana mainīgajā notiek ar
		 * vienādības zīmes palīdzību. Lūdzu ierakstīt programmā sekojošu koda rindu:
		 * vards = myScanner.next(); Pēc vārda nolasīšanas, lūdzu izvadiet konsolē
		 * sekojošu tekstu - "Esi sveicināts JAVA pasaulē ", kur ir lietotāja ievadītais
		 * vārds konsolē
		 */

		System.out.println("Lūdzu, ievadi savu lietotājvārdu!");
		Scanner scanner = new Scanner(System.in);
		String vards = scanner.nextLine();
		System.out.println(vards + ", esi sveicināts JAVA pasaulē");
		scanner.close();

	}

}
