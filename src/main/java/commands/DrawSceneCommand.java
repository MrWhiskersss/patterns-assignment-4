package commands;

import structures.ShapesStructure;
import shapes.*;

public class DrawSceneCommand implements Command {
	ShapesStructure shapes;

	public DrawSceneCommand() {
		shapes = ShapesStructure.getInstance();
	}

	public void execute(String parameters) {
		Shape toDraw;
		for(int i = 0; i < shapes.getSize(); i++) {
			toDraw = shapes.getShape(i);
			System.out.println(toDraw.toString());
		}
	}

	public void undo() {
	}
}
