package exercise1;
import java.util.Random;

public class Circle {
	
		public double radius;
		public double area;
		
		public Circle() {
			radius = 0.00;
			area = 0.00;
		}
		
		public Circle(double radius, double area) {
			this.radius = radius;
			this.area = area;
		}
		
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		public void setArea(double area) {
			this.area = area;
		}
		
		public double getRadius() {
			return radius;
		}
		
		public double getArea() {
			return area;
		}
		
		public void randomiseRadius() {
			double currentRadius = new Random().nextFloat();
			setRadius(currentRadius);
		}
		
		public void calculateArea() {
			randomiseRadius();
			Double area = 3.14*(this.radius*this.radius);
			setArea(area);
		}
		
		
		

	}
	


