//skeleton file for class Binary
// eventually should adhere to specifications of Comparable interface

public class Binary {

    private int _decNum;
    private String _binNum;

    /*=====================================
      default constructor
      precondition:  
      postcondition: 
      =====================================*/
    public Binary() { 
	// *** YOUR IMPLEMENTATION HERE ***
    }


    /*=====================================
      overloaded constructor
      precondition:  n >= 0
      postcondition: 
      =====================================*/
    public Binary( int n ) {
	// *** YOUR IMPLEMENTATION HERE ***
    }


    /*=====================================
      String toString() -- returns String representation of this Object
      precondition:  
      postcondition: 
      =====================================*/
    public String toString() { 
	// *** YOUR IMPLEMENTATION HERE ***
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      String decToBin(int) -- converts base-10 input to binary
      precondition:  n >= 0
      postcondition: return String of bits
      eg  decToBin(14) -> "1110"
      =====================================*/
    public static String decToBin( int n ) {
	// *** YOUR IMPLEMENTATION HERE ***
	return ""; //placeholder to get past compiler
    }


    /*=====================================
      String decToBinR(int) -- converts base-10 input to binary, recursively
      precondition:  n >= 0
      postcondition: returns String of bits
      eg  decToBin(14) -> "1110"
      =====================================*/
    public static String decToBinR( int n ) { 
	// *** YOUR IMPLEMENTATION HERE ***
	return ""; //placeholder to get past compiler
    }


    //main method for testing
    public static void main( String[] args ) {

	System.out.println();
	System.out.println( "Testing ..." );

	/*=========================================
	Binary b1 = new Binary(5);
	Binary b2 = new Binary(5);
	Binary b3 = b1;
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);       //false b/c b1, b2 not aliases
	System.out.println(b1 == b2); //true b/c b1, b3 are aliases
	System.out.println(b1 == b3); //false, but should be true
	System.out.println(b1.equals(b2));
	  =========================================*/
    }//end main()

} //end class