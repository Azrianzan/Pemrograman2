
public class Soal1Main {
	public static void main (String[] args) {
		Buah apel = new Buah();
		apel.setBuah("Apel", 0.4, 7000);
		apel.setPembelian(40);
		apel.setDiskon();
		apel.tampilkanInfo();
		
		Buah mangga = new Buah();
		mangga.setBuah("mangga", 0.2, 3500);
		mangga.setPembelian(15);
		mangga.setDiskon();
		mangga.tampilkanInfo();
		
		Buah alpukat = new Buah();
		alpukat.setBuah("alpukat", 0.25, 10000);
		alpukat.setPembelian(12);
		alpukat.setDiskon();
		alpukat.tampilkanInfo();
	}
}
