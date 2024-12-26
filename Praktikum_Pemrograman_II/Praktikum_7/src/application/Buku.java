package application;

public class Buku {
	private int bukuId;
    private String judul;
    private String penulis;
    private int harga;
    private int stok;

    public Buku (int bukuId, String judul, String penulis, int harga, int stok) {
    	this.bukuId = bukuId;
    	this.judul = judul;
    	this.penulis = penulis;
    	this.harga = harga;
    	this.stok = stok;
    }
    
    public Buku (String judul, String penulis, int harga, int stok) {
    	this.judul = judul;
    	this.penulis = penulis;
    	this.harga = harga;
    	this.stok = stok;
    }
    
    public int getBukuId() {
        return bukuId;
    }

    public void setBukuId(int bukuId) {
        this.bukuId = bukuId;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
