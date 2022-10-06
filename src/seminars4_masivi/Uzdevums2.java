/*Uzrakstīt programmu, kas darbojas ar skaitļiem masīvā




Programmas izvadam jāizskatās sekojoši:

Elements     Vertiba      Histogramma
0	     19           *******************
1	     3            ***
2	     15           ***************
3	     7            *******
4	     11           ***********
5	     9            *********
6	     13           *************
7	     5            *****
8	     17           *****************
9	     1            *


All items:    0%
izveidot 10 veselu skaitļu masīvu ar vērtībām 19, 3, 15, 7, 11, 9, 13, 5, 17, 1.
izvadīt uz ekrāna trīs kolonnas: elementa indekss, vērtība un elementam atbilstošs zvaigznīšu skaits. Šajā uzdevumā būs jāizmanto cikls iekš cikla.*/

package seminars4_masivi;

public class Uzdevums2 {

	public static void main(String[] args) {
		int[] mas = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
		System.out.println("Elements\tVērtība\t\tHistogramma");
		int elements = 0;
		for (int i : mas) {
			System.out.print(elements + "\t\t" + i + "\t\t");
			elements++;
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
