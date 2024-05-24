package hw3;

public class ChessTest {

public static void main(String[] args) {
	
	 System.out.println("Testing King moves from square: " + "e4");
     Square square1 = new Square("e4");
     Piece king = new King(Color.WHITE);
     Square[] moves1 = king.movesFrom(square1);
     System.out.println("Valid moves for King from " + "e4" + ":");
     for (int i=0;i<moves1.length;i++)
    	 System.out.print(moves1[i]+" ");
     System.out.println(); 
     
     System.out.println("\nTesting queen moves from square: " + "a8");
     Square square2 = new Square("a8");
    Piece queen  = new Queen(Color.BLACK);
     Square[] moves2 = queen.movesFrom(square2);
     System.out.println("Valid moves for Queen from " + "a8" + ":");
     for (int i=0;i<moves2.length;i++)
    	 System.out.print(moves2[i]+" ");
     System.out.println(); 
     
     System.out.println("\nTesting Bishop moves from square: " + "c4");
     Square square3 = new Square("c4");
     Piece bishop = new Bishop(Color.WHITE);
     Square[] moves3 = bishop.movesFrom(square3);
     System.out.println("Valid moves for Bishop from " + "c4" + ":");
     for (int i = 0; i < moves3.length; i++)
         System.out.print(moves3[i] + " ");
     System.out.println();

   
     System.out.println("\nTesting Rook moves from square: " + "d6");
     Square square4 = new Square("d6");
     Piece rook = new Rook(Color.BLACK);
     Square[] moves4 = rook.movesFrom(square4);
     System.out.println("Valid moves for Rook from " + "d6" + ":");
     for (int i = 0; i < moves4.length; i++)
         System.out.print(moves4[i] + " ");
     System.out.println();

   
     System.out.println("\nTesting Knight moves from square: " + "b1");
     Square square5 = new Square("b1");
     Piece knight = new Knight(Color.WHITE);
     Square[] moves5 = knight.movesFrom(square5);
     System.out.println("Valid moves for Knight from " + "b1" + ":");
     for (int i = 0; i < moves5.length; i++)
         System.out.print(moves5[i] + " ");
     System.out.println();
     
     System.out.println("\nTesting Pawn moves from square: " + "b2");
     Square square6 = new Square("b2");
     Piece pawn = new Pawn(Color.WHITE);
     Square[] moves6 = pawn.movesFrom(square6);
     System.out.println("Valid moves for Pawn from " + "b2" + ":");
     for (int i = 0; i < moves6.length; i++)
         System.out.print(moves6[i] + " ");
     System.out.println();
     
     System.out.println("\nTesting Pawn moves from square: " + "c7");
     Square square7 = new Square("c7");
     Piece pawnBlack = new Pawn(Color.BLACK);
     Square[] moves7 = pawnBlack.movesFrom(square7);
     System.out.println("Valid moves for Pawn (Black) from " + "c7" + ":");
     for (int i = 0; i < moves7.length; i++)
         System.out.print(moves7[i] + " ");
     System.out.println();
     
 }
}


