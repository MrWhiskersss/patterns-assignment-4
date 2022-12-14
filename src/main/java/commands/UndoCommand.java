package commands;

import structures.*;
import commands.Command;

public class UndoCommand implements Command {
	CommandStructure executedCommands;

	public UndoCommand() {
		executedCommands = CommandStructure.getInstance();
	}

	public void execute(String parameters) {
		Command last = executedCommands.removeCommand();
		last.undo();
	}

	public void undo() {
	}
}
