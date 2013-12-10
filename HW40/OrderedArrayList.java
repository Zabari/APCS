/*============================================
   class OrderedArrayList
   Wrapper class for ArrayList.
   Imposes the restriction that stored items 
   must remain sorted in ascending order
   ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data=new ArrayList();
    }


    public String toString() { 
	String retStr="[";
	if (_data.size()>=1){
	    for (Comparable c: _data){
		retStr+=c+", ";
	    }
	}
	retStr=retStr.substring(0,retStr.length()-2)+"]";
	return retStr;
    }


    public Comparable remove( int index ) { 
	return _data.remove(index); 
    }


    public int size() { 
	return _data.size(); 
    }

    
    public Comparable get( int index ) { 
	return _data.get(index);
    }


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear(Comparable newVal) { 
	// *** YOUR IMPLEMENTATION HERE ***
    }


    // addBinary takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a binary search to find appropriate index
    public void addBinary(Comparable newVal) { 
	int tPos = -1;
        int m = (lo + hi) / 2; 

        while( lo <= hi ) { 
	    m = (lo + hi) / 2;

 
            if ( a[m].compareTo(target) == 0 ) 
                return m;


            else if ( a[m].compareTo(target) > 0 ) 
                hi = m - 1;
            else if ( a[m].compareTo(target) < 0 ) 
                lo = m + 1;
        }
	_data.add(tPos,newVal);

    }	


    // main method solely for testing purposes
    public static void main( String[] args ) {

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	OrderedArrayList Franz = new OrderedArrayList();

	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.addLinear( (int)( 50 * Math.random() ) );
	System.out.println( Franz );

	// testing binary search
	Franz = new OrderedArrayList();
	for( int i = 0; i < 15; i++ ) 
	    Franz.addBinary( (int)( 50 * Math.random() ) );
	System.out.println( Franz );
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
