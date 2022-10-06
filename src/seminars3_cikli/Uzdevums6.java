package seminars3_cikli;

import java.util.Scanner;

public class Uzdevums6 {
	public static void main(String[] args) {
		aprekinatCikliski();
	}

	public static void vienamSkaitlim(int i) {
		System.out.println("n \t\tn^2 \t\tn^3");
		System.out.println(i + "\t\t" + i * i + "\t\t" + i * i * i);
		System.out.println("-------------------------------------");
	}

	public static void cikla10() {
		System.out.println("n \t\tn^2 \t\tn^3");
		int i = 1;
		while (i <= 10) {
			System.out.println(i + "\t\t" + i * i + "\t\t" + i * i * i);
			i++;
		}
		System.out.println("-------------------------------------");
	}

	public static void cikliski() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli!");
		int skaitlis = scanner.nextInt();
		System.out.println("n \t\tn^2 \t\tn^3");
		int i = 1;
		while (i <= skaitlis) {
			System.out.println(i + "\t\t" + (int) Math.pow(i, 2) + "\t\t" + (int) Math.pow(i, 3));
			i++;
		}
		scanner.close();

	}

	public static void aprekinatCikliski() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi skaitli!");
		int skaitlis = scanner.nextInt();
		System.out.println("Ievadi pakāpi!");
		int pakape = scanner.nextInt();

		System.out.println();
		int i = 1;
		while (i <= pakape) {
			if (i == 1) {
				System.out.print("n");
			} else {
				System.out.print("\tn^" + i);
			}
			i++;
		}
		System.out.println();
		int a = 1;
		while (a <= skaitlis) {
			int rezultats = 1;
			int j = 1;
			while (j <= pakape) {
				rezultats = rezultats * a;
				System.out.print(rezultats + "\t");
				j++;
			}
			System.out.println();
			a++;
		}
		scanner.close();
	}
}