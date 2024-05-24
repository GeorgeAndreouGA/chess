package hw3;
/**
 * Represents a knight chess piece.
 */
public class Knight extends Piece {
	 /**
     * Constructs a knight with the specified color.
     * @param color The color of the knight.
     */
    public Knight(Color color) {
        super(color);
    }
    /**
     * Returns the algebraic name of the piece.
     * @return The algebraic name of the knight ("N").
     */
   
    public String algebraicName() {
        return "N";
    }

    /**
     * Generates valid moves for the knight from the given square.
     * @param square The square from which to generate moves.
     * @return An array of squares representing valid moves.
     */
    public Square[] movesFrom(Square square) {
    	String start = square.toString();
		char row = start.charAt(0);
		char col = start.charAt(1);
        
        int[] rowOffsets = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] colOffsets = {1, 2, 2, 1, -1, -2, -2, -1};

      
        Square[] validMoves = new Square[8]; 
        int moveCount = 0;

      
        for (int i = 0; i < 8; i++) {
            char newRow = (char) (row + rowOffsets[i]);
            char newCol = (char) (col + colOffsets[i]);

            if (newRow >= 'a' && newRow <= 'h' && newCol >= '1' && newCol <= '8') {
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

