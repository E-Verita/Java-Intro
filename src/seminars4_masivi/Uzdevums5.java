/*Uzdevums Nr.5

Uzrakstīt programmu, kura aprēķina n-to Fibonači skaitli un izvada to uz ekrāna.

Fibonači skaitļu virkne izskatās sekojoši:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Fibonači skaitļi tiek rēķināti pēc sekojošas formulas:

F(n) = F(n-1) + F(n-2)
(katrs nākamais skaitlis ir iepriekšējo divu skaitļu summa – pavisam vienkārši realizējams izmantojot ciklu)

Programmas darbības piemērs:

Ievadi n: 10
10 Fibonaci skaitlis ir 34



All items:    0%
prasīt ievadīt Fibonači skaitļa kārtas numuru;
veikt ievadītā skaitļa pārbaudi;
aprēķināt visus Fibonači rindas skaitļus līdz lietotāja ievadītajam kārtas numuram. Skaitļu saglabāšanai izmantojiet masīvus. Nepieciešams darboties ar ciklu;
rezultātu izvadīt konsolē.*/

package seminars4_masivi;

import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numurs;
		System.out.println("Lūdzu ievadi Fibonači skaitļa kārtas numuru!");
		do {
			if (sc.hasNextInt()) {
				numurs = sc.nextInt();
				if (numurs > 0) {
					break;
				}

			}
			sc = new Scanner(System.in);
			System.err.println("Lūdzu pozitīvu pozitīvu, veselu skaitli!");
		} while (true);

		int f1 = 0;
		int f2 = 1;
		int f3 = f1 + f2;

		int[] mas = new int[numurs];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = f1;
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;

		}
		System.out.println("Masīvs: " + Arrays.toString(mas));
		System.out.println(numurs + ". Fibonaci skaitlis ir  " + mas[numurs-1]);
		sc.close();
	}

}