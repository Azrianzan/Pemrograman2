package soal1;

public class Rectangle extends Shape{
	private Double length;
	private Double width;
	
	public Rectangle(Double l, Double w) {
		super("Rectangle");
		this.length = l;
		this.width = w;
	}
	
	public Double area() {
		return length * width;
	}
	
	public String toString() {
		return super.toString() + " of length " + length + " and width " + width;
	}
}
