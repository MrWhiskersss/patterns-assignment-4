package handlers;

public class DefaultHandler implements Handler {
	public DefaultHandler() {
	}

	public void handleRequest(String request) {
		System.out.println("command [" + request + "] does not exist...");
	}

	public void setNextHandler(Handler nextHandler) {
	}
}
