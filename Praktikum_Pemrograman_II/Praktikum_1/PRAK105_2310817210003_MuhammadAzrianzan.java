import java.util.Scanner;

public class PRAK105_2310817210003_MuhammadAzrianzan {
	private static final double PHI = 3.14;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan jari-jari: ");
		double r = input.nextDouble();
		double r2 = r * r;
		
		System.out.print("Masukkan tinggi: ");
		double t = input.nextDouble();
		
		double volumeTabung = PHI * r2 *  t;
		
		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f cm m3", r, t, volumeTabung);
		
		input.close();
	}
}
