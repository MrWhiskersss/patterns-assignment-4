package handlers;

import commands.Command;
import commands.DeleteCommand;

public class DeleteHandler implements Handler {
	Handler nextHandler;
	Command command;

	public DeleteHandler() {
		command = new DeleteCommand();
	}

	public void handleRequest(String request) {
		if(request.equals("DELETE"))
			command.execute(null);
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
