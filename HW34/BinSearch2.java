// DANIEL ZABARI
// pd 9
// HW33
// 2013-11-27
public class BinSearch2 {


    /*==================================================
      int binSearch(int[],int) -- searches an array of ints for target int
      pre:  input array is sorted in ascending order
      post: returns index of target, or returns -1 if target not found
      ==================================================*/
    public static int binSearch ( int[] a, int target ) {
	//uncomment exactly 1 of the 2 stmts below:
	return binSearchIter( a, target, 0, a.length-1 );
	//return binSearchRec( a, target, 0, a.length-1 );
    }


    public static int binSearchRec( Comparable[] a, Comparable target, int lo, int hi ) {
	int i=(int) ((lo+hi)/2);
	if (lo==hi && (a[i].compareTo(target)!=0) )
	    return -1;
	return (a[i]==target)? i : (a[i]>target)? binSearchRec(a,target,lo ,i-1) : binSearchRec(a,target,i+1,hi);
    }

    public static int binSearchIter( Comparable[] a, Comparable target, int lo, int hi ) {
	int i;
	while (lo!=hi){
	    i= (int) ((lo+hi)/2);
	    if (a[i].compareTo(target)==0)
		return i;
	    if (a[i].compareTo(target)>0)
		hi=i-1;
	    else if (a[i].compareTo(target)<1)
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
    private static void printArray( int[] arr ) {
	String output = "[ "; 

	for( int i : arr )
	    output += i + ", ";

	output = output.substring( 0, output.length()-2 ) + " ]";

	System.out.println( output );
    }


    //main method for testing
    public static void main ( String[] args ) {



	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	System.out.println("\nNow testing binSearch on int array...");

	//Declare and initialize array of ints
	int[] iArr = { 2, 4, 6, 8, 6, 42 };
	printArray( iArr );
	System.out.println( "sorted? -- " + isSorted(iArr) );

	int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
	printArray( iArr2 );
	System.out.println( "sorted? -- " + isSorted(iArr2) );
	Comparable[] cArr= {"hi","holla","holaaaaa"};
	Comparable[] cArr2= {"hi","hola","holla"};
	System.out.println(isSorted(cArr));
	System.out.println(isSorted(cArr2));


	//search for 6 in array 
	System.out.println( binSearch(iArr,6) );
	//search for 43 in array 
	System.out.println( binSearch(iArr,43) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/*==================================================
	==================================================*/

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }//end main()

}//end class BinSearch
