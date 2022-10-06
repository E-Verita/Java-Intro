package piemeri;

import java.util.Scanner;

public class LekcijuDiena3 {

	public static void main(String[] args) {
		izmantotIfElse();
	}

	public static void izmantotTerenary() {
		int a = 5;
		int b;
		if (a > 3) {
			b = a * 3;

		} else {
			b = (a > 3) ? a * 3 : (a + 1) / 3;

		}

		int c = (a < 6 && a > 2) ? 200 : 400;

		if (a < 6 && a > 2) {
			c = 200;
		} else {
			c = 400;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void izmantotSwitch() {

		Scanner skaneris = new Scanner(System.in);
		System.out.println("Lūdzu, ievadi dienu!");
		String diena = skaneris.nextLine();
		byte nodarbibuSkaits = 0;

		switch (diena.toLowerCase()) {
		case "pirmdiena":
		case "tresdiena":
			System.out.println("Šodien ir 4 JAVA nodarbības");
			nodarbibuSkaits = (byte) (nodarbibuSkaits + 4);
			break;
		case "piektdiena":
			System.out.println("Noveicās, jo parasti ir nodarbība!"); // + System.out.println("Šodien ir brīvdiena!"),
																		// jo nav break
		case "otrdiena":
		case "ceturdiena":
		case "svetdiena":
			System.out.println("Šodien ir brīvdiena!");
			break;

		case "sestdiena":
			System.out.println("Šodien it 4 IT standartu nodarbības");
			break;

		default:
			System.out.println("nepareizi ievadīta diena");

		}
		skaneris.close();
	}

	public static void izmantotIfElse() {

		Scanner skaneris = new Scanner(System.in);
		System.out.println("Lūdzu, ievadi dienu!");
		String diena = skaneris.nextLine();
		byte nodarbibuSkaits = 0;

		if (diena.toLowerCase().equals("pirmdiena") || diena.toLowerCase().equals("tresdiena")) {
			System.out.println("Šodien ir 4 JAVA nodarbības");
			nodarbibuSkaits = (byte) (nodarbibuSkaits + 4);
		} else if (diena.toLowerCase().equals("piektdiena") || diena.toLowerCase().equals("otrdiena")
				|| diena.toLowerCase().equals("ceturdiena") || diena.toLowerCase().equals("svetdiena")) {
			System.out.println("Šodien ir brīvdiena!");
			if (diena.toLowerCase().equals("piektdiena")) {
				System.out.println("Noveicās, jo parasti ir nodarbība!");
			}
		} else if (diena.toLowerCase().equals("sestdiena")) {
			System.out.println("Šodien it 4 IT standartu nodarbības");
		} else {
			System.out.println("nepareizi ievadīta diena");
		}
		skaneris.close();
	}

}
