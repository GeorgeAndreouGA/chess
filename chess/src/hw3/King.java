package hw3;
/**
 * Represents a king chess piece.
 */
public class King extends Piece {
	  /**
     * Constructs a king with the specified color.
     * @param color The color of the king.
     */
	public King(Color color) {
		super(color);
	}
	/**
     * Returns the algebraic name of the piece.
     * @return The algebraic name of the king ("K").
     */
	public  String algebraicName() {
		return "K";
	}
	   /**
     * Generates valid moves for the king from the given square.
     * @param square The square from which to generate moves.
     * @return An array of squares representing valid moves.
     */
	public  Square[] movesFrom(Square square) {
		String start = square.toString();
		char row = start.charAt(0);
		char col = start.charAt(1);
		
		    int[] rowOffsets = {-1, -1, -1, 0, 0, 1, 1, 1};
		    int[] colOffsets = {-1, 0, 1, -1, 1, -1, 0, 1};
		    
		    Square[] validMoves = new Square[8]; 
		    int moveCount = 0; 

		  
		    for (int i = 0; i < rowOffsets.length; i++) {
		        char newRow = (char)(row + rowOffsets[i]);
		        char newCol = (char)(col + colOffsets[i]);
		        
		       
		        if (newRow >= 'a' && newRow <= 'h' && newCol >= '1' && newCol <= '8') {
		            validMoves[moveCount] = new Square(newRow, newCol);
		            moveCount++;
		        }
		    }
		    if (moveCount<8) {
		    	Square[] updatedValidMoves = new Square[moveCount]; 
		    	for(int i=0;i<moveCount;i++)
		    		updatedValidMoves[i]=validMoves[i];
		    	
		    	return updatedValidMoves;
		    }
		    

		    return 	validMoves;
		
	}
}
