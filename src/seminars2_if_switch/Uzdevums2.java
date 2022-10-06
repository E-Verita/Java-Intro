package seminars2_if_switch;
/*
 prasa lietotājam ievadīt savu telefona numuru kā astoņciparu skaitli, piemēram, Piemēram, 26789012.
nolasa ievadīto telefona numuru (ieteikums: nolasīt skaitli kā String vērtību)
uz ekrāna izvadiet šī telefona numura visus ciparus atdalītus ar tukšumiem. Piemēram, 2 6 7 8 9 0 1 2
uz ekrāna izvadiet ievadītā telefona numuru, kur cipari ir apgrieztā secībā. Piemēram, 26789012 būs 21098762
papildiniet programmu ar pārbaudi, vai lietotājs nav ievadījis pārāk lielu skaitli, vai pārāk mazu skaitli. Šim gadījumam ieteiktu nolasīto telefona numuru pārvērst uz int un tad veikt pārbaudi
papildiniet programmu ar pārbaudi, vai telefona numurs sākas ar 2
 */

import javax.swing.JOptionPane;

public class Uzdevums2 {
	public static void main(String[] args) {
		numuraIevade();

	}

	public static void numuraIevade() {
		String numurs = null;
		numurs = JOptionPane.showInputDialog(null, "Ievadi, lūdzu, savu telefona numuru!");
		if (numurs.matches("[2][0-9]{7}")) {
			StringBuilder sb = new StringBuilder(numurs);
			JOptionPane
					.showMessageDialog(null,
							"Ievadītais numurs: " + numurs + "\n Numurs ar atstarpēm: " + numurs.replace("", " ").trim()
									+ "\n Apgriezts numurs: " + sb.reverse(),
							"Rezultāts", JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "Lūdzu, ievadi 8-ciparu telefona numuru, kas sākas ar 2!", "Kļūda!",
					JOptionPane.ERROR_MESSAGE);
			numuraIevade();
		}
	}
}
