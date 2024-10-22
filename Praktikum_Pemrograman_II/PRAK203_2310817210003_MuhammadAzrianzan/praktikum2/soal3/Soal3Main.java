package praktikum2.soal3;

public class Soal3Main {
	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
		//Di baris ini terjadi error karena tidak ada titik koma (;)
		//p1.nama = "Roi"
		p1.nama= "Roi";
		p1.asal = "Kingdom of Orvel";
		p1.setJabatan("Assasin");
		
		System.out.println("Nama Pegawai: " + p1.getNama());
		System.out.println("Asal: " + p1.getAsal());
		System.out.println("Jabatan: " + p1.jabatan);
		//Di baris ini tidak ada error, namun agar outputnya sesuai dengan yang
		//	diinginkan, maka ditambahkan String "Tahun" diakhir.
		//System.out.println("Umur: " + p1.umur);
		System.out.println("Umur: " + p1.umur + " Tahun");
	}
}
