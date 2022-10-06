/*Uzrakstīt programmu, kas spēj apreķināt ieguldījumu summu bankā pēc vairākiem gadiem


All items:    0%
prasīt lietotājam ievadīt 3 vērtības: ieguldījuma summu eiro (float), procentu likmi (float), un gadu skaitu (integer).
pārbaudīt ievadītās vērtības. Ja vērtības atbilst prasītajam, saglabāt tās.
aprēķināt katra gada ieguldījumu summu kopā ar uzkrātajiem procentiem. 
Katra gada uzkrātie procenti tiek aprēķināti sekojoši: uzkrajums = summa * procentu_likme/100; 
katra gada beigās uzkrātie procenti tiek pieskaitīti kopējai summai, tādejādi nākamā gada summa būs palielinājusies par uzkrāto procentu vērtību. 
Rezultātus saglabāt masīvā, lai būtu iespēja apskatīties katrā gadā nopelnīto;
izvadīt uz ekrāna katra gada uzkrātos procentus un jauno konta vērtību eiro ar precizitāti līdz 2 skaitļiem.*/

package seminars4_masivi;

import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float summa = 0f;
		float procenti = 0f;
		int gadi = 0;

		do {
			System.out.println("Ievadi summu EUR:");
			if (sc.hasNextFloat()) {
				summa = sc.nextFloat();
				if (summa < 0) {
					System.err.println("Summai jābūt pozitīvai!");
					continue;
				}
				break;
			}
			sc = new Scanner(System.in);
			System.err.println("Lūdzu ievadi skaitli!");

		} while (true);
		do {
			System.out.println("Ievadi procentu likmi: ");
			if (sc.hasNextFloat()) {
				procenti = sc.nextFloat();
				if (procenti <= 0) {
					System.err.println("Summai jābūt pozitīvai!");
					continue;
				}
				break;
			}
			sc = new Scanner(System.in);
			System.err.println("Lūdzu ievadi skaitli!");
		} while (true);

		do {
			System.out.println("Ievadi gadu skaitu: ");
			if (sc.hasNextInt()) {
				gadi = sc.nextInt();
				if (gadi < 0) {
					System.err.println("Gadu skaitam jābūt pozitīvam skaitlim!");
					continue;
				}
				break;
			}
			sc = new Scanner(System.in);
			System.err.println("Lūdzu ievadi skaitli!");

		} while (true);

		float[] mas = new float[gadi];
		float uzkrajums = 0;

		for (int i = 1; i <= gadi; i++) {
			uzkrajums = (Math.round(summa * procenti / 100 * 100)) / 100f;
			mas[i - 1] = uzkrajums;
			summa += uzkrajums;
		}
		System.out.println("Uzkrājums pa gadiem: " + Arrays.toString(mas));
		System.out.println("Jaunā konta vērtība: " + String.format("%.2f", summa));
		sc.close();
	}

}
