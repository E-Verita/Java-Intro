/*/*
deklarējam 2 mainīgos: vecums1 un vecums2;
Prasām lietotājam no klaviatūras ievadīt 2 veselus skaitļus un saglabājam to vērtības iekš vecums1 un vecums2;
Ar if pārbaudām, kurš no ievadītājiem vecumiem ir lielāks:

    ja vecums1 > vecums2, izvadam uz ekrāna atbilstošu paziņojumu
    ja vecums1< vecums2, izvadam uz ekrāna atbilstošu paziņojumu
    ja vecumi ir vienādi, izvadam uz ekrāna atbilstošu paziņojumu */

// parent / message / title / type

package seminars2_if_switch;

import javax.swing.JOptionPane;

public class Uzdevums1 {

	public static void main(String[] args) {
		vecumaIevade();
	}

	public static void vecumaIevade() {
		int vecums1 = 0;
		int vecums2 = 0;

		try {
			vecums1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ievadi vecumu Nr.1"));
			vecums2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ievadi vecumu Nr.2"));

			String vecums1pretvecums2 = null;
			if (vecums1 > vecums2) {
				vecums1pretvecums2 = "ir lielāks par";
			} else if (vecums1 < vecums2) {
				vecums1pretvecums2 = "ir mazāks par";
			} else if (vecums1 == vecums2)
				vecums1pretvecums2 = "ir vienāds ar";

			JOptionPane.showMessageDialog(null,
					"Vecums Nr.1 (" + vecums1 + ")\n" + vecums1pretvecums2 + "\n Vecumu Nr.2 (" + vecums2 + ")",
					"Rezultāts", JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lūdzu, ievadi tikai veselus skaitļus bez komata!", "Kļūda!",
					JOptionPane.ERROR_MESSAGE);
			vecumaIevade();
		}

	}
}