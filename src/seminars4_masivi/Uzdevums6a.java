package seminars4_masivi;

import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums6a {

	public static void main(String[] args) {
		float[][] eksperimenti = new float[3][4];
		Scanner sc = new Scanner(System.in);

		float summa = 0;
		for (int i = 0; i < eksperimenti.length; i++) {
			System.out.println("Eksperiments Nr. " + (i + 1));
			float expsumma = 0;

			for (int j = 0; j < eksperimenti[i].length; j++) {
				do {
					if (sc.hasNextFloat()) {
						eksperimenti[i][j] = sc.nextFloat();
						summa += eksperimenti[i][j];
						expsumma += eksperimenti[i][j];
						// System.out.println("i: " + i + " j: " + j + " summa: " + summa);
						break;

					} else {
						System.err.println("Ievadi float tipa skaitli!");
						sc = new Scanner(System.in);
					}

				} while (true);

			}
			System.out.println("Average eksperimentam ir: " + (expsumma / eksperimenti[i].length));
			System.out.println("Summa eksperimentam ir: " + expsumma);

		}
		System.out.println(Arrays.deepToString(eksperimenti));
		String sum = String.format("%.1f", summa);
		System.out.println("Summa  ir: " + sum);
		System.out.println("Average  ir: " + (summa / (eksperimenti.length * eksperimenti[0].length)));
	}
}