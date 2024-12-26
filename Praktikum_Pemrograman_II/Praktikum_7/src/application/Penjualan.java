package application;

public class Penjualan {
	 private int penjualanId;
	 private int jumlah;
	 private int totalHarga;
	 private String tanggal;
	 private int pelangganId;
	 private int bukuId;
	 
	 public Penjualan (int penjualanId, int jumlah, int totalHarga, String tanggal, int pelanggan, int buku) {
		 this.penjualanId = penjualanId;
	     this.jumlah = jumlah;
	     this.totalHarga = totalHarga;
	     this.tanggal = tanggal;
	     this.pelangganId = pelanggan;
	     this.bukuId = buku;
	 }
	 
	 public Penjualan (int jumlah, int totalHarga, String tanggal, int pelanggan, int buku) {
	     this.jumlah = jumlah;
	     this.totalHarga = totalHarga;
	     this.tanggal = tanggal;
	     this.pelangganId = pelanggan;
	     this.bukuId = buku;
	 }
	 
	 public int getPenjualanId() {
		 return penjualanId;
	 }

	 public void setPenjualanId(int penjualanId) {
		 this.penjualanId = penjualanId;
	 }

	 public int getJumlah() {
		 return jumlah;
	 }

	 public void setJumlah(int jumlah) {
		 this.jumlah = jumlah;
	 }

	 public double getTotalHarga() {
		 return totalHarga;
	 }

	 public void setTotalHarga(int totalHarga) {
		 this.totalHarga = totalHarga;
	 }

	 public String getTanggal() {
		 return tanggal;
	 }

	 public void setTanggal(String tanggal) {
		 this.tanggal = tanggal;
	 }

	 public int getPelangganId() {
		 return pelangganId;
	 }

	 public void setPelangganId(int pelanggan) {
		 this.pelangganId = pelanggan;
	 }

	 public int getBukuId() {
		 return bukuId;
	 }

	 public void setBukuId(int buku) {
		 this.bukuId = buku;
	 }
}
