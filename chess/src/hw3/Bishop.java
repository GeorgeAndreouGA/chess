package hw3;
/**
 * Represents a bishop chess piece.
 */
public class Bishop extends Piece {
	  /**
     * Constructs a bishop with the specified color.
     * @param color The color of the bishop.
     */
    public Bishop(Color color) {
        super(color);
    }
    /**
     * Returns the algebraic name of the piece.
     * @return The algebraic name of the bishop ("B").
     */
    
    public String algebraicName() {
        return "B";
    }
    /**
     * Generates valid moves for the bishop from the given square.
     * @param square The square from which to generate moves.
     * @return An array of squares representing valid moves.
     */
   
    public Square[] movesFrom(Square square) {
    	String start = square.toString();
		char row = start.charAt(0);
		char col = start.charAt(1);

      
        int[] rowOffsets = {-1, -1, 1, 1};
        int[] colOffsets = {-1, 1, -1, 1};

        
        Square[] validMoves = new Square[13]; 
        int moveCount = 0; 
        
        for (int i = 0; i < rowOffsets.length; i++) {
           
            for (int j = 1; j < 8; j++) {
                char newRow = (char) (row + j * rowOffsets[i]);
                char newCol = (char) (col + j * colOffsets[i]);

             
                if (newRow < 'a' || newRow > 'h' || newCol < '1' || newCol > '8') {
                    break; 
                }

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
     * @param length The desired length of the trimmed array.
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

