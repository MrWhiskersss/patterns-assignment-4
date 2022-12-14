package commands;

import tools.SelectTool;
import mementos.CommandMemento;
import structures.*;

public class SelectCommand implements Command {
	SelectTool selector;
	CareTakerStructure careTaker;
	CommandStructure executedCommands;
	ShapesStructure shapes;
	int previouslySelected;

	public SelectCommand() {
		selector = SelectTool.getInstance();
		careTaker = CareTakerStructure.getInstance();
		executedCommands = CommandStructure.getInstance();
		shapes = ShapesStructure.getInstance();
	}

	public void execute(String parameters) {
		int selectedIndex = Integer.parseInt(parameters);
		if(shapes == null || shapes.getSize() < selectedIndex) {
			System.out.println("ERROR: invalid shape for SELECT");
			return;
		}
		previouslySelected = selector.getSelected();
		selector.setSelected(selectedIndex);
		executedCommands.addCommand(this);
		careTaker.addMemento(new CommandMemento(previouslySelected));
	}

	public void undo() {
		CommandMemento previousState = careTaker.getMemento();
		this.previouslySelected = previousState.getSelectedState();
		selector.setSelected(previouslySelected);
	}
}
