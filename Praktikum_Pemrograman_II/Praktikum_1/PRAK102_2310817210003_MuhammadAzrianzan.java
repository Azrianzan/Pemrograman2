import java.util.Scanner;

public class PRAK102_2310817210003_MuhammadAzrianzan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Angka: ");
		int angka = input.nextInt();
		int angka2 = angka + 10;
		
		while (angka <= angka2) {
			int angka3 = angka;
			if (angka3 % 5 == 0) {
				angka3 = angka3 / 5 - 1;
				System.out.print(angka3);
			} else {
				System.out.print(angka);
			}
			if (angka < angka2) {
				System.out.print(",");
			}
			angka = angka + 1;
		}
		input.close();
	}
}
