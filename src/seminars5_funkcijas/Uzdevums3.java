package seminars5_funkcijas;

public class Uzdevums3 {

	public static void main(String[] args) {
		System.out.println(aprekinatZirgspekus(10));
		System.out.println("Audi A6: zirgspēki: " + aprekinatZirgspekus(132) + ", videjais degvielas patēriņš: "
				+ aprekinatDegvielu100km(2698) + ", bremzēšanas ceļš: " + aprekinatBremzesanasCelu(96, false));
		System.out.println("VW Golf: zirgspēki: " + aprekinatZirgspekus(98) + ", videjais degvielas patēriņš: "
				+ aprekinatDegvielu100km(1945) + ", bremzēšanas ceļš: " + aprekinatBremzesanasCelu(100, true));
	}

	public static float aprekinatZirgspekus(float jauda) {
		return jauda * 1.36f;
	}

	public static float aprekinatDegvielu100km(float motTilpums) {
		float m = 6.7f;
		float degviela = (float) Math.sqrt(motTilpums * m / 100);
		return degviela;
	}

	public static float aprekinatBremzesanasCelu(int atrums, boolean vaiSauss) {
		float SAKERES_KOEFICIENTS;
		if (vaiSauss) {
			SAKERES_KOEFICIENTS = 0.75f;
		} else {
			SAKERES_KOEFICIENTS = 0.55f;
		}
		float BRIVAS_KRISANAS_PAATRINAJUMS = 9.81f;
		float bremzesanasCels = (float) (Math.pow(atrums, 2)
				/ (2 * BRIVAS_KRISANAS_PAATRINAJUMS * SAKERES_KOEFICIENTS));

		return bremzesanasCels;
	}

}
