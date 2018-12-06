package pkgGame;

import java.io.Serializable;
import java.util.Objects;

public class Cell implements Serializable {
	private int iRow;
	private int iCol;
	private int iCellValue;
	private boolean mistakeMode = false;
	private boolean original = true;

	public Cell(int iRow, int iCol) {
		super();
		this.iRow = iRow;
		this.iCol = iCol;
	}

	public int getiRow() {
		return iRow;
	}

	public int getiCol() {
		return iCol;
	}
	
	public boolean isMistakeMode() {
		return mistakeMode;
	}

	public void setMistakeMode(boolean mistakeMode) {
		this.mistakeMode = mistakeMode;
	}
	

	public boolean isOriginal() {
		return original;
	}

	public void setOriginal(boolean original) {
		this.original = original;
	}

	public int getiCellValue() {
		return iCellValue;
	}

	public void setiCellValue(int iCellValue) {
		this.iCellValue = iCellValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(iRow, iCol);
	}

}
