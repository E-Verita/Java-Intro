package papilduzdevumi1;

import java.util.Scanner;

public class Uzdevums3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int summa = 0;
		int c = 0;
		for (int i = 10; i < +99; i++) {
			summa = +i;
			if (i % 4 == 0) {
				System.out.println("Dalās ar 4: " + i);
			}
		}
		System.out.println("Summa: " + summa);
		for (int j = 1; j <= 10; j++) {
			for (int k = 1; k <= 10; k++) {
				System.out.print(k * j + "\t");
			}
			System.out.println();
		}
		System.out.println("Ievadiet teikumu: ");
		if (sc.hasNextLine()) {
			String teikums = sc.nextLine();
			String[] splitTeik = teikums.split(" ");
			System.out.println("Teikumā ir " + splitTeik.length + " vārdi.");

		}
		System.out.println("Ievadiet naturālu skaitli c: ");
		if (sc.hasNextInt()) {
			c = sc.nextInt();
			for (int a = 1; a < 100; a++) {
				for (int b = 1; b <= 100; b++) {
					if ((Math.pow(a, 2)) + (Math.pow(b, 2)) == (Math.pow(c, 2))) {
						System.out.println(a + " , " + b);
					}
				}
			}
		}
		sc.close();
	}

}
