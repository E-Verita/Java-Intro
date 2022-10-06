package piemeri;

import java.util.Arrays;

public class LekcijuDiena7_Masivi_salidzinasana_2D {
	public static void main(String[] args) {
		netaisnstura2D();
	}

	public static void salidzinat() {
		int[] mas2 = { 1, 2, 3 };
		int[] mas3 = mas2; // pieskiram referenci
		int[] mas4 = { 1, 2, 3 };
		if (mas2.equals(mas3)) { // salīdzina referenses, ne vērtības
			System.out.println("mas2 = mas3: " + mas2 + " = " + mas3);
		}
		if (mas2.equals(mas4)) {
			System.out.println("mas2 == mas4: " + mas2 + " = " + mas4); // neizpildisies
		} else {
			System.out.println("mas2 != mas4: " + mas2 + " = " + mas4); // izpildisies
		}
	}

	public static void salidzinat2() {
		int[] mas1 = { 1, 3, 5, 7, 9 };
		int[] mas2 = mas1; // pieskiram referenci
		int[] mas3 = { 1, 3, 5, 7, 9 };
		System.out.println("mas1:");
		for (int temp : mas1) {
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println("mas2:");
		for (int temp : mas2) {
			System.out.print(temp + " ");
		}
		System.out.println();

		mas1[3] = 100; // mas1 - 1 3 5 100 9
		System.out.println("Pec mas1[3] vērtību nomaiņas:");
		System.out.println("mas1:");
		for (int temp : mas1) {
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println("mas2:");
		for (int temp : mas2) {
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println("mas3:");
		for (int temp : mas3) {
			System.out.print(temp + " ");
		}
		System.out.println();

		mas3[3] = 100; // vērtības visiem mas vienādas

		if (mas1.equals(mas1)) {
			System.out.println("mas1 = mas 2"); // true
		} else {
			System.out.println("mas1 != mas 2");

		}
		if (mas1.equals(mas3)) {
			System.out.println("mas1 = mas 3");
		} else {
			System.out.println("mas1 != mas 3"); // true

		}

		// NOSKAIDROT, VAI SAKRĪT VERTĪBAS
		// 1. algoritmiski
		if (mas1.length == mas3.length) {
			for (int i = 0; i < mas1.length; i++) {
				if (mas1[i] != mas3[i]) {
					System.out.println("Masīvos esošie elementi nesarīt!");
					break;
				}

			}
		} else {
			System.out.println("Masīviem nesakrīt elementu skaits --> nav vienādi.");
		}

		// 2. izmantojot Arrays klasi
		System.out.println("--------------------------------------");
		mas3[2] = 8;
		System.out.println("mas1: " + Arrays.toString(mas1));
		System.out.println("mas3: " + Arrays.toString(mas3));
		if (Arrays.equals(mas1, mas3)) { // true /fals
			System.out.println("Arrays equals: true");
		} else {
			System.out.println("Arrays equals: false");

		}
		/*
		 * Lexicographically means in dictionary order,i.e.if two strings are compared
		 * based on dictionary position the string which comes afterwards is said to be
		 * Lexicographically greater.
		 */
		if (Arrays.compare(mas1, mas3) == 0) { // -1; 0; 1 lexicographically greater
			System.out.println("Arrays compare: 0");
		} else if (Arrays.compare(mas1, mas3) == 1) {
			System.out.println("Arrays compare: 1");

		} else if (Arrays.compare(mas1, mas3) == -1) {
			System.out.println("Arrays compare: -1");
		}

		int[] mas5 = mas1.clone();
		System.out.println(Arrays.toString(mas5));
		System.out.println(Arrays.toString(mas1));
		System.out.println(mas1);
		System.out.println(mas5);

	}

	public static void masivi2D() {
		int[][] mas2D = new int[3][2];

		mas2D[0][1] = 100;
		mas2D[2][0] = 5;
		// 0 1
		// 0 [0] [100]
		// 1 [0] [0]
		// 2 [5] [0]

		mas2D[2][0] = 19;
		mas2D[1][1] = 31;
		mas2D[0][0] = 99;
		// mas2D[2][2] - nevar izprintēt
		// 0 1
		// 0 [99] [100]
		// 1 [0] [31]
		// 2 [19] [0]
		// IZPRINTĒT ALGORITMISKI:
		for (int i = 0; i < mas2D.length; i++) {
			for (int j = 0; j < mas2D[i].length; j++) {
				System.out.print(mas2D[i][j] + "\t");
			}
			System.out.println();

		}
		// Ar Arrays:
		System.out.println("Arrays.deepToString(mas): " + Arrays.deepToString(mas2D));

	}

	public static void taisnstura2D() {
		float[] eks1 = { 23.2f, 31.5f, 16.9f, 27.5f };
		float[] eks2 = { 34.8f, 45.2f, 27.9f, 36.8f };
		float[] eks3 = { 19.4f, 16.8f, 10.2f, 20.8f };

		float[][] dimens = { eks1, eks2, eks3 };
		for (int i = 0; i < dimens.length; ++i) {
			for (int j = 0; j < dimens[i].length; ++j) {
				System.out.print(dimens[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-----------------");

		System.out.println(Arrays.deepToString(dimens));

		System.out.println("-----------------");

	}

	public static void netaisnstura2D() {
		int[][] mas2d = { { 1, 2, 3, }, { 99 }, { 4, 5 } };

		for (int i = 0; i < mas2d.length; ++i) {
			for (int j = 0; j < mas2d[i].length; ++j) {
				System.out.print(mas2d[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("-----------------");

		System.out.println(Arrays.deepToString(mas2d));

	}

}
