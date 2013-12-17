/*========================================
class Concentration
Facilitates playing game of Concentration,
aka Memory.
========================================*/

import java.util.ArrayList;
import cs1.Keyboard;

public class Concentration {

    //instance variables
    //storage for 4x4 grid of Tiles. _board.size() == 16	
    private ArrayList<Tile> _board; 

    //count of Tiles with faces visible
    private int _numberFaceUp;  

    //list of Strings used for Tile vals
    private WordList _list;

    private static int _numRows = 4;


 


    //DO NOT MODIFY main()
    public static void main( String[] args ) {
	Concentration game = new Concentration();
	game.play();
    }

}//end class Concentration

