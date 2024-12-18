package soal1;

public class Sphere extends Shape{
	private Double radius;
	
	public Sphere(Double r) {
		super("Sphere");
		this.radius = r;
	}
	
	public Double area() {
		return 4 *  Math.PI * (radius * radius);
	}
	
	public String toString() {
		return super.toString() + " of radius " + radius;
	}
}
