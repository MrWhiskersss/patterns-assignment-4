package commands;

import structures.*;
import shapes.*;
import tools.SelectTool;

public class DrawCommand implements Command {
	SelectTool selector;
	ShapesStructure shapes;

	public DrawCommand() {
		selector = SelectTool.getInstance();
		shapes = ShapesStructure.getInstance();
	}

	public void execute(String parameters) {
		if(selector.getSelected() == -1) {
			System.out.println("no shape selected");
			return;
		}
		Shape toDraw = shapes.getShape(selector.getSelected());
		System.out.println(toDraw.toString());
	}

	public void undo() {
	}
}
