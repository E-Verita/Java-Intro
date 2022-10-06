/*Uzdevums Nr.1

Uzrakstīt programmu, kas prasa ievadīt 8 skaitļus intervālā no -10 līdz 10. Veikt sekojošas darbības ar ievadītajiem skaitļiem:

All items: 

    aprēķina visu skaitļu summu
    aprēķina visu skaitļu vidējo aritmētisko
    aprēķina atsevišķi pāra skaitļu skaitu un summu
    aprēķina atsevišķi nepāra skaitļu skaitu un summu
    aprēķina, cik no skaitļiem ir pozitīvi
    aprēķina, cik no skaitļiem ir negatīvi
    aprēķina, mazāko no skaitļiem
    aprēķina, lielāko no skaitļiem
    izvadīt skaitļus, no kuriem var izrēķināt kvadrātsakni veselos skaitļos
    izvadīt visus skaitļus, kuri dalās ar 7
    izvadīt visus skaitļus, kuru pēdējais cipars ir 0
    izvadīt skaitļus rindās pa 2 skaitļiem katrā rindā
    * aprēķina, cik no skaitļiem ir lielāki par vidējo aritmētisko (darbs ar masīviem)
    * aprēķina, cik no skaitļiem ir mazāki par vidējo aritmētisko (darbs ar masīviem)*/

package papilduzdevumi1;

import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte skaits = 4;
		byte atlikusieSkaitli = skaits;
		byte summa = 0;
		byte paraSumma = 0;
		byte paraSkaits = 0;
		byte neparaSumma = 0;
		byte neparaSkaits = 0;
		byte pozitivi = 0;
		byte negativi = 0;
		byte lielakais = -10;
		byte mazakais = 10;
		byte[] mas = new byte[skaits];
		System.out.println("Ievadi " + skaits + " skaitļus!");

		for (int i = 1; i <= skaits; i++) {
			do {
				if (scanner.hasNextByte()) {
					byte skaitlis = scanner.nextByte();
					if (skaitlis >= -10 && skaitlis <= 10) {
						if (skaitlis % 2 == 0) {
							paraSkaits++;
							paraSumma += skaitlis;
						} else {
							neparaSkaits++;
							neparaSumma += skaitlis;
						}
						if (skaitlis >= -10 && skaitlis < 0) {
							negativi++;
						} else {
							pozitivi++;
						}
						if (skaitlis > lielakais) {
							lielakais = skaitlis;
						}
						if (skaitlis < mazakais) {
							mazakais = skaitlis;
						}
						if (skaitlis % 7 == 0) {
							System.out.println("Skaitlis dalās ar 7 bez atlikuma!");
						}
						if (skaitlis % 10 == 0) {
							System.out.println("Skaitlis dalās ar 7 bez atlikuma!");
						}

						for (int j = 1; j <= 10; j++) {
							if (j * j == skaitlis) {
								System.out.println("No šī skaitļa var izvilkt kvadrātsakni veselos skaitļos!");
							}
						}

						atlikusieSkaitli--;
						summa += skaitlis;
						mas[i - 1] = skaitlis;
						System.out.println("Atlikusi: " + atlikusieSkaitli);
						break;
					} else {
						System.err.println("Ievadi skaitli!");
						scanner = new Scanner(System.in);
					}
				} else {
					System.err.println("Ievadi skaitli!");
					scanner = new Scanner(System.in);
				}
			} while (true);

		}

		byte mazParVid = 0;
		byte lielParVid = 0;

		for (byte temp : mas) {
			if (temp < (summa / (skaits * 1f))) {
				mazParVid++;
			} else if (temp > (summa / (skaits * 1f))) {
				lielParVid++;
			}
		}
		System.out.println("-------------------------------");

		System.out.println("Skaitļu izvade pa 2: ");
		byte iter = 0;
		for (byte temp : mas) {
			if (iter % 2 == 0) {
				System.out.print(temp + " ");
				iter++;
			} else {
				System.out.println(temp + " ");
				iter++;
			}
		}

		System.out.println("Summa: " + summa);
		System.out.println("Vidējais aritmētiskais: " + (summa / (skaits * 1f)));
		System.out.println("Pāra skaitļu skaits: " + paraSkaits + " un summa: " + paraSumma);
		System.out.println("Nepāra skaitļu skaits: " + neparaSkaits + " un summa: " + neparaSumma);
		System.out.println("Pozitīvi skaitļi: " + pozitivi);
		System.out.println("Negatīvi skaitļi: " + negativi);
		System.out.println("Mazākais skaitlis: " + mazakais);
		System.out.println("Lielākais skaitlis: " + lielakais);
		System.out.println("Masīvs: " + Arrays.toString(mas));
		System.out.println("Mazāki par vidējo aritmētisko: " + mazParVid);
		System.out.println("Lielāki par vidējo aritmētisko: " + lielParVid);

		scanner.close();

	}

}
