
public class Buah {
	private String name;
	private double berat;
	private double harga;
	private double jumlahBeli;
	private double totalHarga;
	private double totalDiskon;
	private double totalHargaSetelahDiskon;
	
	private double kgPotonganHarga;
	private double pembulatanJumlahBeli;
	
	public void setBuah(String n, double b, double h) {
		this.name = n;
		this.berat = b;
		this.harga = h;
	}
	
	public void setPembelian(double jB) {
		this.jumlahBeli = jB;
		this.totalHarga = (this.jumlahBeli / this.berat) * this.harga;
	}
	
	public void setDiskon() {
		this.kgPotonganHarga = this.jumlahBeli / 4;
		this.pembulatanJumlahBeli = (int)this.kgPotonganHarga * 4;
		this.totalDiskon = this.pembulatanJumlahBeli * 0.02 * this.harga;
		this.totalHargaSetelahDiskon = this.totalHarga - this.totalDiskon; 
	}
	
	public void tampilkanInfo() {
		System.out.println("Nama Buah: " + name);
		System.out.println("Berat: " + berat);
		System.out.println("Harga: " + harga);
		System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
		System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", totalHarga);
		System.out.printf("Total Diskon:  Rp%.2f\n", totalDiskon);
		System.out.printf("Nama Buah:  Rp%.2f\n", totalHargaSetelahDiskon);
		System.out.println();
	}
}
