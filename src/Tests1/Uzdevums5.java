package Tests1;

import java.util.Scanner;

public class Uzdevums5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rinda = 1;
		String izvele;
		int kugiA = 0;
		int kugiB = 0;
		int kugiC = 0;
		int c = 0;
		System.out.println("Sākam spēli!");

		do {
			System.out.println("Aizpildam spēles laukuma rindu Nr." + rinda + "\tKāda tipa kuģi vēlaties ievietot "
					+ rinda + ". rindā?");
			if (sc.hasNextLine()) {
				izvele = sc.nextLine();
				if (izvele.toLowerCase().matches("[a]")) {
					kugiA++;
					rinda++;
				} else if (izvele.toLowerCase().matches("[b]")) {
					kugiB++;
					rinda++;

				} else if (izvele.toLowerCase().matches("[c]")) {
					if(rinda>9) {
						System.out.println("Nepietiek vietas laukumā!");
					} else {
					kugiC++;
					rinda+=2;
					}
				} else {
					System.out.println("Nepareiza datu ievade!");

				}

			} else {
				System.out.println("Nepareiza datu ievade!");
			}

		} while (rinda <= 10);
	System.out.println("A tipa kuģi: " + kugiA);
	System.out.println("B tipa kuģi: " + kugiB);
	System.out.println("C tipa kuģi: " + kugiC);

	}

}