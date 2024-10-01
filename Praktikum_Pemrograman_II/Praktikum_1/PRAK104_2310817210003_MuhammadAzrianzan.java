import java.util.Scanner;

public class PRAK104_2310817210003_MuhammadAzrianzan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int skorAbu = 0;
		int skorBagas = 0;
		
		System.out.print("Tangan Abu: ");
		String tanganAbu = input.nextLine();
		String[] suitAbu = tanganAbu.split(" ");
		String abu1 = suitAbu[0];
		String abu2 = suitAbu[1];
		String abu3 = suitAbu[2];
		
		System.out.print("Tangan Bagas: ");
		String tanganBagas = input.nextLine();
		String[] suitBagas = tanganBagas.split(" ");
		String bagas1 = suitBagas[0];
		String bagas2 = suitBagas[1];
		String bagas3 = suitBagas[2];
		
		if (abu1.equals("G")) {
			if (bagas1.equals("G")) {
				skorAbu += 0;
				skorBagas += 0;
			} else if (bagas1.equals("B")) {
				skorBagas += 1;
			} else if (bagas1.equals("K")) {
				skorAbu += 1;
			}
		} else if (abu1.equals("B")) {
			if (bagas1.equals("G")) {
				skorAbu += 1;
			} else if (bagas1.equals("B")) {
				skorAbu += 0;
				skorBagas += 0;
			} else if (bagas1.equals("K")) {
				skorBagas += 1;
			}
		} else if (abu1.equals("K")) {
			if (bagas1.equals("G")) {
				skorBagas += 1;
			} else if (bagas1.equals("B")) {
				skorAbu += 1;
			} else if (bagas1.equals("K")) {
				skorAbu += 0;
				skorBagas += 0;
			}
		}
		if (abu2.equals("G")) {
			if (bagas2.equals("G")) {
				skorAbu += 0;
				skorBagas += 0;
			} else if (bagas2.equals("B")) {
				skorBagas += 1;
			} else if (bagas2.equals("K")) {
				skorAbu += 1;
			}
		} else if (abu2.equals("B")) {
			if (bagas2.equals("G")) {
				skorAbu += 1;
			} else if (bagas2.equals("B")) {
				skorAbu += 0;
				skorBagas += 0;
			} else if (bagas2.equals("K")) {
				skorBagas += 1;
			}
		} else if (abu2.equals("K")) {
			if (bagas2.equals("G")) {
				skorBagas += 1;
			} else if (bagas2.equals("B")) {
				skorAbu += 1;
			} else if (bagas2.equals("K")) {
				skorAbu += 0;
				skorBagas += 0;
			}
		}
		if (abu3.equals("G")) {
			if (bagas3.equals("G")) {
				skorAbu += 0;
				skorBagas += 0;
			} else if (bagas3.equals("B")) {
				skorBagas += 1;
			} else if (bagas3.equals("K")) {
				skorAbu += 1;
			}
		} else if (abu3.equals("B")) {
			if (bagas3.equals("G")) {
				skorAbu += 1;
			} else if (bagas3.equals("B")) {
				skorAbu += 0;
				skorBagas += 0;
			} else if (bagas3.equals("K")) {
				skorBagas += 1;
			}
		} else if (abu3.equals("K")) {
			if (bagas3.equals("G")) {
				skorBagas += 1;
			} else if (bagas3.equals("B")) {
				skorAbu += 1;
			} else if (bagas1.equals("K")) {
				skorAbu += 0;
				skorBagas += 0;
			}
		}
		
		if (skorAbu > skorBagas) {
			System.out.println("Abu");
		} else if (skorAbu < skorBagas) {
			System.out.println("Bagas");
		} else {
			System.out.println("Seri");
		}
		
		input.close();
	}
}
