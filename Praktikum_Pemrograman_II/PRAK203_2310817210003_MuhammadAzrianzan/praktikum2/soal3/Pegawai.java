package praktikum2.soal3;

public class Pegawai {
	public String nama;
	//Di baris ini tidak ada error, tapi tipedata char akan menyebabkan error
	//	di metode getAsal(), karena tipe data yang akan dikembalikan adalah String
	//  dan akan menyebabkan error juga di file Soal3Main.java karena input yang
	//	ingin dimasukkan adalah kata (String)
	//public char asal;
	public String asal;
	public String jabatan;
	//Di baris ini tidak ada error, namun agar output umur sesuai dengan
	//	yang diinginkan (17 tahun), maka setelah deklarasi, nilai variabel
	// 	diisi dengan 17;
	//public int umur;
	public int umur = 17;
	
	public String getNama() {
		return nama;
	}
	
	public String getAsal() {
		return asal;
	}
	
	//Di baris ini terjadi error karena tidak ada inisialisasi variabel j baik
	//	secara global ataupun secara lokal sebagai parameter, dan akan mengakibatkan
	//	error juga di file Soal3Main.java saat pemanggilan metode setJabatan() dengan
	//	parameter String yaitu "Assasin
	//public void setJabatan() {
	public void setJabatan(String j) {
		this.jabatan = j;
	}
}
