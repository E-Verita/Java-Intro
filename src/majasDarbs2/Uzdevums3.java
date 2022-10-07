package majasDarbs2;

import java.util.Arrays;

public class Uzdevums3 {
	public static void main(String[] args) {
		float[] mas = new float[11];
		System.out.println("Aizpildīts padotais viendimensiju masīvs: " + Arrays.toString(aizpildit(mas)));
		System.out.println("Izveidots 2D masīvs: " + Arrays.deepToString(izveidot2D(mas)));
		izprintēt2D(izveidot2D(mas));
	}

	public static float[] aizpildit(float[] mas) {
		int start = 2 * 10;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (float) (start / 10f);
			start += (0.1 * 10);

		}
		return mas;
	}

	public static float[][] izveidot2D(float[] mas) {
		float[][] mas2d = new float[mas.length][5];
		for (int i = 0; i < mas2d.length; i++) {
			mas2d[i][0] = mas[i];
			mas2d[i][1] = mas[i] / 10;
			mas2d[i][2] = (float) Math.pow(mas[i], 2);
			mas2d[i][3] = (float) Math.pow(mas[i], 3);
			mas2d[i][4] = (float) Math.pow(mas[i], 4);
		}
		return mas2d;

	}

	public static void izprintēt2D(float[][] mas2d) {
		System.out.println("X\t\t\t1/x\t\t\tx^2\t\t\tx^3\t\t\tx^4");
		for (int i = 0; i < mas2d.length; ++i) {
			for (int j = 0; j < mas2d[i].length; ++j) {
				System.out.print(String.format("%.2f", mas2d[i][j]) + "\t\t");

			}
			System.out.println();

		}

	}
}
