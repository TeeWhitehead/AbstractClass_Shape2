// Abstract Class Shape 2
abstract class Shape {
	
	public abstract double area();
	
	public abstract double perimeter();
}
// Rectangle Class
class Rectangle extends Shape {
	// Attributes
	private double width;
	private double length;
	// Constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	// Methods
	@Override
	public double area() {
		// Area of Rectangle = length * width
		return length * width;
	}
	@Override
	public double perimeter() {
		// Perimeter of Rectangle = sum of all sides
		return (length * 2 ) + (width * 2);
	}
	
	public String toString() {
		return "Rectangle \nArea = " + area() + "\nPerimeter = " + perimeter();
	}

}
// Circle Class
class Circle extends Shape {
	// Attributes
	private double radius;
	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	// Methods
	@Override
	public double area() {
		// Area of Circle = (pi)(radius * radius)
		return (3.14 * (radius * radius));
	}
	@Override
	public double perimeter() {
		// Perimeter of Circle = 2(pi)r
		return (2 * (3.14 * radius));
	}
	
	public String toString() {
		return "Circle \nArea = " + area() + "\nPerimeter = " + perimeter();
	}
	
}
// Triangle Class
class Triangle extends Shape {
	// Attributes
	private double length_side1;
	private double length_side2;
	private double length_side3;
	// Constructor
	public Triangle(double length_side1, double length_side2, double length_side3) {
		this.length_side1 = length_side1;
		this.length_side2 = length_side2;
		this.length_side3 = length_side3;
	}
	// Methods
	@Override
	public double area() {
		// Area of Triangle = (1/2)(base * height)
		return ((length_side1 * length_side2) / 2);
	}
	@Override
	public double perimeter() {
		// Perimeter of Triangle = sum of all sides
		return (length_side1 + length_side2 + length_side3);
	}
	
	public String toString() {
		return "Triangle \nArea = " + area() + "\nPerimeter = " + perimeter();
	}

}
// Main
class ShapeArray {

	public static void main(String[] args) {
		// Shape Objects
		Rectangle r = new Rectangle(5, 2);
		Circle c = new Circle(4);
		Triangle t = new Triangle(2, 3, 5);
		
		Shape[] arrayShape = {r, c, t};
		// Print shape objects from array
		for(Shape s : arrayShape) {
			System.out.println(s);
			System.out.println();
		} 
		
	}
}
