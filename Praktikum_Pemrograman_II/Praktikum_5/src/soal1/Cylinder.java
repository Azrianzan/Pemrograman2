package soal1;

public class Cylinder extends Shape{
	private Double radius;
	private Double height;
	
	public Cylinder(Double r, Double h) {
		super("Cylinder");
		this.radius = r;
		this.height = h;
	}
	
	public Double area() {
		return Math.PI * (radius * radius) * height;
	}
	
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}
