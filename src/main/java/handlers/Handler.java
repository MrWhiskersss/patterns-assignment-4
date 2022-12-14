package handlers;

public interface Handler {
	public void handleRequest(String request);

	public void setNextHandler(Handler nextHandler);
}
