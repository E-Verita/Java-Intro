/*
 Paka Nr.2. - Uzdevums Nr.2 (max 2 punkti)

Uzrakstīt programmu, kura veic iekavu tipu un skaitu pārbaudi kodā. Kods ir noformēts pareizi, ja viena tipa atverošās iekavas ir vienādā skaitā ar tāda paša tipa aizverošajām iekavām. Piemēram, ja kodā ir divas atverošās figūriekavas, tad kodā ir jābūt arī divām aizverošajām iekavām. Tas pats attiecās arī uz pārējo iekavu veidiem.

Piemēri, kuros kods ir pareizi noformēts un nepareizi noformēts 

 

Programmas izvads:

Lūdzu ievadiet kodu, kam nepieciešams pārbaudīt sintaksi: ((a)c){()}
Kods uzrakstīts: pareizi
Lūdzu ievadiet kodu, kam nepieciešams pārbaudīt sintaksi: {{{))()))
Kods uzrakstīts: nepareizi*/

package majasDarbs1;

import java.util.Scanner;

public class Uzdevums8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi kodu:");
		String kods = scanner.nextLine();

		// iek1 = ( iek2 =[ iek3={
		int iek1 = 0;
		int iek2 = 0;
		int iek3 = 0;

		char[] piem = new char[kods.length()];
		for (int i = 0; i < kods.length(); i++) {
			piem[i] = kods.charAt(i);
		}
		String error = null;
		for (char i : piem) {
			switch (i) {
			case '(':
				iek1++;
				break;
			case '[':
				iek2++;
				break;
			case '{':
				iek3++;
				break;
			case ')':
				iek1--;
				if (iek1 < 0) {
					System.err.print("Kods ievadīts neparezi");
					System.exit(0);
				}
				break;
			case ']':
				iek2--;
				if (iek2 < 0) {
					System.err.print("Kods ievadīts neparezi");
					System.exit(0);
				}
				break;
			case '}':
				iek3--;
				if (iek3 < 0) {
					System.err.print("Kods ievadīts neparezi");
					System.exit(0);
				}
				break;
			default:
				break;
			}

		}
		if ((iek1 + iek2 + iek3) != 0) {
			System.err.print("Kods ievadīts neparezi");
			System.exit(0);
		} else {
			System.out.println("Kods ievadīts pareizi");

		}
	}
}