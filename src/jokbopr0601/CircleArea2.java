package jokbopr0601;
class Circle extends Object{
	
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	int getArea() {
		return (radius*radius)*(int)Math.PI;
	}
	
	public String toString() {
		
		String na = "���̴�"+getArea()+"�Դϴ�";
		return na;
	}
}
public class CircleArea2 {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		Object obj = new Circle(10);
		System.out.println(obj);
	}
}
