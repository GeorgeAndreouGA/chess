/**
 * Package containing classes for a chess game.
 */
package hw3;
public class Square {
	/**
	 * Represents a square on a chessboard.
	 */
private char row;
private char col;
/**
 * Constructs a Square with specified row and column.
 * @param row The row of the square (a-h).
 * @param col The column of the square (1-8).
 * @throws IllegalArgumentException if the row or column is invalid.
 */
	public Square(char row, char col) {
        if (!isValidRow(row) || !isValidColumn(col)) {
        	 throw new IllegalArgumentException("Invalid square: " + row + col);
        }

		this.row=row;
		this.col=col;
	}
	
	 /**
     * Constructs a Square from a string representation.
     * @param name The string representation of the square (e.g., "a1").
     */
	public Square(String name) {
		 char row = name.charAt(0);
		char col = name.charAt(1);
		 if (!isValidRow(row) || !isValidColumn(col)) 
        	 throw new IllegalArgumentException("Invalid square: " + row + col);
        	 
		 this.row=row;
		 this.col=col;
	}
	 /**
     * Returns a string representation of the square.
     * @return The string representation of the square.
     */
	public String toString() {
		return row+""+col;
	}
	 /**
     * Checks if the given row is valid.
     * @param row The row to check.
     * @return True if the row is valid, false otherwise.
     */
	private boolean isValidRow(char row) {
		return (row>='a'&&row<='h');
	}
	 /**
     * Checks if the given column is valid.
     * @param col The column to check.
     * @return True if the column is valid, false otherwise.
     */
	private boolean isValidColumn(char col) {
		
		return (col>='1'&&col<='8');
	}
	  /**
     * Compares this Square to the specified object.
     * @param object The object to compare.
     * @return True if the object is equal to this Square, false otherwise.
     */
	public boolean equals (Object object) {
		if (object == null)
			return false;
		if (this.getClass() != object.getClass())
			return false;
Square other =(Square) object;

return this.row==other.row && this.col==other.col;
	}
	
}
