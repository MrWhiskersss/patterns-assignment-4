package handlers;

import commands.Command;
import commands.DrawSceneCommand;

public class DrawSceneHandler implements Handler {
	Handler nextHandler;
	Command command;

	public DrawSceneHandler() {
		command = new DrawSceneCommand();
	}

	public void handleRequest(String request) {
		if(request.equals("DRAWSCENE"))
			command.execute(null);
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
