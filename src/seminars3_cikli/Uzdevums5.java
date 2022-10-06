/*Uzrakstīt programmu, kas veic reizinājumu starp visiem skaitļiem, kas atrodas starp diviem ievadītiem skaitļiem (ievadītos skaitļus ieskaitot). Piemēram, ievadot skaitļus 3 un 8, programmai jāveic reizinājums: 3 * 4 * 5 * 6 * 7 * 8 

Programmai uz ekrāna jāizvada sekojoša informācija:
Ievadiet pirmo skaitli: 3
Ievadiet pedejo skaitli: 8
Visu skaitlu no 3 lidz 8 reizinajums ir 20160
    nolasa divus skaitļus un saglabā tos
    nosaka, kurš ir mazākais skaitlis, no kura sāksies reizināšana
    for ciklā aprēķina reizinājumu un to izvada*/



package seminars3_cikli;

import javax.swing.JOptionPane;

public class Uzdevums5 {

	public static void main(String[] args) {
		int pirmaisSkaitlis = Integer.parseInt(JOptionPane.showInputDialog("Ievadi pirmo skaitli!"));
		int otraisSkaitlis = Integer.parseInt(JOptionPane.showInputDialog(null, "Ievadi otro skaitli!"));
		int minSkaitlis = Math.min(pirmaisSkaitlis, otraisSkaitlis);
		int maxSkaitlis = Math.max(pirmaisSkaitlis, otraisSkaitlis);
		int reizinajums = 1;

		for(int i = minSkaitlis; i <=maxSkaitlis; i++) {
			reizinajums *= i;
		}
		
		JOptionPane.showMessageDialog(null,
				"Skaitļu reizinājums: " + reizinajums, "Rezultāts", JOptionPane.INFORMATION_MESSAGE);		
	}

}
