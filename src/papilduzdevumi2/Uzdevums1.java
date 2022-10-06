package papilduzdevumi2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Uzdevums1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Nepieciešams ievadīt 5 skaitļus! \n1 - skaitļus ievadīšu manuāli\n2 - vēlos, lai skaitļi tiktu generēti");
		do {
			if (sc.hasNextInt()) {
				int skaitlis = sc.nextInt();
				if (skaitlis == 1) {
					ievadit();
					break;
				} else if (skaitlis == 2) {
					generet();
					break;
				} else {
					sc = new Scanner(System.in);
					System.err.println("Iespējams izvelēties tikai starp 1 un 2!");
				}

			}
			sc = new Scanner(System.in);
			System.err.println("Lūdzu ievadiet skaitli!");

		} while (true);

	}

	private static void generet() {
		int[] mas = new int[5];
		Random random = new Random();
		int summa = 0;
		for (int i = 0; i < mas.length; i++) {
			do {
				int skaitlis = random.nextInt();
				if (skaitlis >= -100 && skaitlis <= 100) {
					mas[i] = skaitlis;
					summa += skaitlis;
					break;
				}
				continue;

			} while (true);
		}
		System.out.println("Generētais masīvs: " + Arrays.toString(mas));
		float vid = summa / (mas.length * 1f);
		System.out.println("Masīva vidējais aritmētiskais: " + vid);
		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] == mas[j])
					System.out.println("Masīvā atkārtojas skaitlis: " + mas[i]);
			}
		}

	}

	public static void ievadit() {
		Scanner sc = new Scanner(System.in);
		int[] mas = new int[5];
		int summa = 0;
		System.out.println("Lūdzu ievadiet skaitli!");
		for (int i = 0; i < mas.length; i++) {
			do {
				if (sc.hasNextInt()) {
					int skaitlis = sc.nextInt();
					mas[i] = skaitlis;
					summa += skaitlis;
					break;

				}
				sc = new Scanner(System.in);
				System.err.println("Lūdzu ievadiet skaitli!");

			} while (true);

		}
		System.out.println("Ievadītais masīvs: " + Arrays.toString(mas));
		float vid = summa / (mas.length * 1f);
		System.out.println("Masīva vidējais aritmētiskais: " + vid);
		for (int i = 0; i < mas.length; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i] == mas[j])
					System.out.println("Masīvā atkārtojas skaitlis: " + mas[i]);
			}
		}

	}

}
