package mementos;

import java.util.ArrayList;

public class CommandCareTaker {
	ArrayList<CommandMemento> commands;

	public CommandCareTaker() {
		commands = new ArrayList<CommandMemento>();
	}

	public CommandMemento getMemento() {
		return commands.remove(commands.size() - 1);
	}

	public void addMemento(CommandMemento newMemento) {
		commands.add(newMemento);
	}
}
