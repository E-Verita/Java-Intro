package majasDarbs2;

import java.util.Arrays;

public class Uzdevums4 {

	public static void main(String[] args) {
		// visi(3, 5);
		byte[][] mas = izveidotMasivu(3, 5);
		System.out.println("Izveidot 2D masīvu: " + Arrays.deepToString(mas));
		System.out.println("Izvadīts masīvs: ");
		izvadīt(mas);
		System.out.println("Masīva elementu summa: " + aprekinatSummu(mas));
		System.out.println("Vidējais aritmētiskais: " + aprekinatVidejo(mas));

	}

	public static void visi(int rindas, int kolonnas) {
		byte[][] mas2d = new byte[rindas][kolonnas];
		byte skaitlis = 1;
		int summa = 0;
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				mas2d[i][j] = skaitlis;
				System.out.print(mas2d[i][j] + "\t");
				summa += mas2d[i][j];
			}
			skaitlis += 2;
			System.out.println();
		}
		System.out.println("Masīvs: " + Arrays.deepToString(mas2d));
		System.out.println("Summa: " + summa);
		System.out.println("Aritmētiskais: " + (summa / (mas2d.length * mas2d[0].length * 1f)));

	}

	public static byte[][] izveidotMasivu(int rindas, int kolonnas) {
		byte[][] mas2d = new byte[rindas][kolonnas];
		byte skaitlis = 1;
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				mas2d[i][j] = skaitlis;
			}
			skaitlis += 2;
		}
		return mas2d;
	}

	public static void izvadīt(byte[][] mas2d) {
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				System.out.print(mas2d[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static int aprekinatSummu(byte[][] mas2d) {
		int summa = 0;
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				summa += mas2d[i][j];
			}
		}
		return summa;

	}

	public static float aprekinatVidejo(byte[][] mas2d) {
		int summa = aprekinatSummu(mas2d);
		float videjais = (summa / (mas2d.length * mas2d[0].length * 1f));
		return videjais;

	}

}
