package soal1;

public class HewanPeliharaan {
	private String nama;
	private String ras;
	
	public HewanPeliharaan(String r, String n) {
		this.nama = n;
		this.ras = r;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public String getRas() {
		return this.ras;
	}
	
	public void display() {
		System.out.println("Detail Hewan Peliharaan:");
		System.out.println("Nama hewan peliharaanku adalah : " + this.getNama());
		System.out.println("Dengan ras : " + this.getRas());
	}
}
