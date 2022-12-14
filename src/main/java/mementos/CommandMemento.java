package mementos;

import shapes.*;

public class CommandMemento {
	int selectedState;
	Shape shapeState;

	public CommandMemento(int selectedState) {
		this.selectedState = selectedState;
	}

	public CommandMemento(Shape shapeState) {
		this.shapeState = shapeState;
	}

	public CommandMemento(int selectedState, Shape shapeState) {
		this.selectedState = selectedState;
		this.shapeState = shapeState;
	}

	public int getSelectedState() {
		return selectedState;
	}

	public Shape getShapeState() {
		return shapeState;
	}
}
