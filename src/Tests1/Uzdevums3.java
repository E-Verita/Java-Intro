package Tests1;

import java.util.Scanner;

public class Uzdevums3 {
	public static void main(String[] args) {
		int skaitlis = 0;
		String turpinat;
		Scanner sc = new Scanner(System.in);
		do {
			do {
				System.out.println("Ievadi nepara skaitli!");
				if (sc.hasNextInt()) {
					int ievade = sc.nextInt();
					if (ievade % 2 == 1 || ievade % 2 == -1) {
						skaitlis = ievade;
						break;
					}
				}

				sc = new Scanner(System.in);
				System.err.println("Lūdzu ievadiet atkārtoti");

			} while (true);
			System.out.println();

			int solis = 0;
			for (int i = 1; i <= 100; i += 2) {
				if (i % 2 == 1) {
					solis++;
				}
				if (i == skaitlis) {
					System.out.println("Skaitlis: " + skaitlis + ", nepieciesamie soļi:" + solis);
					break;
				}
				if (skaitlis > 100 || skaitlis < 0) {
					System.out.println("Skaitlis: " + skaitlis + " nav diapozonā 1-100");
					break;
				}
			}
			System.out.println("\nVai vēlies turpināt. Ja jā - raksti Jā ");
			turpinat = sc.next();
		} while (turpinat.equalsIgnoreCase("jā"));
		System.out.println("Paldies! Programma ir apturēta");
	}
}
