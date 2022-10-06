package piemeri;

import java.util.Arrays;

public class LekcijuDiena6_Masivi {

	public static void main(String[] args) {
		piemeri5();
	}

	public static void piemeri() {
		byte[] baiti = { 1, 4, 6, 9, 10, -50, 3, 7 };
		double[] doubles = { 1.9, 6.09, 3.09676732, 0.008 };
		char[] chari = { 'a', 'f', 'h', 'r', 'm', 'j', 'u' };
		boolean[] booleani = { true, false, true, true };
		String[] stringi = { "Everita", "Vecberza", "Ventspils", "Augstskola" };

		System.out.println(baiti);
		System.out.println(Arrays.toString(baiti));
		for (int i : baiti) {
			System.out.println(i);

		}
		System.out.println("--------------------------------------------------");

		System.out.println(doubles);
		System.out.println(Arrays.toString(doubles));
		for (double i : doubles) {
			System.out.println(i);

		}
		System.out.println("--------------------------------------------------");

		System.out.println(chari);
		System.out.println(Arrays.toString(chari));
		for (char i : chari) {
			System.out.println(i);

		}
		System.out.println("--------------------------------------------------");
		System.out.println(booleani);
		System.out.println(Arrays.toString(booleani));
		for (boolean i : booleani) {
			System.out.println(i);

		}

		System.out.println("--------------------------------------------------");
		System.out.println(stringi);
		System.out.println(Arrays.toString(stringi));
		for (String i : stringi) {
			System.out.println(i);

		}
		System.out.println("--------------------------------------------------");
		System.out.println(baiti);
		System.out.println(Arrays.toString(baiti));
		for (int i : baiti) {
			System.out.println(i);

		}
	}

	public static void piemeri5() {
		String[] stringi = { "Everita", "Vecberz", "Ventspils", "augstskola" };
		System.out.println("--------------------------------------------------");
		System.out.println(stringi);
		System.out.println(Arrays.toString(stringi));
		for (String i : stringi) {
			System.out.print(i + " ");
			if (i.length() == 7) {
				System.out.println("=7 ");
			}
			if (i.charAt(0) >= 65 && i.charAt(0) <= 90) { // ASCII
				System.out.print("!");
			}

		}
	}
}
