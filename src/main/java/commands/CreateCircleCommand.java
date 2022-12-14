package commands;

import shapes.Circle;
import structures.*;

public class CreateCircleCommand implements Command {
	CommandStructure executedCommands;
	ShapesStructure shapes;

	public CreateCircleCommand() {
		executedCommands = CommandStructure.getInstance();
		shapes = ShapesStructure.getInstance();
	}

	public void execute(String parameters) {
		int radius = Integer.parseInt(parameters);
		shapes.addShape(new Circle(radius));
		executedCommands.addCommand(this);
	}

	public void undo() {
		shapes.removeShape();
	}

}
