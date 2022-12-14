package handlers;

import commands.Command;
import commands.MoveCommand;

public class MoveHandler implements Handler {
	Handler nextHandler;
	Command command;

	public MoveHandler() {
		command = new MoveCommand();
	}

	public void handleRequest(String request) {
		String parsed[] = parseRequest(request);

		if(parsed[0].equals("MOVE"))
			command.execute(parsed[1]);
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	private String[] parseRequest(String request) {
		return request.split(" ", 2);
	}
}
