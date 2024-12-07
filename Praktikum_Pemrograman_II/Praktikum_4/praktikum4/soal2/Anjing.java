package soal2;

import soal1.HewanPeliharaan;
import java.util.ArrayList;

public class Anjing extends HewanPeliharaan{
	private String warnaBulu;
	private ArrayList<String> listKemampuan = new ArrayList<String>();

	public Anjing(String r, String n, String w, ArrayList<String> k) {
		super(r, n);
		this.warnaBulu = w;
		this.listKemampuan = k;
	}
	
	public String getWarnaBulu() {
		return this.warnaBulu;
	}
	
	public void displayDetailAnjing() {
		super.display();
		System.out.println("Memiliki warna bulu : " + this.warnaBulu);
		System.out.print("Memiiki kemampuan : ");
		for (String k : listKemampuan) {
			System.out.print(k + "  ");
		}
	}
}
