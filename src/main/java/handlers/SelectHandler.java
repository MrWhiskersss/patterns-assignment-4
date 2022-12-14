package handlers;

import commands.Command;
import commands.SelectCommand;
import tools.SelectTool;

public class SelectHandler implements Handler {
	Handler nextHandler;
	Command command;

	public SelectHandler() {
		command = new SelectCommand();
	}

	public void handleRequest(String request) {
		String[] parsed = parseRequest(request);

		if(parsed[0].equals("SELECT"))
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
