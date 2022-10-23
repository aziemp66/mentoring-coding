package pertemuan3;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		// for (int i = 0; i < 10; i++) { // init statement ; kondisi ; post statement
		// System.out.println("Hello World " + i);
		// }

		// boolean isBerenti = false;
		// while (!isBerenti) {
		// System.out.println("Hello World");

		// Scanner input = new Scanner(System.in);
		// System.out.println("Apakah anda ingin berhenti? (y/n)");
		// String jawaban = input.nextLine();
		// if (jawaban.equals("y")) {
		// isBerenti = true;
		// }
		// }

		// int count = 100;
		// do {
		// System.out.println("Hello");
		// } while (count < 10);

		// while (true) {
		// System.out.println("Hello World");
		// Scanner input = new Scanner(System.in);
		// System.out.println("Apakah anda ingin berhenti? (y/n)");
		// String jawaban = input.nextLine();
		// if (jawaban.equals("y")) {
		// break;
		// }
		// }

		// for (int i = 0; i < 10; i++) {
		// if (i % 2 == 0) {
		// continue;
		// }
		// System.out.println("Hello World " + i);
		// }

		// array
		int[] array = { 1, 2, 3, 4, 5 };

		// for (int i = 0; i < array.length; i++) {
		// System.out.println(array[i]);
		// }

		for (int i : array) {
			System.out.println(i);
		}

	}
}
