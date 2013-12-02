// DANIEL ZABARI
// pd 9
// HW34
// 2013-12-02
public class BinSearch2 {


    /*==================================================
      int binSearch(int[],int) -- searches an array of ints for target int
      pre:  input array is sorted in ascending order
      post: returns index of target, or returns -1 if target not found
      ==================================================*/
    public static int binSearch ( Comparable[] a, Comparable target ) {
	//uncomment exactly 1 of the 2 stmts below:
	return binSearchIter( a, target, 0, a.length-1 );
	//return binSearchRec( a, target, 0, a.length-1 );
    }


    public static int binSearchRec( Comparable[] a, Comparable target, int lo, int hi ) {
	int i=(int) ((lo+hi)/2);
	if (lo==hi && (a[i].compareTo(target)!=0) )
	    return -1;
	return (a[i].compareTo(target)==0)? i : (a[i].compareTo(target)>0)? binSearchRec(a,target,lo ,i-1) : binSearchRec(a,target,i+1,hi);
    }

    public static int binSearchIter( Comparable[] a, Comparable target, int lo, int hi ) {
	int i;
	while ((!(lo>hi))){
	    i= (int) ((lo+hi)/2);
	    if (a[i].compareTo(target)==0)
		return i;
	    if (a[i].compareTo(target)>0)
		hi=i-1;
	    else if (a[i].compareTo(target)<0)
		lo=i+1;
	}
	return -1;
    }



    //tell whether an array is sorted in ascending order

    private static boolean isSorted(Comparable[] arr ) {
	boolean retBoo=true;
	Comparable last="";
	for  (int i=0;i<arr.length && retBoo;i++){
	    if ( i>0)
		retBoo=arr[i].compareTo(last)>0;
	    last=arr[i];
	}
	return retBoo;
    }



    // utility/helper fxn to display contents of an array of Objects
    private static void printArray( Comparable[] arr ) {
	String output = "[ "; 

	for( Comparable c : arr )
	    output += c + ", ";

	output = output.substring( 0, output.length()-2 ) + " ]";

	System.out.println( output );
    }


    //main method for testing
    public static void main ( String[] args ) {



System.out.println("\nNow testing binSearch on int array...");
	//Declare and initialize array of ints
	Comparable[] iArr = { 2, 4, 6, 8, 6, 42 };
	System.out.println( "sorted? -- " + isSorted(iArr) );
	Comparable[] iArr2 = { 2, 4, 6, 8, 13, 42 };
	System.out.println( "sorted? -- " + isSorted(iArr2) );
	//search for 6 in array 
	System.out.println( binSearch(iArr2,6) );
	//search for 43 in array 
	System.out.println( binSearch(iArr2,43) );
	//search for 23 in array -- extra test!
	System.out.println( binSearch(iArr2,23) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//Testing on a Binary Array
	System.out.println("\nNow testing binSearch on Binary array...");
	//declare Binary array
	Binary[] bArr = new Binary[10];
	//initialize Binary array
	for( int i = 0; i < bArr.length; i++ ) {
	    bArr[i] = new Binary( (int)(100 * Math.random()) );
	}
	//search for the value in slot 3 in array
	System.out.println( "Searching for " + bArr[3] + "..." );
	System.out.println( binSearch(bArr, bArr[3] ) );
	//search for 101 in array
	System.out.println( binSearch(bArr, new Binary(5) ) );
	//search for 100000000 in array
	System.out.println( binSearch(bArr, new Binary(256)) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//Testing Hexadecimal Array
	System.out.println("\nNow testing binSearch on Hexadecimal array...");
	//declare Hexadecimal array
	Hexadecimal[] hArr = new Hexadecimal[10];
	//initialize Hexadecimal array
	for( int i = 0; i < hArr.length; i++ ) {
	    hArr[i] = new Hexadecimal( (int)(1+ 100 * Math.random()) );
	}
	//search for the value in slot 3 in array
	System.out.println( "Searching for " + hArr[3] + "..." );
	System.out.println( binSearch(hArr, hArr[3] ) );
	//search for 5 in array
	System.out.println( binSearch(hArr, new Hexadecimal(5) ) );
	//search for 100 in array
	System.out.println( binSearch(hArr, new Hexadecimal(256)) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//Testing on a Rational Array
	System.out.println("\nNow testing binSearch on Rational array...");
        Rational[] rArr = new Rational[10];
	for( int i = 0; i < rArr.length; i++ ) {
	    rArr[i] = new Rational( (int)(100 * Math.random()), 
				    (int) (100 * (Math.random()) ));		
	}
	
	//search for the value in slot 3 in array
	System.out.println( "Searching for " + rArr[3] + "..." );
	System.out.println( binSearch(rArr, rArr[3] ) );
	//search for 1/2 in array
	System.out.println( binSearch(rArr, new Rational(1, 2) ) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }//end main()
	/*==================================================
	==================================================*/
}//end class BinSearch
