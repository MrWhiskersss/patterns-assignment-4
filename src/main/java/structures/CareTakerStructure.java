package structures;

import java.util.ArrayList;

import mementos.CommandCareTaker;
import mementos.CommandMemento;

public class CareTakerStructure {
	private static CareTakerStructure structure = null;
	CommandCareTaker careTaker;

	private CareTakerStructure() {
		careTaker = new CommandCareTaker();
	}

	public static CareTakerStructure getInstance() {
		if (structure == null)
			structure = new CareTakerStructure();

		return structure;
	}

	public void addMemento(CommandMemento newMemento) {
		careTaker.addMemento(newMemento);
	}

	public CommandMemento getMemento() {
		return careTaker.getMemento();
	}
}
