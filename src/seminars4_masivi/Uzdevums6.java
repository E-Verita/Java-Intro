package seminars4_masivi;

import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums6 {
	public static void main(String[] args) {
		int ekspSkaits = 2; // ievade
		int ievaditie = 1;
		Scanner sc = new Scanner(System.in);
		float[][] dimens = new float[ekspSkaits][ievaditie];

		do {
			int skaits = 2; // ievade
			System.out.println("Lūdzu ievadi " + ievaditie + ". eksperimenta rezultātus!");

			float[] mas = new float[skaits];
			for (int i = 0; i < skaits; i++) {
				do {
					if (sc.hasNextInt()) {
						int skaitlis = sc.nextInt();
						if (skaitlis > 0) {
							mas[i] = skaitlis;
							break;
						}

					}
					sc = new Scanner(System.in);
					System.err.println("Lūdzu ievadi skaitli!");
				} while (true);
			}
			Arrays.toString(mas);
			ievaditie++;
		} while (ievaditie <= ekspSkaits);

		for (int i = 0; i < dimens.length; ++i) {
			int vid = 0;
			for (int j = 0; j < dimens[i].length; ++j) {
				System.out.print(dimens[i][j] + " ");
				vid += dimens[i][j];
			}
			System.out.println();
			System.out.println("Eksperimenta vidējais: " + vid);
		}
	}

}

/*
 * package seminars4;
 * 
 * public class Uzdevums6 { public static void main(String[] args) { float[]
 * eks1 = { 23.2f, 31.5f, 16.9f, 27.5f }; float[] eks2 = { 34.8f, 45.2f, 27.9f,
 * 36.8f }; float[] eks3 = { 19.4f, 16.8f, 10.2f, 20.8f };
 * 
 * float[][] dimens = { eks1, eks2, eks3 }; for (int i = 0; i < dimens.length;
 * ++i) { int vid = 0; for (int j = 0; j < dimens[i].length; ++j) {
 * System.out.print(dimens[i][j] + " "); vid += dimens[i][j]; }
 * System.out.println(); System.out.println("Eksperimenta vidējais: " + vid); }
 * 
 * } }
 */