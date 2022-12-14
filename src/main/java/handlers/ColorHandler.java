package handlers;

import commands.Command;
import commands.ColorCommand;

public class ColorHandler implements Handler {
	Handler nextHandler;
	Command command;

	public ColorHandler() {
		command = new ColorCommand();
	}

	public void handleRequest(String request) {
		String parsed[] = parseRequest(request);

		if(parsed[0].equals("COLOR"))
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
