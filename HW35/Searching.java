// DANIEL ZABARI
// pd 9
// HW31
// 2013-11-25

public class Searching {
    

    /*==================================================
      int frequency(int[],int) -- uses FOR loop to search int array for target
      post: returns num of times target occurs in array
      ==================================================*/
    public static int frequency( int[] a, int target ) {

        int freq = 0;

        for( int i : a ) 
            if ( i == target )
                freq++;

        return freq;
    }




    /*==================================================
      int linSearch(String[],String) -- searches an array of Strings for target
      post: returns index of first occurrence of target, or
            returns -1 if target not found
      ==================================================*/
    public static int linSearch (Comparable[] a, Comparable target ) {

        int tPos = -1;
        int i = 0;

        while ( i < a.length ) {

            if ( a[i].compareTo(target)==0 ) {
                tPos = i;
                break;
            }
            i++;
        }

        return tPos;
    }





    /*==================================================
      int linSearch(?,?) -- searches an array 
      of Objects of same type for target
      post: returns index of first occurrence of target, or
            returns -1 if target not found
      ==================================================*/



    // utility/helper fxn to display contents of an array of Objects
    private static void printArray( int[] arr ) {
        String output = "[ "; 

        for( int i : arr )
            output += i + ", ";

        output = output.substring( 0, output.length()-2 ) + " ]";

        System.out.println( output );
    }
    private static void printArray( Object[] arr ) {
        String output = "[ "; 

        for( Object o : arr )
            output += o + ", ";

        output = output.substring( 0, output.length()-2 ) + " ]";

        System.out.println( output );
    }

 /*==================================================
    //main method for testing
    public static void main ( String[] args ) {

        //TIP: kill & yank the top comment bar down one section 
        //     at a time to test your methods as they develop.
      



        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nNow testing linSearch on int array...");

        //declare and initialize an array of ints
        int[] iArr = { 2, 4, 6, 8, 6, 42 };

        printArray( iArr );

        //search for 6 in array 
        System.out.println( linSearch(iArr,6) );

        //search for 43 in array 
        System.out.println( linSearch(iArr,43) );
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~




        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nNow testing linSearch on String array...");

        //declare and initialize an array of Strings
        String[] y = { "kiwi", "watermelon", "orange", "apple", 
                       "peach", "watermelon" };

        printArray( y );

        //search for "watermelon" in array y
        System.out.println( linSearch(y,"watermelon") );

        //search for "lychee" in array y
        System.out.println( linSearch(y,"lychee") );
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~




        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nNow testing linSearch on Binary array...");

        //declare Binary array
        Binary[] bArr = new Binary[10];

        printArray( bArr ); //should show array of nulls

        //initialize Binary array
        //Q: Why would a FOREACH loop not do the job here?
        for( int i = 0; i < bArr.length; i++ ) {
            bArr[i] = new Binary( (int)(100 * Math.random()) );
        }

        printArray( bArr ); //should now show Binary numbers

        //search for the value in slot 3 in array
        System.out.println( "Searching for " + bArr[3] + "..." );
        System.out.println( linSearch(bArr, bArr[3] ) );

        //search for 101 in array
        System.out.println( linSearch(bArr, new Binary(5) ) );

        //search for 100000000 in array
        System.out.println( linSearch(bArr, new Binary(256)) );
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nNow testing linSearch on Hexadecimal array...");

        //declare Hexadecimal array
        Hexadecimal[] hArr = new Hexadecimal[10];

        printArray( hArr ); //should show array of nulls

        //initialize Hexadecimal array
        //Q: Why would a FOREACH loop not do the job here?
        for( int i = 0; i < hArr.length; i++ ) {
            hArr[i] = new Hexadecimal( (int)(100 * Math.random()) );
        }

        printArray( hArr ); //should now show Hexadecimal numbers

        //search for the value in slot 3 in array
        System.out.println( "Searching for " + hArr[3] + "..." );
        System.out.println( linSearch(hArr, hArr[3] ) );

        //search for 5 in array
        System.out.println( linSearch(hArr, new Hexadecimal(5) ) );

        //search for 100 in array
        System.out.println( linSearch(hArr, new Hexadecimal(256)) );
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("\nNow testing linSearch on Comparable array...");
        Comparable[] CArr = { 2, 4, 6, 8, 6, 42 };

        printArray( CArr );

        //search for 6 in array 
        System.out.println( linSearch(CArr,6) );

        //search for 43 in array 
        System.out.println( linSearch(CArr,43) );
        //  Follow the pattern of the machinery above.
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
      
    }//end main()
  ==================================================*/
}//end class Searching
