package commands;

public interface Command {
	public void execute(String parameters);

	public void undo();
}
