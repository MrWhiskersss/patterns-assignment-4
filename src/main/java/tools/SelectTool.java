package tools;

public class SelectTool {
	private static SelectTool tool = null;
	int selectedIndex;

	private SelectTool() {
		selectedIndex = -1;
	}

	public static SelectTool getInstance() {
		if(tool == null)
			tool = new SelectTool();
		
		return tool;
	}

	public void setSelected(int selectedIndex) {
		this.selectedIndex = selectedIndex;
		if(selectedIndex > 0)
			this.selectedIndex -= 1;
	}

	public int getSelected() {
		return selectedIndex;
	}
}
