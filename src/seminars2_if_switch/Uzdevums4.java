/*Uzrakstīt programmu, kura aprēķina riņķa līnijas laukumu vai garumu, izmantojot switch.
Ievērojiet, ka programmai ir jāveic tikai viens no aprēķiniem (tas, kuru lietotājs izvēlējies)!deklarēt float tipa mainīgo pi = 3.14159265 vai izmantot Math bibliotēkā iekļauto PI konstanti
programma prasa lietotājam ievadīt riņķa līnijas rādiusu – deklarēt float tipa mainīgo, kurā tiek saglabāta rādiusa vērtība;
kad rādiuss ir ievadīts, programma prasa, ko lietotājs vēlas aprēķināt – riņķa līnijas laukumu vai garumu; Šeit var izmantot String virkņu salīdzināšanu ar equals() funkcijas palīdzību.
kad lietotājs ir veicis izvēli, tiek veikti atbilstoši aprēķini un uz ekrāna tiek izvadīts paziņojums par rezultātu.*/

package seminars2_if_switch;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Uzdevums4 {
	static float pi = (float) Math.PI;

	public static void main(String[] args) {
		veiktAprekinus();
	}

	public static void veiktAprekinus() {

		try {
			float radius = Float.parseFloat(JOptionPane.showInputDialog(null, "Ievadi, lūdzu, riņķa līnijas radiusu!"));
			veiktIzveli(pi, radius);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lūdzu, ievadi skaitli!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			veiktAprekinus();
		}
	}

	public static void veiktIzveli(float pi, float radius) {
		try {

			int result = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Ko tu vēlies aprēķināt? Ievadi skaitli 1 vai 2! \n 1 - vēlos aprēķināt riņķa laukumu.\n 2 - vēlos aprēķināt riņķa līnijas garumu."));

			switch (result) {
			case 1:
				float laukums = pi * radius * radius;
				JOptionPane.showMessageDialog(null, "Riņķa laukums ir " + laukums, "r = " + radius,
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				float garums = 2 * pi * radius;
				JOptionPane.showMessageDialog(null, "Riņķa līnijas garums ir " + garums, "r = " + radius,
						JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Lūdzu, ievadi skaitli 1 vai 2!", "Kļūda!",
						JOptionPane.ERROR_MESSAGE);
				veiktIzveli(pi, radius);
				break;
			}
		} catch (InputMismatchException e) {
			JOptionPane.showMessageDialog(null, "Lūdzu, ievadi skaitli 1 vai 2!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			veiktIzveli(pi, radius);

		}

	}

}