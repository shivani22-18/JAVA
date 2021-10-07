abstract class shape {
	abstract void draw();
}

abstract class Line extends shape{
	void draw() {
		System.out.println("This is line");
	}
}
class Rectangle extends shape{
	void draw() {
		System.out.println("This is rectangle");
	}
}

class Cube extends shape{
	void draw() {
		System.out.println("This is cube");
	}
}
public class Q5_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Line l = new Line();
//		l.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Cube c = new Cube();
		c.draw();
	}

}
