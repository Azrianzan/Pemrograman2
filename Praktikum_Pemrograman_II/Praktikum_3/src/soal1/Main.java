package soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Dadu> listDadu = new LinkedList<>();
		int totalNilaiDadu = 0;
		
		System.out.print("");
		int jumlahLemparanDadu = scanner.nextInt();
		
		for (int i = 0; i < jumlahLemparanDadu; i++) {
			listDadu.add(new Dadu());
			int nilai = listDadu.get(i).getNilaiDadu();
			System.out.println("Dadu ke-" + (i+1) + " bernilai " + nilai);
			totalNilaiDadu += nilai;
		}
		
		System.out.println("Total nilai dadu keseluruhan " + totalNilaiDadu);
		scanner.close();
	}
}
