/*Uzrakstīt programmu, kura aprēķina riņķa līnijas laukumu vai garumu, izmantojot if un else.
Ievērojiet, ka programmai ir jāveic tikai viens no aprēķiniem (tas, kuru lietotājs izvēlējies)!
deklarēt float tipa mainīgo pi = 3.14159265 vai izmantot Math bibliotēkā iekļauto PI konstanti
programma prasa lietotājam ievadīt riņķa līnijas rādiusu – deklarēt float tipa mainīgo, kurā tiek saglabāta rādiusa vērtība;
kad rādiuss ir ievadīts, programma prasa, ko lietotājs vēlas aprēķināt – riņķa līnijas laukumu vai garumu; Šeit var izmantot String virkņu salīdzināšanu ar equals() funkcijas palīdzību.
kad lietotājs ir veicis izvēli, tiek veikti atbilstoši aprēķini un uz ekrāna tiek izvadīts paziņojums par rezultātu.
*/

package seminars2_if_switch;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Uzdevums3 {

	public static void main(String[] args) {
		veiktAprekinus();
	}

	public static void veiktAprekinus() {

		float pi = (float) Math.PI;
		String[] buttons = { "Riņķa laukumu", "Riņķa līnijas garumu" };
		try {
			float radius = Float.parseFloat(JOptionPane.showInputDialog(null, "Ievadi, lūdzu, riņķa līnijas radiusu!"));
			int result = JOptionPane.showOptionDialog(null, "Ko tu vēlies aprēķināt?", "r = " + radius,
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, buttons, radius);
			if (result == JOptionPane.YES_OPTION) {
				float laukums = pi * radius * radius;
				JOptionPane.showMessageDialog(null, "Riņķa laukums ir " + laukums, "r = " + radius,
						JOptionPane.INFORMATION_MESSAGE);
			} else if (result == JOptionPane.NO_OPTION) {
				float garums = 2 * pi * radius;
				JOptionPane.showMessageDialog(null, "Riņķa līnijas garums ir " + garums, "r = " + radius,
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Lūdzu, ievadi skaitli!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			veiktAprekinus();
		}

	}
}
