// DANIEL ZABARI
// pd 9
// HW44
// 2013-12-18
/*========================================
class Concentration
Facilitates playing game of Concentration,
aka Memory.

eg,
 if _list is initialized to {"ape","bat","cat","dog","eel","fog","goo","hat"}  

 ...then a partial sample run might look like:  
          0	 1	 2	 3
	  4	 5	 6	 7
	  8	 9	10	11
	 12	13	14	15

$ turn over > 1
$ turn over > 4
          0	ape	 2	 3
	  ape    5	 6	 7
	  8	 9	10	11
	 12	13	14	15

$ turn over> 2
$ turn over> 11
          0	ape     bat      3
	 ape     5	 6	 7
	  8	 9	10	cat
	 12	13	14	15     

$ Not a match

          0	ape	 2	 3
	 ape     5	 6	 7
	  8	 9	10	11
	 12	13	14	15

========================================*/

import java.util.ArrayList;
import cs1.Keyboard;

public class Concentration {

    //instance variables
    //storage for 4x4 grid of Tiles. _board.size() == 16	
    private ArrayList<Tile> _board; 

    //count of Tiles with faces visible
    private int _numberFaceUp;  

    private Object[] out={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private static int _numRows = 4;
    public Concentration (){
	_numberFaceUp=0;
	_board=new ArrayList<Tile>();
	int i=0;
	String s;
	while (i<8){
	    System.out.println("Please enter a card below ("+(i+1)+"/8):");
	    s=Keyboard.readString();
	    _board.add(new Tile(s));
	    _board.add(new Tile(s)); //So as to have a pair.
	    i++;
	}
	randomize();

    }

    private void swap( int i, int j ) {
	Tile t=_board.get(i);
	_board.set(i,_board.get(j));
	_board.set(j,t);

    }
    public void randomize() {

	for (int i=0;i<_board.size();i++){
	    swap(i, (int) (Math.random()*_board.size()));
	}

    }
    public void play(){
	String s="";
	String s1="";
	while (_numberFaceUp<16){
	    for (int i=0;i<16;i++){
		if (i%4==0){
		    System.out.println();
		}
		System.out.print(out[i]+"\t");
	    }
	    System.out.println("\nWhich would you like to flip over?");
	    s=Keyboard.readString();
	    Tile t1=_board.get(Integer.parseInt(s));
	    _numberFaceUp++;
	    t1.flip();
	    out[Integer.parseInt(s)]=t1.toString();
	    for (int i=0;i<16;i++){
		if (i%4==0){
		    System.out.println();
		}
		System.out.print(out[i]+"\t");
	    }
	    System.out.println("\nWhich would you like to flip over?");
	    s1=Keyboard.readString();
	    Tile t2=_board.get(Integer.parseInt(s1));
	    _numberFaceUp++;
	    t2.flip();
	    out[Integer.parseInt(s1)]=t2.toString();
	    for (int i=0;i<16;i++){
		if (i%4==0){
		    System.out.println();
		}
		System.out.print(out[i]+"\t");
	    }
	    if (t1.equals(t2)){
		    System.out.println("\nMatch!");
		}
	    else{
		System.out.println("\nSorry, no match!");
		out[Integer.parseInt(s)]=Integer.parseInt(s);
		out[Integer.parseInt(s1)]=Integer.parseInt(s1);
		_numberFaceUp-=2;
		
		t1.flip();
		t2.flip();
	    }
	}
	System.out.println("You win!!");
    }

    //DO NOT MODIFY main()
    public static void main( String[] args ) {
	Concentration game = new Concentration();
	game.play();
    }

}//end class Concentration

