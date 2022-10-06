package papilduzdevumi2;

import java.util.Random;

public class Uzdevums3 {

	public static void main(String[] args) {
		String[] masti = { "kreicis", "kāravs", "pīķis", "ercens" };
		String[] vertibas = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "kalps", "dāma", "kungs",
				"dūze" };
		int izmers = masti.length * vertibas.length;

		izveidotKarti(vertibas, masti);
		izveidotKartiUnIznemt(vertibas, masti, izmers);
		izveidotKartiUnIznemt(vertibas, masti, izmers);
		izveidotKartiUnIznemt(vertibas, masti, izmers);
		izveidotKartiUnIznemt(vertibas, masti, izmers);
		izveidotKartiUnIznemt(vertibas, masti, izmers);

	}

	private static void izveidotKarti(String[] vertibas, String[] masti) {
		String[][] kartis = new String[vertibas.length][masti.length];
		for (int i = 0; i < vertibas.length; i++) {
			for (int j = 0; j < masti.length; j++) {
				kartis[i][j] = vertibas[i] + " " + masti[j];
			}
		}
		Random random = new Random();
		int randomMastaIndex = random.nextInt(masti.length);
		int randomVērtībasIndex = random.nextInt(vertibas.length);
		System.out.println("Izveidota kārts: " + kartis[randomVērtībasIndex][randomMastaIndex]);

	}

	private static void izveidotKartiUnIznemt(String[] vertibas, String[] masti, int izmers) {
		String[][] kartis = new String[vertibas.length][masti.length];
		for (int i = 0; i < vertibas.length; i++) {
			for (int j = 0; j < masti.length; j++) {
				kartis[i][j] = vertibas[i] + " " + masti[j];
			}
		}
		Random random = new Random();

		System.out.println("izmers: " + izmers);
		int randomMastaIndex = random.nextInt(masti.length);
		int randomVērtībasIndex = random.nextInt(vertibas.length);
		String karts = kartis[randomVērtībasIndex][randomMastaIndex];
		if (karts.equals("0")) {
		} else {
			System.out.println("Izveidota kārts: " + kartis[randomVērtībasIndex][randomMastaIndex]);
			izmers--;
			karts = "0";

		}
	}
}
