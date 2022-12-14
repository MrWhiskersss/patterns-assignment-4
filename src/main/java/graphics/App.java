package graphics;

import java.io.FileReader;

import handlers.*;
import commands.*;
import tools.*;

public class App {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("please specify input file path...");
			return;
		}

		FileReader fileReader = FileTools.getFileReader(args[0]);

		CreateRectangleHandler rectangleHandler = new CreateRectangleHandler();
		CreateCircleHandler circleHandler = new CreateCircleHandler();
		SelectHandler selectHandler = new SelectHandler();
		MoveHandler moveHandler = new MoveHandler();
		DrawHandler drawHandler = new DrawHandler();
		ColorHandler colorHandler = new ColorHandler();
		DeleteHandler deleteHandler = new DeleteHandler();
		DrawSceneHandler drawSceneHandler = new DrawSceneHandler();
		UndoHandler undoHandler = new UndoHandler();
		DefaultHandler defaultHandler = new DefaultHandler();

		rectangleHandler.setNextHandler(circleHandler);
		circleHandler.setNextHandler(selectHandler);
		selectHandler.setNextHandler(moveHandler);
		moveHandler.setNextHandler(drawHandler);
		drawHandler.setNextHandler(colorHandler);
		colorHandler.setNextHandler(deleteHandler);
		deleteHandler.setNextHandler(drawSceneHandler);
		drawSceneHandler.setNextHandler(undoHandler);
		undoHandler.setNextHandler(defaultHandler);

		CleanerReader reader = new CleanerReader(fileReader);
		while(reader.ready())
			rectangleHandler.handleRequest(reader.readLine());
	}
}
