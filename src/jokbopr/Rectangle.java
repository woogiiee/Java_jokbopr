package jokbopr;

public class Rectangle {
	int x, y, width, height;
	int area;
	
	Rectangle()	{
		
	}
	
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
		public int square() {
			area = width*height;
			System.out.println(area);
			return area;
			
		}
		void show() {
			System.out.println("("+x+","+y+")"+"������ ũ�Ⱑ "+width+"x"+height+"�� �簢���� ������"+(width*height)+"�Դϴ�");
		}
		
}

