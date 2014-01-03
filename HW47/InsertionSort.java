//DANIEL ZABARI
//pd 9
//HW47
//14-01-03
/*======================================
  class InsertionSort -- implements InsertionSort algorithm
  ======================================*/

import java.util.ArrayList;

public class InsertionSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
        ArrayList<Integer> retAL = new ArrayList<Integer>();
        while( size > 0 ) {
            //     offset + rand int on interval [lo,hi]
            retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
            size--;
        }
        return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
        int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // VOID version of InsertionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void insertionSortV( ArrayList<Comparable> data ) {
	int b=0;
	int temp=0;
	for (int i=0;i<data.size();i++){
	    for (int j=0;j<b;j++){
		temp=b;	
		if (temp==b && data.get(temp).compareTo(data.get(b-1))>=0){
		    break;
		}
		else if 
	    }	
	    temp=0;	
	    b++;
    

    }//end insertionSortV, 


// ArrayList-returning insertionSort
// postcondition: order of input ArrayList's elements unchanged
//                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input ) {
	ArrayList<Comparable> retList=input;
	insertionSortV(retList);
	return retList;
    }//end insertionSort,


public static void main( String [] args ) {

  /*===============for VOID methods=============
        ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        insertionSortV(glen);
        System.out.println( "ArrayList glen after sorting:\n" + glen );

        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        insertionSortV(coco);
        System.out.println( "ArrayList coco after sorting:\n" + coco );
      
          ============================================*/
 /*==========for AL-returning methods==========      
       
            ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        ArrayList glenSorted = insertionSort( glen );
        System.out.println( "sorted version of ArrayList glen:\n" 
                            + glenSorted );
        System.out.println( "ArrayList glen after sorting:\n" + glen );

              ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        ArrayList cocoSorted = insertionSort( coco );
        System.out.println( "sorted version of ArrayList coco:\n" 
                            + cocoSorted );
        System.out.println( "ArrayList coco after sorting:\n" + coco );
        System.out.println( coco );

    ============================================*/

    }//end main

}//end class InsertionSort