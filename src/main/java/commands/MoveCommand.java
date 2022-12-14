package commands;

import tools.SelectTool;
import mementos.CommandMemento;
import shapes.Shape;
import structures.*;

public class MoveCommand implements Command {
	SelectTool selector;
	CareTakerStructure careTaker;
	CommandStructure executedCommands;
	ShapesStructure shapes;
	Shape previousShape;

	public MoveCommand() {
		selector = SelectTool.getInstance();
		careTaker = CareTakerStructure.getInstance();
		executedCommands = CommandStructure.getInstance();
		shapes = ShapesStructure.getInstance();
	}

	public void execute(String parameters) {
		if(selector.getSelected() == -1) {
			System.out.println("no shape selected");
			return;
		}
		String parsed[] = parameters.split(" ", 3);
		int x = Integer.parseInt(parsed[0]);
		int y = Integer.parseInt(parsed[1]);
		previousShape = shapes.getShape(selector.getSelected());
		careTaker.addMemento(new CommandMemento(previousShape));

		Shape moved = shapes.getShape(selector.getSelected());
		moved.setX(x);
		moved.setY(y);
		shapes.setShape(selector.getSelected(), moved);

		executedCommands.addCommand(this);
	}

	public void undo() {
		CommandMemento previousState = careTaker.getMemento();
		this.previousShape = previousState.getShapeState();
		shapes.setShape(selector.getSelected(), previousShape);
	}
}
