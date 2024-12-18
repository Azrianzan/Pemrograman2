package soal1;

public class Paint {
	private Double coverage;
	
	public Paint(Double c) {
		this.coverage = c;
	}
	
	public Double amount(Shape s) {
		System.out.println("Computing amount for " + s);
		double area = s.area();
		return area / coverage;
	}
}
