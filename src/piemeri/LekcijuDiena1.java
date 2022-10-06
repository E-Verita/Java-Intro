package piemeri;

import java.util.Scanner;

public class LekcijuDiena1 {

	public static void main(String[] args) {
		System.out.println("Sveiki manā pirmajā programmā!");
		System.out.print("Sveiki manā otrajā programmā!");

		String vards = "Arčibalds";
		String suga = "Sfinkss";
		float svars = 13.3f;
		short vecums = 6;
		String krasa = "ruds";
		boolean vaiMiligs = false;
		String pase = "AB12345";

		System.out.println(
				"Es velos pirkt kaķi, kuru sauc " + vards + ", suga ir " + suga + ", svars - " + svars + ", vecums - "
						+ vecums + " mēneši. \nAr krāsas kodu " + krasa + " un viņa pases numurs ir " + pase + ".");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kāds ir kaķa vārds?");
		vards = scanner.nextLine();
		System.out.println("Kāda ir kaķa suga?");
		suga = scanner.nextLine();
		System.out.println("Kāds ir kaķa svars?");
		svars = scanner.nextFloat();
		System.out.println("Kāds ir kaķa vecums?");
		vecums = scanner.nextShort();
		System.out.println("Kāda ir kaķa krāsa?");
		krasa = scanner.next();
		System.out.println("Vai kaķis ir mīlīgs?");
		vaiMiligs = scanner.nextBoolean();
		String vaiMils;
		if (vaiMiligs) {
			vaiMils = "ir";
		} else {
			vaiMils = "nav";
		}
		;

		System.out.println("Man ir kaķis, kuru sauc " + vards + " ,suga " + suga + ", svars - " + svars + ", vecums - "
				+ vecums + " mēneši. " + "\nVinš " + vaiMils + " mīlīgs.");

		scanner.close();

	}

}
