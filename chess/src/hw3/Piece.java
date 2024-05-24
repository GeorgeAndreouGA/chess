package hw3;

/**
 * Abstract class representing a chess piece.
 */
public abstract class Piece {
private Color color;

/**
 * Constructs a Piece with the specified color.
 * @param color The color of the piece.
 */
public Piece(Color color){
	this.color=color;
}
/**
 * Gets the color of the piece.
 * @return The color of the piece.
 */
public Color getColor() {
	return this.color;
}
public abstract String algebraicName();
public abstract Square[] movesFrom(Square square);

}
