package handlers;

import commands.Command;
import commands.UndoCommand;

public class UndoHandler implements Handler {
	Handler nextHandler;
	Command command;

	public UndoHandler() {
		command = new UndoCommand();
	}

	public void handleRequest(String request) {
		if(request.equals("UNDO"))
			command.execute(null);
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
