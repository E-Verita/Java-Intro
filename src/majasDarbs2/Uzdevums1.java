package majasDarbs2;

import java.util.Arrays;
import java.util.Scanner;

//20min
public class Uzdevums1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int skaits = 5;
		float[] mas = new float[skaits];
		float summa = 0;
		System.out.println("Ievadi " + skaits + " float tipa skaitļus!");

		for (int i = 1; i <= skaits; i++) {
			System.out.println("Ievadi " + i + ". skaitli!");
			do {
				if (scanner.hasNextFloat()) {
					float skaitlis = scanner.nextFloat();
					summa += skaitlis;
					mas[i - 1] = skaitlis;
					break;
				} else {
					System.err.println("Ievadi skaitli!");
					scanner = new Scanner(System.in);
				}

			} while (true);

		}
		System.out.println("Izveidotais masīvs: " + Arrays.toString(mas));
		float vid = summa / skaits;
		System.out.println("Visu elementu vidējais aritmētiskais: " + vid);
		System.out.println("Elementi, kas mazaki par vidējo aritmētisko: ");
		for (float temp : mas) {
			if (temp < vid) {
				System.out.print(temp + " ");

			}
		}
		System.out.println();

		int counter = 0;
		System.out.println("Katrs otrais elements:");
		for (float temp : mas) {
			if (counter % 2 == 1) {
				System.out.print(temp + " ");
				counter++;

			} else {
				counter++;
			}
		}
		scanner.close();
	}

}
