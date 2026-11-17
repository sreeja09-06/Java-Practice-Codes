class EvenAndReverse {
	public static void main(String[] args) {
		for (int number = 1; number <= 100; number++) {
			System.out.print(number + " ");
		}
		System.out.println();

		for (int number = 2; number <= 100; number += 2) {
			System.out.print(number + " ");
		}
		System.out.println();

		for (int number = 100; number >= 1; number--) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
