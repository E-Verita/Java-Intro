package piemeri;

import javax.swing.JOptionPane;

public class LekcijuDiena2 {
	public static void main(String[] args) {
		int skaitlis = 6;
		skaitlis += 10; // skaitlis = skaitlis + 10;
		int skaitlis2 = 5;
		System.out.println(skaitlis);
		skaitlis += skaitlis2; // skaitlis = skaitlis + skaitlis2
		System.out.println(skaitlis);
		int vecums = 18;
		/*
		 * vecums++; //vecums = vecums+1; ++vecums; //ja tasevišķa koda rinda, tad
		 * =vecums++
		 */

		System.out.println("Vecums: " + (vecums++)); // printēšana vispirms -- 18, palielināšana pēc tam. -->19
		System.out.println("Vecums: " + (++vecums)); // palielināšana vispirms 19 --> 20 , printēšana pēc tam -- 20.

		int num1 = 9;
		int num2 = 4;
		// int + int = 13 --> int/int 13/2--> int 6---> 2 (float)int 6.0
		float rezultats = (num1 + num2) / 2;
		System.out.println(rezultats);

		// INT ---> FLOAT
		float rezultats2 = (num1 + num2) / 2f; // vai num1/((float))num2);
		System.out.println(rezultats2);

		float dalijums = (num1 / ((float) num2));
		System.out.println(dalijums);

		float dalijums2 = (num1 / (num2 * 1f));
		System.out.println(dalijums2);

		System.err.print("Šī ir kļūda");

		String vards = "Everita";
		System.out.printf("Mani sauc %s un es esmu %d gadus veca!", vards, 30);

		float cena = 12.99f;
		System.out.println("Vecā cena: " + cena + "EUR.");

		cena = cena * 0.5f;
		System.out.println("Jaunā cena: " + cena + "EUR.");

		System.out.printf("Jaunā cena formatēta %.2f EUR.", cena);

		String lietotajvards = JOptionPane.showInputDialog(null, "Ievadi lietotājvārdu!");
		JOptionPane.showMessageDialog(null, "Sveiks " + lietotajvards + " no GUI lodziņa!");
		System.out.println("Sveiks lietotāj " + lietotajvards);

	}

}
