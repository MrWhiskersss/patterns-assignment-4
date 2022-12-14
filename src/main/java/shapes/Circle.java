package shapes;

public class Circle implements Shape {
	String color;
	int radius;
	int x;
	int y;

	public Circle(int radius) {
		this.radius = radius;
		this.color = "Blue";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		String circle = "Circle, Color: ";
		circle = circle + color + ", Origin: (";
		circle = circle + x + "," + y + "), Radius: ";
		circle = circle + radius;

		return circle;
	}
}
