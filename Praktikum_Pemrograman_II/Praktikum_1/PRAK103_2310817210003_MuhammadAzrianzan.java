import java.util.Scanner;

public class PRAK103_2310817210003_MuhammadAzrianzan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("");
		int n = input.nextInt();
		int m = input.nextInt();
		
		int perulanganGanjil = 0;
		
		do {
			if (m % 2 == 1) {
				System.out.print(m);
				perulanganGanjil = perulanganGanjil + 1;
				
				if (perulanganGanjil < n) {
					System.out.print(", ");
				}
			}
			m = m + 1;
		} while ( perulanganGanjil < n);
		
		input.close();
	}
}
