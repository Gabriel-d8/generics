package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		Circle circle1 = new Circle(2.0);
		Circle circle2 = new Circle(3.0);
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(circle1);
		myCircles.add(circle2);
		
		System.out.println("Total area of Circles only: " + String.format("%.6f", totalArea(myCircles)));
		
	}

	private static double totalArea (List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
	
}