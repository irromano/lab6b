package app.helper;

import java.io.Serializable;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import pkgGame.Cell;

public class Trashcan extends StackPane implements Serializable {

	private Cell cell;
	

	public Trashcan(Cell c) {
		this.cell = c;
	}

	public Cell getCell() {
		return cell;
	}
	

}
