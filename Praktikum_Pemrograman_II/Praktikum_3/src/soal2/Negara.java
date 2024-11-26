package soal2;

public class Negara {
	private String nama;
	private String jenisKepemimpinan;
	private String namaPemimpin;
	private int tanggalKemerdekaan;
	private int bulanKemerdekaan;
	private int tahunKemerdekaan;
	
	public Negara(String n, String jK, String nP, int tanggal, int bulan, int tahun) {
		this.nama = n;
		String s1 = jK.substring(0, 1).toUpperCase();
		jK = s1 + jK.substring(1);
		this.jenisKepemimpinan = jK;
		this.namaPemimpin = nP;
		this.tanggalKemerdekaan = tanggal;
		this.bulanKemerdekaan = bulan;
		this.tahunKemerdekaan = tahun;
	}
	
	public Negara(String n, String jK, String nP) {
		this.nama = n;
		this.jenisKepemimpinan = jK;
		this.namaPemimpin = nP;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public String getJenisKepemimpinan() {
		return this.jenisKepemimpinan;
	}
	
	public String getNamaPemimpin() {
		return this.namaPemimpin;
	}
	
	public int getTanggalKemerdekaan() {
		return this.tanggalKemerdekaan;
	}
	
	public int getBulanKemerdekaan() {
		return this.bulanKemerdekaan;
	}
	
	public int getTahunKemerdekaan() {
		return this.tahunKemerdekaan;
	}
}
