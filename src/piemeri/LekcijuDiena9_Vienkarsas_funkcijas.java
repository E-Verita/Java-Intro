package piemeri;

public class LekcijuDiena9_Vienkarsas_funkcijas {
	public static void main(String[] args) {
		short vecums1 = 18;
		short vecums2 = 30;
		short rezultats = kursIrMazaks(vecums1, vecums2);
		System.out.println(rezultats);

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Ievadi 2 vērtības!"); short ievade1 = sc.nextShort();
		 * short ievade2 = sc.nextShort(); short resuzltatsSc = kursIrMazaks(ievade1,
		 * ievade2); System.out.println(resuzltatsSc);
		 */

		// 1.noskaidrot, cik no ievadītām 3 vērtībām ir negatīvas
		int negativas = negativasVertibas(-55, 8, -3);
		System.out.println("Negatīvi skaitļi: " + negativas);

		// 2. izprintē 2 padotos string kā vienu tekstu
		viensTeksts("Viens", "teksts");

		// 3. kura no float vērtība ir lielākā no nezināmā skaita vērtībām
		float lielakais = lielakaisFloat(2.5f, 30.20f, 3000.5f);
		System.out.println("Lielākais float: " + lielakais);

		// 4. izveidot vārdu no padotajām char vērtībām
		String vards = vardsNoChar('n', 'o', 'p', 'e');
		System.out.println("Vārds no 4 char: " + vards);

		// 5. noskaidrot, vai ievadītais teksts satur tikai burtus un pirmais ir lielais
		// burts
		String teksts = "vaiOK1";
		String teksts2 = "vaiOK1";
		String teksts3 = "EaiOK";

		System.out.println(noskaidrot(teksts));
		System.out.println(noskaidrot(teksts2));
		System.out.println(noskaidrot(teksts3));

	}

	// pieejamības atribūti:
	// - private - lieto tikai šaja klasē
	// - package - lieto visā pakotnē
	// protected - lieto, ja ir mantošana
	// public - lieto visur projektā
	public static short kursIrMazaks(short sk1, short sk2) {
		if (sk1 < sk2) {
			return sk1;
		} else if (sk1 > sk2) {
			return sk2;
		} else {
			System.out.println("Abi skaitļi ir vienādi!");
			return sk1;
		}
	}

	public static int negativasVertibas(int ver1, int ver2, int ver3) {
		int negativas = 0;
		if (ver1 < 0) {
			negativas++;
		}
		if (ver2 < 0) {
			negativas++;
		}
		if (ver3 < 0) {
			negativas++;
		}

		return negativas;
	}

	public static void viensTeksts(String vards1, String vards2) {
		System.out.println(vards1 + " " + vards2);
	}

	public static float lielakaisFloat(float... vertibas) {
		float lielakais = Float.MIN_VALUE;
		for (float temp : vertibas) {
			if (temp > lielakais) {
				lielakais = temp;
			}
		}
		return lielakais;
	}

	public static String vardsNoChar(char c1, char c2, char c3, char c4) {
		String vards = "" + c1 + "" + c2 + "" + c3 + "" + c4;

		return vards;
	}

	public static boolean noskaidrot(String teksts) {
		// algoritmiski
		for (char temp : teksts.toCharArray()) {
			if (!Character.isLetter(temp)) {
				return false;
			}
		}
		if (!Character.isUpperCase(teksts.charAt(0))) {
			return false;
		}

		return true;

	}

}
