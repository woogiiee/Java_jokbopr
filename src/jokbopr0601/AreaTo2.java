//package jokbopr0601;
//
//class Shape {
//	int getArea() {
//		return 0;
//	}
//}
//
//class Circle extends Shape {
//	int radius;
//
//	Circle(int radius) {
//		this.radius = radius;
//	}
//
//	int getArea() {
//		return (radius * radius) * (int) Math.PI;
//	}
//}
//
//class Rectangle extends Shape {
//	int width;
//	int height;
//
//	Rectangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	int getArea() {
//		return width * height;
//	}
//}
//
//class Triangle extends Shape {
//	int width;
//	int height;
//
//	Triangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	int getArea() {
//		return (width * height) / 2;
//	}
//}
//
//public class AreaTo2 {
//	public static void main(String[] args) {
//		
//	
//	Shape[] shapes = new Shape[3];
//	
//	shapes[0] = new Circle(10);
//	shapes[1] = new Rectangle(10,20);
//	shapes[2] = new Triangle(20,30);
//	
//	int totalArea = 0;
//	
//	for(Shape shape : shapes) {
//		totalArea = totalArea + shape.getArea();
//		}
//	System.out.println(totalArea);
//}
//}
