package shapes;

public class Rectangle implements Shape {
	String color;
	int width;
	int height;
	int x;
	int y;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.color = "Red";
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

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
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
		String rectangle = "Rectangle, Color: ";
		rectangle = rectangle + color + ", Origin: (";
		rectangle = rectangle + x + "," + y + "), ";
		rectangle = rectangle + "Width: " + width + " ";
		rectangle = rectangle + "Height: " + height;

		return rectangle;
	}
}
