public class Driver {

    public static void main( String[] args ) {

	Coin mine = new Coin();
	Coin yours = new Coin( "quarter" );
	Coin wayne = new Coin( "dollar", "heads" );


	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
	else
	    System.out.println( "No match. Firestarter you can not be." );

    }//end main

}//end class
