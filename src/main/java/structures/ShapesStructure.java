package structures;

import java.util.ArrayList;

import shapes.Shape;

public class ShapesStructure {
	private static ShapesStructure structure = null;
	ArrayList<Shape> shapes;

	private ShapesStructure() {
		shapes = new ArrayList<Shape>();
	}

	public static ShapesStructure getInstance() {
		if (structure == null)
			structure = new ShapesStructure();

		return structure;
	}

	public void addShape(Shape shape) {
		shapes.add(shape);
	}

	public void addShape(int i, Shape shape) {
		shapes.add(i, shape);
	}

	public void setShape(int i, Shape shape) {
		shapes.set(i, shape);
	}

	public Shape removeShape() {
		return shapes.remove(shapes.size() - 1);
	}

	public Shape removeShape(int i) {
		return shapes.remove(i);
	}

	public Shape getShape(int i) {
		return shapes.get(i);
	}

	public int getSize() {
		return shapes.size();
	}
}
