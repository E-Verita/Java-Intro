package Tests1;

import java.util.Scanner;

public class Uzdevums4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sakasA = 0;
		int ir6 = 0;
		int beidzasS = 0;
		int saturCiparu = 0;
		System.out.println("Ievadi 8 Strig vērtības!");
		for (int i = 1; i <= 8; i++) {
			String ievade = sc.nextLine();
			if (ievade.startsWith("A")) {
				sakasA++;
			}
			if (ievade.length() == 6) {
				ir6++;
			}
			if (ievade.endsWith("s")) {
				beidzasS++;
			}

			char[] ch = ievade.toCharArray();
			for (char c : ch) {
				if (Character.isDigit(c)) {
					saturCiparu++;
					break;
				}
			}
		}
		System.out.println("Ar \"A\" sākas " + sakasA + " reizes.");
		System.out.println("Ir 6 simbolus garas:" + ir6 + " reizes.");
		System.out.println("Ar \"s\" beidzās: " + beidzasS + " reizes.");
		System.out.println("Satur vismaz 1 ciparu: " + saturCiparu + " reizes.");
		sc.close();
	}

}
