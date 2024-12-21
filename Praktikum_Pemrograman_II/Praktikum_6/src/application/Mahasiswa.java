package application;

public class Mahasiswa {
	private int id;
	private String nama;
	private String nim;
	
	public Mahasiswa(int id, String  nama, String nim) {
		this.id = id;
		this.nama = nama;
		this.nim = nim;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public int getID() {
		return id;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String getNim() {
		return nim;
	}
}