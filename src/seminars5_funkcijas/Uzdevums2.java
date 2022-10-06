package seminars5_funkcijas;

public class Uzdevums2 {
	public static void main(String[] args) {
		int[] mas = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(arraySum(mas));
	}

	public static int arraySum(int[] mas) {
		int sum = 0;
		for (int temp : mas) {
			sum += temp;
		}
		return sum;
	}

}
