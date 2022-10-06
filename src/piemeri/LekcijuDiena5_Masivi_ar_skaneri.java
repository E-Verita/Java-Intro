package piemeri;

import java.util.Scanner;

public class LekcijuDiena5_Masivi_ar_skaneri {
	public static void main(String[] args) {
		arSkaneri();

	}

	public static void sakumaDarbibas() {
		byte[] atzimes = new byte[10];
		atzimes[0] = 3;
		atzimes[5] = 4;
		atzimes[8] = 10;
		atzimes[5 + 2] = 6;

		System.out.println("[0]:" + atzimes[0]);
		System.out.println("[1]:" + atzimes[1]);
		System.out.println("[2]:" + atzimes[2]);
		System.out.println("[3]:" + atzimes[3]);
		System.out.println("[4]:" + atzimes[4]);
		System.out.println("[5]:" + atzimes[5]);
		System.out.println("[6]:" + atzimes[6]);
		System.out.println("[7]:" + atzimes[7]);
		System.out.println("[8]:" + atzimes[8]);
		System.out.println("[9]:" + atzimes[9]);

		System.out.println("----------------------");
		for (int i = 0; i < atzimes.length; i++) {
			System.out.println("[" + i + "]:" + atzimes[i]);

		}
		System.out.println("----------------------");

		for (byte i : atzimes) {
			System.out.println(i);

		}

	}

	public static void arSkaneri() {
		Scanner mansSkeneris = new Scanner(System.in);
		byte[] atzimes = new byte[5];

		// Saglabāt vērtības:
		for (int i = 0; i < atzimes.length; i++) {
			System.out.println("Lūdzu ievadiet " + (i + 1) + ". atzīmi");
			atzimes[i] = mansSkeneris.nextByte();
		}

		// Apstrādājam:
		byte summa = 0;
		for (int i = 0; i < atzimes.length; i++) {
			System.out.println("[" + i + "]:" + atzimes[i]);
			summa = (byte) (summa + atzimes[i]);

		}
		System.out.println("Summa: " + summa);
		mansSkeneris.close();
	}
}
