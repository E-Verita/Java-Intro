package majasDarbs2;

import java.util.Arrays;

//23min
public class Uzdevums2 {

	public static void main(String[] args) {
		byte sakasA = 0;
		byte beidzasS = 0;

		String[] strings = { "Anna", "Jānis", "Aigars", "Pēteris", "Laima", "Aija", "Kaspars", "Baiba", "Lilita" };
		System.out.println(Arrays.toString(strings));
		System.out.println("Vārdi, kas sākas ar \"L\":");
		for (String i : strings) {
			if (i.charAt(0) == 76) {
				System.out.println(i);
			}
			if (i.charAt(0) == 'A') {
				sakasA++;
			}
			if (i.charAt(i.length() - 1) == 's') {
				beidzasS++;
			}
		}
		System.out.println("Masīvā ir " + sakasA + " vārdi, kas sākas ar \"A\".");
		System.out.println("Masīvā ir " + beidzasS + " vārdi, kas beidzas ar \"s\".");

	}

}
