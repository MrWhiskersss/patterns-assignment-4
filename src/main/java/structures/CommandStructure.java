package structures;

import java.util.ArrayList;

import commands.Command;

public class CommandStructure {
	private static CommandStructure structure = null;
	ArrayList<Command> commands;

	private CommandStructure() {
		commands = new ArrayList<Command>();
	}

	public static CommandStructure getInstance() {
		if (structure == null)
			structure = new CommandStructure();

		return structure;
	}

	public void addCommand(Command command) {
		commands.add(command);
	}

	public Command removeCommand() {
		return commands.remove(commands.size() - 1);
	}

	public int getSize() {
		return commands.size();
	}
}
