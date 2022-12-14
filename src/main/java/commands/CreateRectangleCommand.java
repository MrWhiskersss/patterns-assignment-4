package commands;

import shapes.Rectangle;
import structures.*;

public class CreateRectangleCommand implements Command {
	CommandStructure executedCommands;
	ShapesStructure shapes;

	public CreateRectangleCommand() {
		executedCommands = CommandStructure.getInstance();
		shapes = ShapesStructure.getInstance();
	}

	public void execute(String parameters) {
		String parsed[] = parameters.split(" ", 3);
		int width = Integer.parseInt(parsed[0]);
		int height = Integer.parseInt(parsed[1]);
		shapes.addShape(new Rectangle(width, height));
		executedCommands.addCommand(this);
	}

	public void undo() {
		shapes.removeShape();
	}

}
