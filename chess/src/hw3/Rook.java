package hw3;

public class Rook extends Piece {
	public Rook(Color color) {
		super(color);
	}
	 /**
     * Returns the algebraic name of the piece.
     * @return The algebraic name of the Rook ("R").
     */
	public String algebraicName() {
		return "R";
	}

	 /**
     * Generates valid moves for the Rook from the given square.
     * @param square The square from which to generate moves.
     * @return An array of squares representing valid moves.
     */
	public Square[] movesFrom(Square square) {
		String start = square.toString();
		char row = start.charAt(0);
		char col = start.charAt(1);

		int[] rowOffsets = { -1, 1, 0, 0 };
		int[] colOffsets = { 0, 0, -1, 1 };

		
		Square[] validMoves = new Square[14]; 
		int moveCount = 0; 

	
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 8; j++) {
				char newRow = (char) (row + j * rowOffsets[i]);
				char newCol = (char) (col + j * colOffsets[i]);

				if (newRow < 'a' || newRow > 'h' || newCol < '1' || newCol > '8')
					break;

				Square nextSquare = new Square(newRow, newCol);
				validMoves[moveCount] = nextSquare;
				moveCount++;

			}
		}

		return trimArray(validMoves, moveCount);
	}
	   /**
     * Trims the array to the specified length.
     * @param array The array to trim.
     * @param length The new length of the array.
     * @return The trimmed array.
     */
	private Square[] trimArray(Square[] array, int length) {
		Square[] trimmedArray = new Square[length];
		for (int i = 0; i < length; i++) {
			trimmedArray[i] = array[i];
		}
		return trimmedArray;
	}
}
