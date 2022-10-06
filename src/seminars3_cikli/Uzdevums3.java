/*Uzrakstīt programmu, kura izmantojot for ciklu rēķinās skaitļa pakāpi. Skaitli un skaitļa pakāpi prasīt ievadīt no klaviatūras.

Programmai uz ekrāna jāizvada sekojoša informācija:

Ievadiet skaitli: 67
Ievadiet pakapi kada skaitlis tiks kapinats: 4
Skaitlis 67 pakape 4 ir: 20151121

    prasīt lietojam ievadīt skaitli un to saglabāt
    prasīt lietojam ievadīt pakāpi un to saglabāt
    izveidot for ciklu, kas veic konkrētā skaitļa reizināšanu tik reizes, cik ir norādīta pakāpe
    pārbaudīt programmas darbību ar piemērā sniegtajiem skaitļiem*/

package seminars3_cikli;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Uzdevums3 {

	public static void main(String[] args) {
		aprekinatPakapi();
	}

	public static void aprekinatPakapi() {
		try {
			int skaitlis = Integer.parseInt(JOptionPane.showInputDialog("Ievadi skaitli!"));

			int pakape = Integer.parseInt(JOptionPane.showInputDialog("Ievadi pakāpi!"));
			int rezultats = 1;
			for (int i = 1; i <= pakape; i++) {
				rezultats *= skaitlis;
			}
			System.out.println(rezultats);
			JOptionPane.showConfirmDialog(null, "Skaitlis " + skaitlis + " pakāpē " + pakape + " = " + rezultats);

		} catch (InputMismatchException error) {
			JOptionPane.showConfirmDialog(null, "Lūdzu ievadi skaitli!");
			aprekinatPakapi();

		}

	}
}
