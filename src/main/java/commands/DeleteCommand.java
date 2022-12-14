package commands;

import tools.SelectTool;
import mementos.CommandMemento;
import shapes.Shape;
import structures.*;

public class DeleteCommand implements Command {
	SelectTool selector;
	CareTakerStructure careTaker;
	CommandStructure executedCommands;
	ShapesStructure shapes;
	Shape previousShape;
	int previousSelected;

	public DeleteCommand() {
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
		previousSelected = selector.getSelected();
		careTaker.addMemento(new CommandMemento(previousSelected, previousShape));

		shapes.removeShape(selector.getSelected());

		selector.setSelected(-1);

		executedCommands.addCommand(this);
	}

	public void undo() {
		CommandMemento previousState = careTaker.getMemento();
		this.previousShape = previousState.getShapeState();
		this.previousSelected = previousState.getSelectedState();
		selector.setSelected(previousSelected);
		shapes.addShape(previousSelected, previousShape);
	}
}
