package handlers;

import commands.Command;
import commands.CreateCircleCommand;

public class CreateCircleHandler implements Handler {
	Handler nextHandler;
	Command command;

	public CreateCircleHandler() {
		command = new CreateCircleCommand();
	}

	public void handleRequest(String request) {
		String parsed[] = parseRequest(request);

		if(parsed[0].equals("CREATE CIRCLE"))
			command.execute(parsed[1]);
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	private String[] parseRequest(String request) {
		String[] temporary = request.split(" ", 5);
		String[] parsed = new String[2];
		if(temporary.length < 3)
			return temporary;
		parsed[0] = temporary[0] + " " + temporary[1];
		parsed[1] = temporary[2];

		return parsed;
	}
}
