package Tests1;

import java.util.Scanner;

public class Uzdevums2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mala1=0;
		int mala2=0;

		System.out.println("Ievadi abas taisnstūra malas");
		if (sc.hasNextInt()) {
			mala1 = sc.nextInt();
			if (mala1 < 0) {
				mala1 = 10;
			}
			if (mala1 == 0) {
				System.err.println("Malas lielums nevar būt 0!");
				System.exit(0);
			}
		}else {
			System.err.println("Netika ievadīts skaitlis!");
			System.exit(0);

		}
		
		if (sc.hasNextInt()) {
			mala2 = sc.nextInt();
			if (mala2 < 0) {
				mala2 = 10;
			}
			if (mala2 == 0) {
				System.err.println("Malas lielums nevar būt 0!");
				System.exit(0);
			}
		}else {
			System.err.println("Netika ievadīts skaitlis!");
			System.exit(0);

		}
		
		System.out.println("Ko vēlies aprēķināt? Ievadi\n1 - ja vēlies aprēķināt perimetru"
				+ "\n2 - vēlies aprēķināt laukumu.");
		if (sc.hasNextInt()) {
		int ievade = sc.nextInt();
		switch(ievade) {
		case 1:
			System.out.println("Perimetrs ir " + (2*(mala1+mala2)));
			break;
		case 2:
			System.out.println("Laukums ir " + (mala1*mala2));
			break;
		default: 
			System.err.println("Tika ievadīta neeksistējoša izvēle.");
			System.exit(0);
		}
		} else {
			System.err.println("Tika ievadīta neeksistējoša izvēle.");
			System.exit(0);

		}
		sc.close();

	}

}
