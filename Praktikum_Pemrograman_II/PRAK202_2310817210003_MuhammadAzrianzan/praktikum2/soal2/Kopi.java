package praktikum2.soal2;

public class Kopi {
	String namaKopi;
	String ukuran;
	double harga;
	private String pembeliKopi;
	private double pajak;
	
	public void setPembeli(String customer) {
		this.pembeliKopi = customer;
	}
	
	public String getPembeli() {
		return this.pembeliKopi;
	}
	
	public void info() {
		System.out.println("Nama Kopi: " + this.namaKopi);
		System.out.println("Ukuran: " + this.ukuran);
		System.out.println("Harga: " + this.harga);
	}
	
	public double getPajak() {
		this.pajak = 0.11 * this.harga;
		return this.pajak;
	}
}
