package pertemuan2;

public class FunctionAndMethod {
	public static void main(String[] args) {
		sayHi("Azie");

		int hasil = tambah(1, 3);
		System.out.println(hasil);
	}

	// method
	public static void sayHi(String nama) {
		System.out.println("Hi " + nama);

	}

	// function
	public static int tambah(int a, int b) {
		return a + b;
	}

	public static double doubleFunction() {
		return 1.2;
	}
}
