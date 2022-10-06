package majasDarbs2;

import java.util.Arrays;

public class Uzdevums5 {
	public static void main(String[] args) {

		int[][] masA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int[][] masB = { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 }, { 20, 22, 22 } };
		int[] vektV = { 1, 2, 3 };
		int[][] masD = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

		// 1.Uzrakstīt funkciju, kurā veic padotās matricas reizināšanu ar padoto
		// skaitli un atgriež rezultātu.
		int skaitlis = 3;
		int[][] masXskaitlis = reizinatArSkaitli(masA, skaitlis);
		System.out.println("Reizinot matricu " + Arrays.deepToString(masA) + " ar " + skaitlis + ", iegūst: "
				+ Arrays.deepToString(masXskaitlis));
		System.out.println("----------------------------------------------------------\n\n");

		// 2. Uzrakstīt funkciju, kurā veic divu padoto matricu saskaitīšanu un atgriež
		// rezultātu
		int[][] masUNmas = saskaitit2(masA, masB);
		System.out.println("Saskaitītas matricas A un B: " + Arrays.deepToString(masUNmas));
		System.out.println("----------------------------------------------------------\n\n");

		// 3.Uzrakstīt funkciju, kurā veic padotas matricu transponēšanu un atgriež
		// rezultātu
		int[][] transpA = transponet(masA);
		System.out.println("Transponējot " + Arrays.deepToString(masA) + " , iegūst " + Arrays.deepToString(transpA));
		System.out.println("----------------------------------------------------------\n\n");

		// 4. Uzrakstīt funkciju, kurā veic padotas matricu reizināšanu ar vektoru v un
		// atgriež rezultātu.
		int[] masAreizV = reizinatArVektoru(masA, vektV);
		System.out.println("Masīva " + Arrays.deepToString(masA) + " reizinājums ar vektoru " + Arrays.toString(vektV)
				+ " ir: " + Arrays.toString(masAreizV));
		System.out.println("----------------------------------------------------------\n\n");

		// 5. Uzrakstīt funkciju, kurā veic padoto matricu reizināšanu un atgriež
		// rezultātu
		int[][] masXmas = reizinat2masivus(masA, masD);
		System.out.println("Reizinot " + Arrays.deepToString(masA) + " ar " + Arrays.deepToString(masD)
				+ " rezultats ir: " + Arrays.deepToString(masXmas));

	}

	public static int[][] reizinatArSkaitli(int[][] mas, int skaitlis) {
		int[][] masNew = new int[mas.length][mas[0].length];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				masNew[i][j] = mas[i][j] * skaitlis;
			}
		}
		return masNew;
	}

	public static boolean vaiVienadaLieluma(int[][] mas1, int[][] mas2) {
		if (!(mas1.length == mas2.length)) {
			System.err.print("Masīvi nav vienada izmēra - atšķiras rindu skaits!");
			return false;
		}

		for (int i = 0; i < mas1.length; i++) {
			if (!(mas1[i].length == mas2[i].length)) {
				System.err.print("Masīvi nav vienada izmēra - atšķiras kolonnu skaits kādā(s) no rindām!");
				return false;
			}
		}
		return true;
	}

	public static int[][] saskaitit2(int[][] mas1, int[][] mas2) {
		int[][] masNew = new int[mas1.length][mas1[0].length];
		if (!vaiVienadaLieluma(mas1, mas2)) {
			return null;
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[0].length; j++) {
				masNew[i][j] = mas1[i][j] + mas2[i][j];
			}
		}
		return masNew;
	}

	public static int[][] transponet(int[][] mas) {
		int[][] masNew = new int[mas[0].length][mas.length];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				masNew[j][i] = mas[i][j];
			}
		}
		return masNew;
	}

	public static int[] reizinatArVektoru(int[][] mas, int[] vekt) {
		int[] masNew = new int[mas.length];

		if (!(mas[0].length == vekt.length)) {
			System.err.println(
					"Lai matricu reizinātu ar vektoru, matricas kolonnu skaitam jāsakrīt ar vektora rindu skaitu!");
			return null;
		}
		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			for (int j = 0; j < mas[0].length; j++) {
				sum += mas[i][j] * vekt[j];
			}
			masNew[i] = sum;
		}
		return masNew;
	}

	public static int[][] reizinat2masivus(int[][] mas1, int[][] mas2) {
		int[][] masNew = new int[mas1.length][mas2[0].length];

		if (!(mas1[0].length == mas2.length)) {
			System.err.println(
					"Lai 2 matricas reizinātu, 1. matricas kolonnu skaitam jāsakrīt ar 2. matricas rindu skaitu!");
			return null;
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas2[0].length; j++) {
				masNew[i][j] = 0;
				for (int k = 0; k < mas2.length; k++) {
					masNew[i][j] += mas1[i][k] * mas2[k][j];
				}
			}
		}
		return masNew;
	}

}
