package Tests1;

import java.util.Scanner;

public class Uzdevums1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int skaitlis1 = 0;
		int skaitlis2 = 0;

		int sum = 0;
		System.out.println("Ievadi 2 skaitļus intervala no -5 līdz 5");
		if (sc.hasNextInt()) {
			skaitlis1 = sc.nextInt();
			if (skaitlis1 >= -5 && skaitlis1 <= 5) {
				sum += skaitlis1;

			} else {
				System.err.println("Skaitlis 1 nav ievadīts noteiktajā intervālā!");
				System.exit(0);
			}
		} else {
			System.err.println("Ievadi skaitļus!");
			System.exit(0);
		}

		if (sc.hasNextInt()) {
			skaitlis2 = sc.nextInt();
			if (skaitlis2 >= -5 && skaitlis2 <= 5) {
				sum += skaitlis2;

			} else {
				System.err.println("Skaitlis 2 nav ievadīts noteiktajā intervālā!");
				System.exit(0);

			}
		} else {
			System.err.println("Ievadi skaitļus!");
			System.exit(0);
		}

		System.out.println("Summa: " + sum);
		System.out.println("Vidējais aritmētiskais: " + sum / 2f);
		if (skaitlis1 < 0) {
			System.out.println("Skaitlis 1 ir negatīvs");
		}
		if (skaitlis2 < 0) {
			System.out.println("Skaitlis 2 ir negatīvs");
		}
		if (skaitlis1 > skaitlis2) {
			System.out.println("1. Skaitlis " + skaitlis1 + " ir lielāks par 2.skaitli");
		} else if (skaitlis1 < skaitlis2) {
			System.out.println("2. Skaitlis " + skaitlis2 + " ir lielāks par 1. skaitli");
		} else {
			System.out.println("Skaitļi ir vienādi");
		}
		sc.close();
	}

}
