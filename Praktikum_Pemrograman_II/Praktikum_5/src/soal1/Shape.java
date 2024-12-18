package soal1;

abstract class Shape {
	protected String shapeName;
	
	public Shape(String sN) {
		this.shapeName = sN;
	}
	
	protected abstract Double area();
	
	public String toString() {
		return shapeName ;
	}
}
