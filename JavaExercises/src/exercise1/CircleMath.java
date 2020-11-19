package exercise1;

import java.util.ArrayList;

public class CircleMath extends Circle {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.randomiseRadius();
		ArrayList<Double> listArea = new ArrayList<Double>();
		//should be abstract interface when declaring
		
		while (c.radius > 0.01) {
			c.calculateArea();
			listArea.add(c.getArea());
			c.randomiseRadius();
		}
		
		System.out.println("Areas: " + listArea);

	}

}
