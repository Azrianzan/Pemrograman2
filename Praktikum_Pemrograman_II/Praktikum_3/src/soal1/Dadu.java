package soal1;
import java.util.Random;

public class Dadu {
	private int nilaiDadu;
	
	public Dadu() {
		acakNilai();
	}
	
	public void acakNilai() {
		Random nilai = new Random();
		this.nilaiDadu = nilai.nextInt(6) + 1;
	}
	
	public int getNilaiDadu() {
		return this.nilaiDadu;
	}
}
