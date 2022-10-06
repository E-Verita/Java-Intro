/*Nostrādāto stundu skaitu ievadam no klaviatūras un pēc aprēķiniem izvadām uz ekrāna saņemamo algu.



Programmu pārbaudam ar trīs ievades parametriem - 35, 40 un 50 nostrādātajām stundām.


All items:    100%
prasīt lietotājam ievadīt nostrādāto stundu skaitu un saglabāt to
veikt pārbaudi, vai ievadītais skaitlis ir atbilstošs prasītajma (drīkst būt tikai pozitīvs skaitlis, maksimums 50)
uzsākt algas apreķinu, izmantojot nosacījumus
ja ir nostrādāts mazāk par 40 stundām (arī tieši 40 stundas), alga ir 4.00 Eur stundā;
pretējā gadījumā alga ir 160.00 eur plus 6.00 Eur par katru papildus nostrādāto stundu.
pārbaudam programmas darbību uz trīs parametriem - 35, 40 un 50
*pievienojam pārbaudi, ka tiek ievadīts skaitlis konsolē*/

package seminars2_if_switch;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Uzdevums5 {

	public static void main(String[] args) {
		aprekinatAlgu();
	}

	public static void aprekinatAlgu() {
		try {
			float stundas = Float.parseFloat(JOptionPane.showInputDialog(null, "Ievadi, lūdzu, nostrādātās stundas"));
			float alga;
			if (stundas < 0 || stundas > 50) {
				JOptionPane.showMessageDialog(null, "Nostrādātās stundas var būt diapazonā 0-50! ", "Kļūda!",
						JOptionPane.ERROR_MESSAGE);
			} else if (stundas > 0 && stundas <= 40) {
				alga = stundas * 4;
				JOptionPane.showMessageDialog(null,
						"Algas aprēķins:\n\nNostrādātās stundas: " + stundas + "\nAlga: " + alga, "Rezultāts",
						JOptionPane.INFORMATION_MESSAGE);

			} else if (stundas > 40 && stundas <= 50) {
				alga = 160 + ((stundas - 40) * 6);
				System.out.println(stundas + alga);
				JOptionPane.showMessageDialog(null,
						"Algas aprēķins:\n\nNostrādātās stundas: " + stundas + "\nAlga: " + alga, "Rezultāts",
						JOptionPane.INFORMATION_MESSAGE);

			}
		} catch (InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Lūdzu, ievadi tikai ciparus!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			aprekinatAlgu();
		}

	}
}
