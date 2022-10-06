package seminars4_masivi;

public class Temp {
	public static void main(String[] args) {
		float[] eks1 = { 23.2f, 31.5f, 16.9f, 27.5f };
		float[] eks2 = { 34.8f, 45.2f, 27.9f, 36.8f };
		float[] eks3 = { 19.4f, 16.8f, 10.2f, 20.8f };

		float[][] dimens = { eks1, eks2, eks3 };
		for (int i = 0; i < dimens.length; ++i) {
			int vid = 0;
			for (int j = 0; j < dimens[i].length; ++j) {
				System.out.print(dimens[i][j] + " ");
				vid += dimens[i][j];
			}
			System.out.println();
			System.out.println("Eksperimenta vidējais: " + vid);
		}

	}
}
