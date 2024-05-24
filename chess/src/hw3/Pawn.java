package hw3;
/**
 * Represents a pawn chess piece.
 */
public class Pawn extends Piece {
	  /**
     * Constructs a pawn with the specified color.
     * @param color The color of the pawn.
     */
    public Pawn(Color color) {
        super(color);
    }

    /**
     * Returns the algebraic name of the piece.
     * Since pawns don't have an algebraic name, returns an empty string.
     * @return An empty string.
     */
    public String algebraicName() {
        return ""; 
    }
    /**
     * Generates valid moves for the pawn from the given square.
     * @param square The square from which to generate moves.
     * @return An array of squares representing valid moves.
     */
    public Square[] movesFrom(Square square) {
    	String start = square.toString();
		char row = start.charAt(0);
		char col = start.charAt(1);
        int direction;
        		if (this.getColor() == Color.WHITE)
        			direction=1;
        		else
        			direction=-1;

        		 
                Square[] validMoves = new Square[2]; 
                int moveCount = 0;
                char newRow;
                
                if((row=='h')&&(this.getColor()==Color.WHITE)) {
         validMoves[0]= new Square(' ',' ');
         return trimArray(validMoves, moveCount);
                }
                else  if((row=='a')&&(this.getColor()==Color.BLACK)) {
                	  validMoves[0]= new Square(' ',' ');
                      return trimArray(validMoves, moveCount);
                }
                	 
                
                if(row=='b'&&direction==1) {
                	newRow = (char) (row + 2);
                Square forwardSquare = new Square(newRow, col);
                validMoves[moveCount] = forwardSquare;
                      moveCount++;
                }
                else if(row=='g'&&direction==-1) {
                	newRow = (char) (row - 2);
                Square forwardSquare = new Square(newRow, col);
                validMoves[moveCount] = forwardSquare;
                      moveCount++;
                }
                      
                 newRow = (char) (row + direction);
                if (newRow >= 'a' && newRow <='h') {
                    Square forwardSquare = new Square(newRow, col);
                    validMoves[moveCount] = forwardSquare;
                          moveCount++;
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
