package soal2;

import java.util.Scanner;
import java.util.ArrayList;

public class Soal2Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
		System.out.println("1 = Kucing");
		System.out.println("2 = Anjing");
		System.out.print("Masukkan pilihan: ");
		int pilihan = scanner.nextInt();
		scanner.nextLine();
		
		if (pilihan == 1) {
			System.out.print("Nama Hewan Peliharaan: ");
			String nama = scanner.nextLine();
			System.out.print("Ras: ");
			String ras = scanner.nextLine();
			System.out.print("Warna Bulu: ");
			String warnaBulu = scanner.nextLine();
			
			Kucing kcng1 = new Kucing(ras, nama, warnaBulu);
			
			kcng1.displayDetailKucing();
		} else if (pilihan == 2) {
			System.out.print("Nama Hewan Peliharaan: ");
			String nama = scanner.nextLine();
			System.out.print("Ras: ");
			String ras = scanner.nextLine();
			System.out.print("Warna Bulu: ");
			String warnaBulu = scanner.nextLine();
			System.out.print("Kemampuan : ");
			String inputKemampuan = scanner.nextLine();
			
			String[] kemampuanAnjing = inputKemampuan.split(",");
			ArrayList<String> listKemampuan = new ArrayList<>();
			for (String kemampuan : kemampuanAnjing) {
				listKemampuan.add(kemampuan.trim());
			}
			
			Anjing ajg1 = new Anjing(ras, nama, warnaBulu, listKemampuan);
			
			ajg1.displayDetailAnjing();
		} else {
			System.out.println("Masukkan Pilihan Dengan Benar");
		}
	}
}
