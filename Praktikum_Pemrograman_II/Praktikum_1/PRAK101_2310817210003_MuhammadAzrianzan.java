import java.util.Scanner;

public class PRAK101_2310817210003_MuhammadAzrianzan {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Lengkap: ");
		String nama = input.nextLine();
		
		System.out.print("Masukkan Tempat Lahir: ");
		String tempatLahir = input.nextLine();
		
		System.out.print("Masukkan Tanggal Lahir: ");
		int tanggalLahir = input.nextInt();
		
		System.out.print("Masukkan Bulan Lahir: ");
		int bulanLahir = input.nextInt();
		String namaBulanLahir = "";
		switch(bulanLahir) {
		case 1:
			namaBulanLahir = "Januari";
			break;
		case 2:
			namaBulanLahir = "Februari";
			break;
		case 3:
			namaBulanLahir = "Maret";
			break;
		case 4:
			namaBulanLahir = "April";
			break;
		case 5:
			namaBulanLahir = "Mei";
			break;
		case 6:
			namaBulanLahir = "Juni";
			break;
		case 7:
			namaBulanLahir = "Juli";
			break;
		case 8:
			namaBulanLahir = "Agustus";
			break;
		case 9:
			namaBulanLahir = "September";
			break;
		case 10:
			namaBulanLahir = "Oktober";
			break;
		case 11:
			namaBulanLahir = "November";
			break;
		case 12:
			namaBulanLahir = "Desember";
			break;
		default:
			System.out.println("Masukkan bulan antara bulan 1 - 12");
		}
		
		System.out.print("Masukkan Tahun Lahir: ");
		int tahunLahir = input.nextInt();
		
		System.out.print("Masukkan Tinggi Badan: ");
		double tinggiBadan = input.nextDouble();
		
		System.out.print("Masukkan Berat Badan: ");
		double beratBadan = input.nextDouble();
		
		System.out.println();
		System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + namaBulanLahir + " " + tahunLahir);
		System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
		
		input.close();
	}
}