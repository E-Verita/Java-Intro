/*zrakstīt programmu, kas spēj veikt darbības ar naturāliem skaitļiem. Programmā jāievada skaitlis N un jāveic ar to atbilstošās operācijas

Programmas izvads varētu būt sekojošs:

Ievadiet naturalu skaitli: 5
No 1 lidz 5 visu naturalo skaitlu summa ir: 15
No 1 lidz 5 visu para skaitlu summa ir: 6
No 1 lidz 5 visu nepara skaitlu summa ir: 9

    nolasa ievadīto skaitli N un saglabā to
    aprēķina un izvada visu naturālo skaitļu no 1 līdz N summu
    aprēķina un izvada visu pāra skaitļu no 1 līdz N summu (izmantojiet operatoru „%”)
    aprekina un izvada visu nepāra skaitļu no 1 līdz N summu*/

package seminars3_cikli;

import javax.swing.JOptionPane;

public class Uzdevums4 {
	public static void main (String [] args) {
		int skaitlis = Integer.parseInt(JOptionPane.showInputDialog(null, "Ievadi naturālu skaitli!"));
		int paraSkaitluSumma = 0;
		int neparaSKaitluSumma = 0;
		
		for (int i = 1; i <=skaitlis; i ++) {
			if (i%2 == 0) {
				paraSkaitluSumma += i;
			} else {
				neparaSKaitluSumma += i;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Skaitļa " + skaitlis + "\npāra skaitļu summa: " + paraSkaitluSumma + "\nnepāra skaitļu summa: " + neparaSKaitluSumma);
	}
}
