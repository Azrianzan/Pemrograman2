package soal2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Negara> listNegara = new LinkedList<>();
		HashMap<Integer, String> bulanMap = new HashMap<>();
		
		bulanMap.put(1, "Januari");
		bulanMap.put(2, "Februari");
		bulanMap.put(3, "Maret");
		bulanMap.put(4, "April");
		bulanMap.put(5, "Mei");
		bulanMap.put(6, "Juni");
		bulanMap.put(7, "Juli");
		bulanMap.put(8, "Agustus");
		bulanMap.put(9, "September");
		bulanMap.put(10, "Oktober");
		bulanMap.put(11, "November");
		bulanMap.put(12, "Desember");
		
		System.out.print("");
		int jumlahNegara = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < jumlahNegara; i++) {
			System.out.print("");
			String nama = scanner.nextLine();
			System.out.print("");
			String jenisKepemimpinan = scanner.nextLine();
			System.out.print("");
			String namaPemimpin = scanner.nextLine();
			
			if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
				listNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin));
			} else {
				System.out.print("");
				int tanggal = scanner.nextInt();
				System.out.print("");
				int bulan = scanner.nextInt();
				System.out.print("");
				int tahun = scanner.nextInt();
				scanner.nextLine();
				listNegara.add(new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
			}
		}
		
		System.out.println();
		for (Negara negara : listNegara) {
			if (negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
				System.out.println("Negara " + negara.getNama() + " mempunyai Raja bernama " + negara.getNamaPemimpin());
				System.out.println();
			} else {
				System.out.println("Negara " + negara.getNama() + " mempunyai " + negara.getJenisKepemimpinan() + " bernama " + negara.getNamaPemimpin());
				int bulanMerdeka = negara.getBulanKemerdekaan();
				String namaBulan = bulanMap.get(bulanMerdeka);
				System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + namaBulan + " " + negara.getTahunKemerdekaan());
				System.out.println("");
			}
		}
		scanner.close();
	}
}
