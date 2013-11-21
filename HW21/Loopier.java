// DANIEL ZABARI
// pd 9
// HW21
// 2013-11-03

/*==================================================
  class Loopier
  An exercise in basic array work, iterative and recursive repetition.
  ==================================================*/

public class Loopier {
    private static int index=0;

    /*==================================================
      int freqFor(int[],int) -- uses FOR loop to search int array for target
      post: returns num of times target occurs in array
      ==================================================*/
    public static int freqFor ( int[] a, int target ) {
	int n=0;
	for (int i=0;i<a.length;i++){
	    n+=(a[i]==target ? 1:0);
	}
	return n;
    }		

    /*==================================================
      int freqForEach(int[],int) -- uses FOREACH loop to search int array 
      post: returns num of times target occurs in array
      ==================================================*/
    public static int freqForEach ( int[] a, int target ) {
	int n=0;
	for (int i:a){
	    if (i==target){
		n+=1;
	    }
	}

	return n; 
    }



    /*==================================================
      int freqWhile(int[],int) -- uses WHILE loop to search int array 
      post: returns num of times target occurs in array
      ==================================================*/
    public static int freqWhile ( int[] a, int target ) {
	int x=0;
	int n=0;
	while (x<a.length){
		if (a[x]==target){
		    n+=1;
			}
		x+=1;
	    }
	

	return n;
    }


    /*==================================================
      int linSearchR(int[],int) -- recursively searches array of ints for target
      post: returns -1 if target not found
      ==================================================*/
    //hint: you may want to initialize a var outside the method...    
    public static int linSearchR ( int[] a, int target ) {
	int i;
	if (index<a.length){
	    if (!(a[index]==target)){
		index+=1;
		return linSearchR(a,target);
	    }else{
		i=index;
		index=0;
		return i;
	    }
	}
	return -1;
    }

    
    /*==================================================
      int linSearch(String[],String) -- searches an array of Strings for target
      post: returns -1 if target not found
      ==================================================*/
    public static int linSearch ( String[] a, String target ) {
	int i=0;
	for (String s:a){
	    if (s.equals(target)){
		return i;
	    }
	    i+=1;
	}
	return -1;
    }


    //main method for testing
    public static void main ( String[] args ) {

	//TIP: kill & yank the top comment bar down one section 
	//     at a time to test your methods as they develop.


	System.out.println("\nNow testing linSearchR on int array...");
	//declare and initialize an array of ints
	int[] x = { 2, 4, 6, 8, 6, 42 };

	//search for 6 in array x
	System.out.println( linSearchR(x,6) );

	//search for 43 in array x
	System.out.println( linSearchR(x,43) );

	System.out.println("\nNow testing linSearch on String array...");
	//declare and initialize an array of Strings
	String[] y = { "kiwi", "watermelon", "orange", "apple", 
		       "peach", "watermelon" };

	//search for "watermelon" in array y
	System.out.println( linSearch(y,"watermelon") );

	//search for "lychee" in array y
	System.out.println( linSearch(y,"lychee") );


	//declare and initialize an array of ints
	int[] z = { 1, 5, 3, 5, 1, 5 };

	//compute frequency of 5 in array z
	int q = 5;
	System.out.println( freqFor ( z, q ) );
	System.out.println( freqForEach ( z, q ) );
	System.out.println( freqWhile ( z, q ) );

	//compute frequency of 2 in array z
	int r = 2;
	System.out.println( freqFor(z,r) );
	System.out.println( freqForEach(z,r) );
	System.out.println( freqWhile(z,r) );

	/*==================================================
	==================================================*/
    }//end main()

}//end class Loopier
