// DANIEL ZABARI
// pd 9
// HW45
// 2013-12-19
/*======================================
  class BubbleSort -- implements bubblesort algorithm
  ======================================*/

import java.util.ArrayList;

public class BubbleSort {

    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
        ArrayList<Integer> retAL = new ArrayList<Integer>();

	while (hi>=lo){
	    retAL.add(lo);
	    lo+=size;
	}
        shuffle(retAL);
        return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int n=0;
	Object c,c2;
	for (int i=0;i<al.size();i++){
	    n= (int) (Math.random()*al.size());
	    c=al.get(i);
	    c2=al.get(n);
	    al.set(i,c2);
	    al.set(n,c);
	}

    }

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
	int size=data.size()-1;
	int n=0;
	while (size>=0){
	    n=0;
	    for (int i=0;i<data.size()-1;i++){
		Comparable st=data.get(i);
		Comparable nd=data.get(i+1);
		if (st.compareTo(nd)>0){
		    data.set(i+1,st);
		    data.set(i,nd);
		    n++;
		}
	    }
		if (n==0)
		    break;
		size--;
	}
    



    }//end bubbleSortV -- O(?)


    // ArrayList-returning bubbleSort
    // postcondition: order of data's elements unchanged
    //                Returns sorted copy of data.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) {
        //declare and initialize empty ArrayList for copying
        ArrayList<Comparable> data = input;

	int size=data.size()-1;
	int n=0;
	while (size>=0){
	    n=0;
	    for (int i=0;i<data.size()-1;i++){
		Comparable st=data.get(i);
		Comparable nd=data.get(i+1);
		if (st.compareTo(nd)>0){
		    data.set(i+1,st);
		    data.set(i,nd);
		    n++;
		}
	    }
		if (n==0)
		    break;
		size--;
	}
    

        return data;
    }//end bubbleSort -- O(?)


    public static void main(String [] args){
/*===============for VOID methods=============     

        ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        bubbleSortV(glen);
        System.out.println( "ArrayList glen after sorting:\n" + glen );
     
        ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        bubbleSortV(coco);
        System.out.println( "ArrayList coco after sorting:\n" + coco );
   
     ============================================*/


            ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println( "ArrayList glen before sorting:\n" + glen );
        ArrayList glenSorted = bubbleSort( glen );
        System.out.println( "sorted version of ArrayList glen:\n" 
                            + glenSorted );
        System.out.println( "ArrayList glen after sorting:\n" + glen );

              ArrayList coco = populate( 10, 1, 1000 );
        System.out.println( "ArrayList coco before sorting:\n" + coco );
        ArrayList cocoSorted = bubbleSort( coco );
        System.out.println( "sorted version of ArrayList coco:\n" 
                            + cocoSorted );
        /*==========for AL-returning methods==========
          ============================================*/

    }//end main

}//end class BubbleSort
