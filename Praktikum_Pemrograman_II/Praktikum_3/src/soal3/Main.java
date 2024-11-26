package soal3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
	
	public static void main(String [] args) {
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. Tambah Mahasiswa");
			System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
			System.out.println("3. Cari Mahasiswa berdasarkan NIM");
			System.out.println("4. Tampilkan Daftar Mahasiswa");
			System.out.println("0. Keluar");
			System.out.print("Pilihan: ");
			int pilihan = scanner.nextInt();
			scanner.nextLine();
			
			switch (pilihan) {
				case 1 -> tambahMahasiswa();
				case 2 -> hapusMahasiswaByNim();
				case 3 -> cariMahasiswaByNim();
				case 4 -> tampilkanDaftarMahasiswa();
				case 0 -> {
					System.out.println("Terima Kasih!");
					return;
				}
				default -> System.out.println("Pilihan tidak valid");
			}
		}
	}
	
	private static void tambahMahasiswa(){
		System.out.print("Masukkan Nama Mahasiswa: ");
		String nama = scanner.nextLine();
		System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
		String nim = scanner.nextLine();
		Mahasiswa mhs = new Mahasiswa(nama, nim);
		listMahasiswa.add(mhs);
		System.out.println("Mahasiswa " + mhs.getNama() + " ditambahkan");
	}
	
	private static void hapusMahasiswaByNim() {
		System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
		String nim = scanner.nextLine();
		for (Mahasiswa mhs : listMahasiswa) {
			if (mhs.getNim().equalsIgnoreCase(nim)) {
				listMahasiswa.remove(mhs);
				System.out.println("Mahasiswa dengan NIM " + mhs.getNim() + " dihapus");
			}
		}
		System.out.println("Mahasiswa tidak ditemukan");
	}
	
	private static void cariMahasiswaByNim() {
		System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
		String nim = scanner.nextLine();
		for (Mahasiswa mhs : listMahasiswa) {
			if (mhs.getNim().equalsIgnoreCase(nim)) {
				System.out.println("Mahasiswa Ditemukan!");
				System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
			}
		}
	}
	
	private static void tampilkanDaftarMahasiswa() {
		if (listMahasiswa.isEmpty()) {
			System.out.println("Daftar Mahasiswa Kosong");
		} else {
			for (Mahasiswa mhs : listMahasiswa) {
				System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
			}
		}
	}
}
