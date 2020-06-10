//package jokbopr0601;
//
//class Shape {
//	int getArea() {
//		return 0;
//	}
//}
//
////class Circle extends Shape {
////	int radius;
////
////	Circle(int radius) {
////		this.radius = radius;
////	}
////
////	int getArea() {
////		return radius * radius * (int) Math.PI;
////	}
////}
//
//class Rectangle extends Shape {
//	private int width;
//	private int height;
//
//	Rectangle(int width, int height) {
//		this.height = height;
//		this.width = width;
//	}
//
//	int getArea() {
//		return height * width;
//	}
//}
//
//class Triangle extends Shape {
//	private int height;
//	private int width;
//
//	Triangle(int height, int width) {
//		this.height = height;
//		this.width = width;
//	}
//
//	int getArea() {
//		return (height * width) / 2;
//	}
//}
//public class AreaTo {
//	public static void main(String[] args) {
//		Shape[] shapes = new Shape[3];
//		
//		shapes[0] = new Circle(10);
//		shapes[1] = new Rectangle(10,20);
//		shapes[2] = new Triangle(20,10);
//		int totalArea=0;
//		
//		for(Shape shape :shapes) {
//			totalArea = totalArea + shape.getArea();
//		}
//		System.out.println(totalArea);
//	}
//}
