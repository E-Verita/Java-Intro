/*Uzdevums Nr.2 (max 2 punkti)

Izmantojot pakārotus for ciklus izvadīt uz ekrāna sekojošo:



Uz ekrāna vienlaicīgi drīskt izvadīt tikai vienu zvaigznīti ar sekojošu koda rindu

System.out.print("* ")*/

package majasDarbs1;

public class Uzdevums2 {

	public static void main(String[] args) {
		int garums = 8;
		for (int i = garums; i >= 1; i--) {
			System.out.println();
			for (int j = garums; j >= 1; j--) {
				System.out.print("* ");
			}
		}
		System.out.println();
		System.out.println("--------------------------------------");

		for (int i = 1; i <= garums; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
		}

		System.out.println();
		System.out.println("--------------------------------------");

		for (int i = 1; i <= garums; i++) {
			System.out.println();
			for (int j = i; j <= garums; j++) {
				System.out.print("* ");
			}
		}

		System.out.println();
		System.out.println("--------------------------------------");

		for (int i = 1; i <= garums; i++) {
			System.out.println();
			for (int j = 2 * (garums - i); j >= 1; j--) {
				System.out.print("");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
		}

	}

}
