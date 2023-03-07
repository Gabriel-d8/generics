package entities;

public class Rectangle implements Shape {
	
	private double width;
	private double height;
	
	public Rectangle(double wight, double height) {
		this.width = wight;
		this.height = height;
	}

	public double getWight() {
		return width;
	}

	public void setWight(double wight) {
		this.width = wight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

}