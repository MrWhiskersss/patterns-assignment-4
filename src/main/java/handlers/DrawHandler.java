package handlers;

import commands.Command;
import commands.DrawCommand;

public class DrawHandler implements Handler {
	Handler nextHandler;
	Command command;

	public DrawHandler() {
		command = new DrawCommand();
	}

	public void handleRequest(String request) {
		if(request.equals("DRAW"))
			command.execute(null);
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
