class Area {

	int l;
	int b;

	public Area(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public void display() {
		System.out.println("lenght =" + this.l);
		System.out.println("Breath =" + this.b);
	}

}

class Rectangle extends Area {

	public Rectangle(int l, int b) {
		super(l, b);

	}

	public void RectangleArea() {
		System.out.println("Area of Rectangle is =" + l * b);
	}

}

class cuboid extends Area {

	int h;

	public cuboid(int l, int b, int h) {
		super(l, b);
		this.h = h;

	}

	public void cuboidArea() {
		System.out.println("Area of cuboid is =" + l * b *h);
	}
	

	public void display() {
		super.display();
		System.out.println("height ="+h);
	}

}

public class InheritanceCodeReusability {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(5, 20);
		rectangle.RectangleArea();
		
		cuboid c1 =new cuboid(10,20,30);
		c1.cuboidArea();
		c1.display();
		
	}

}
