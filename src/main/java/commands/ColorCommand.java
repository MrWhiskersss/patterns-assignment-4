package commands;

import tools.SelectTool;
import mementos.CommandMemento;
import shapes.Shape;
import structures.*;

public class ColorCommand implements Command {
	SelectTool selector;
	CareTakerStructure careTaker;
	CommandStructure executedCommands;
	ShapesStructure shapes;
	Shape previousShape;

	public ColorCommand() {
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
		previousShape = shapes.getShape(selector.getSelected());
		careTaker.addMemento(new CommandMemento(previousShape));

		Shape colored = shapes.getShape(selector.getSelected());
		colored.setColor(parameters);
		shapes.setShape(selector.getSelected(), colored);

		executedCommands.addCommand(this);
	}

	public void undo() {
		CommandMemento previousState = careTaker.getMemento();
		this.previousShape = previousState.getShapeState();
		shapes.setShape(selector.getSelected(), previousShape);
	}
}
