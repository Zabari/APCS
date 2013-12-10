// DANIEL ZABARI
// pd 9
// HW40
// 2013-12-10
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
	int i=0;

	    while (i<_data.size()&& (_data.get(i).compareTo(newVal)<=0)){
		i++;
	    }
	    _data.add(i,newVal);

	
    }


    // addBinary takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a binary search to find appropriate index
    public void addBinary(Comparable newVal) { 
	int hi=0;
	int lo=0;
	if (_data.size()>0){
	    if (_data.get(_data.size()-1).compareTo(newVal)<0){
		_data.add(newVal);
	    }
	    else if (_data.get((_data.size()-1)/2).compareTo(newVal)>0){
		hi=_data.size()-1/2;
		lo=0;;
	    }
	    else{
		hi=_data.size()-1;
		lo=(_data.size()-1)/2;
	    }
	    int m = (lo + hi) / 2; 

	    while( lo <= hi ) { 
		m = (lo + hi) / 2;
 
		if ( _data.get(m).compareTo(newVal) >0)
		    hi=m-1;

		else if (_data.get(m).compareTo(newVal)<0)
		    lo = m + 1;
		else if (_data.get(m).compareTo(newVal)==0){
		    _data.add(m,newVal);
		    break;
		}
		if (hi-lo<=1){
		    if (_data.get(lo).compareTo(newVal)>0){
			_data.add(lo, newVal);
			break;
		    }
		    else if (_data.get(hi).compareTo(newVal)>0){
			_data.add(hi, newVal);
			break;
		    }
		    else if (_data.get(hi).compareTo(newVal)<0){
			_data.add(hi+1, newVal);
			break;
		    }
		}
	    }
	}
	else {_data.add(0,newVal);}
    }	


    // main method solely for testing purposes
    public static void main( String[] args ) {


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
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
