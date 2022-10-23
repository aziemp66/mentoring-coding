package pertemuan2;

import java.util.Scanner;

public class Pengkodisian {
	public static void main(String[] args) {
		// create a simple bank application
		// create a variable to store the balance
		Scanner input = new Scanner(System.in);

		// create a variable to store the balance
		System.out.println("Masukkan saldo anda: ");
		double balance = input.nextDouble();

		System.out.println("Pilih Menu: ");
		System.out.println("1. Cek Saldo");
		System.out.println("2. Tarik Tunai");
		System.out.println("3. Setor Tunai");
		int menu = input.nextInt();
		input.close();

		switch (menu) {
			case 1:
				cekSaldo(balance);
				break;
			case 2:
				tarikTunai(balance);
				break;
			case 3:
				setorTunai(balance);
				break;
			default:
				System.err.println("Input Anda Salah");
				break;
		}
	}

	public static void tarikTunai(double saldo) {
		System.out.println("Silahkan Sebutkan Jumlah Yang Anda Ingin tarik :");
		Scanner input = new Scanner(System.in);

		double tarikan = input.nextDouble();

		if (saldo < tarikan) {
			System.out.println("Saldo yang anda tarik lebih besar dari sisa saldo anda");
		} else {
			System.out.println("Terimakasih, Saldo anda sudah ditarik");
			System.out.println("Sisa Saldo anda adalah : " + (saldo - tarikan));

		}
		input.close();
	}

	public static void setorTunai(double saldo) {
		System.out.println("Silahkan Sebutkan Saldo yang ingin anda setor");
		Scanner input = new Scanner(System.in);
		double saldoDisetor = input.nextDouble();
		if (saldoDisetor > 5000000) {
			System.out.println("Maaf, Maksimal Satu Setor Saldo adalah Rp5.000.000");
		} else if (saldoDisetor > 4000000) {
			System.out.println("Selamat, Anda Menyetor Saldo Lebih Dari Rp4.000.000");
			System.out.println("Anda mendapat bonus Rp.100.000");
			System.out.println("Total Saldo Anda :" + (saldo + saldoDisetor + 100000));
		} else {
			System.out.println("Penyetoran Berhasil");
			System.out.println("Saldo anda adalah :" + (saldo + saldoDisetor));
		}
		input.close();
	}

	public static void cekSaldo(double saldo) {
		System.out.println("Saldo Anda : " + saldo);
	}
}
