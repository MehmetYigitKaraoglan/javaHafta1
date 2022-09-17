package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// bug
		int number = 1;
		int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		if (number < 1) {
			System.out.println("Geçersiz sayı girdiniz.");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}
	}

}
