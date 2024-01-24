package abstraction;

public class Circle extends Drawable {
	
	public void area() {
		System.out.println("Inside overriden method");
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
		c.print();	
}
	
}