package seminars5_funkcijas;

import java.util.Arrays;
import java.util.Random;

public class Uzdevums5 {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(create2DArray()));
		print(create2DArray());
		int masSumma = sum2dArray(create2DArray());
		System.out.println("Masīva " + Arrays.deepToString(create2DArray()) + " elementu summa ir " + masSumma);

		float videjais = averageEl(create2DArray());
		System.out.println(
				"Masīva " + Arrays.deepToString(create2DArray()) + " elementu vidējais aritmētiskais ir " + videjais);

		byte maxEl = maxEl(create2DArray());
		System.out.println("Masīva " + Arrays.deepToString(create2DArray()) + " lielākais elements ir " + maxEl);

		byte minEL = minEl(create2DArray());
		System.out.println("Masīva " + Arrays.deepToString(create2DArray()) + " mazakais elements ir " + minEL);

		System.out.println(Arrays.deepToString(generate2DArray()));

	}

	private static byte[][] create2DArray() {
		byte[][] mas2d = new byte[3][5];
		byte skaitlis = 1;
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				mas2d[i][j] = skaitlis;
			}
			skaitlis += 2;
		}
		return mas2d;

	}

	private static void print(byte[][] mas2d) {
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				System.out.print(mas2d[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void print(int[][] mas2d) {
		for (int i = 0; i < mas2d.length; i++) {
			for (int j = 0; j < mas2d[i].length; j++) {
				System.out.print(mas2d[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int sum2dArray(byte[][] mas2d) {
		int summa = 0;
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				summa += mas2d[i][j];
			}
		}
		return summa;
	}

	private static float averageEl(byte[][] mas2d) {
		int summa = sum2dArray(mas2d);
		float masAverage = (summa / (mas2d.length * mas2d[0].length * 1f));
		return masAverage;
	}

	private static byte minEl(byte[][] mas2d) {
		byte minEl = Byte.MAX_VALUE;
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				if (mas2d[i][j] < minEl) {
					minEl = mas2d[i][j];
				}
			}
		}
		return minEl;
	}

	private static byte maxEl(byte[][] mas2d) {
		byte maxEl = Byte.MIN_VALUE;
		for (byte i = 0; i < mas2d.length; i++) {
			for (byte j = 0; j < mas2d[i].length; j++) {
				if (mas2d[i][j] > maxEl) {
					maxEl = mas2d[i][j];
				}
			}
		}
		return maxEl;
	}

	private static int[][] generate2DArray() {
		Random random = new Random();
		int[][] randMas = new int[5][4];
		for (int i = 0; i < randMas.length; i++) {
			for (int j = 0; j < randMas[0].length; j++) {
				randMas[i][j] = random.nextInt(100);
			}

		}
		return randMas;
	}

}
