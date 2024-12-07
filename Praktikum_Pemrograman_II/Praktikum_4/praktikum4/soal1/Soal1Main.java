package soal1;

import java.util.Scanner;

public class Soal1Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("Nama Hewan Peliharaan: ");
		String nama = scanner.nextLine();
		System.out.print("Ras: ");
		String ras = scanner.nextLine();
		
		HewanPeliharaan hwn1 = new HewanPeliharaan(ras, nama);
		
		hwn1.dislay();
	}
}
