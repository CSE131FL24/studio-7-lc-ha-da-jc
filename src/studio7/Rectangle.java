package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	//instance variables
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
//	public double getLength() {
//		return length;
//	}
//	
//	public double getWidth() {
//		return width;
//	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return (2*length + 2*width);
	}
	
	public boolean smallerArea(Rectangle r1, Rectangle r2) {
		return r1.area() < r2.area();
	}
	
	public boolean isSquare(Rectangle r1) {
		return (length == width);
	}
	
	public void drawRectangle() {
		double scale = Math.max(width, length)*1.2;
		StdDraw.setScale(-scale, scale);
		StdDraw.rectangle(0, 0, length, width);
	}
	
	public String toString () {
		String result = "";
		result += "Length: " + length;
		result += " Width: " + width;
		return result;
	}
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 7);
		Rectangle rect2 = new Rectangle(8, 8);
		System.out.println(rect1.area());
		System.out.println(rect1.isSquare(rect1));
		System.out.println(rect2.isSquare(rect2));
		System.out.println(rect1.toString());
		
	}

}
