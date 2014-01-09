//DANIEL ZABARI
//pd 9
//HW49
//14-01-09
/*====================================
  class Matrix -- models a square matrix

  TASK: Implement methods below, categorize runtime of each. 
        Test in your main method.
  ====================================*/ 

public class Matrix {

    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] _matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix() {
	_matrix=new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    } //O(1)


    //constructor intializes an a*a matrix
    public Matrix( int a ) {
	_matrix=new Object[a][a];
    }//O(1)


    //return size of this matrix, where size is 1 dimension
    private int size() {
	int total=0;
	for (int i=0;i<_matrix.length;i++)
	    total+=_matrix[i].length;
	return total;
    }//O(n)


    //return the item at the specified row & column   
    private Object get( int r, int c ) {
	return _matrix[r][c];
    }//O(1)


    //return true if this location is empty, false otherwise
    private boolean isEmpty( int r, int c ) {
	return _matrix[r][c]==null;
    }//O(1)


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) {
	Object oldVal=_matrix[r][c];
	_matrix[r][c]=newVal;
	return oldVal;
    }//O(1)


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() {
	String retStr="";
	for (int i=0;i<_matrix.length;i++){
	    retStr+="|";
	    for (int j=0;j<_matrix[i].length;j++){
		retStr+="\t"+_matrix[i][j];
	    }
	    retStr+="\n|\n";
	}
	int x=_matrix[0].length*3;
	while (x>0){
	    retStr+="-";
	}
	return retStr;
    }//O(n^2)


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) {
	return this.toString()==rightSide.toString();
    }//O(1)  not including the toString() call.  WIth it, it becomes O(n^2).


    //return true if target is in this matrix; false otherwise
    public boolean isFound( Object target ) {
	boolean retBoo=false;
	for (int i=0;i<_matrix.length;i++){
	    for (int j=0;j<_matrix[i].length;j++){
		retBoo=_matrix[i][j].equals(target);
		if (retBoo)
		    return retBoo;
	    }
	}
	return retBoo;
    }//O(n^2)


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) { 
	for (int i=0;i<_matrix.length;i++){
	    this.set(i,c1,(this.set(i,c2,this.get(i,c1))));
	}
    }//O(n)


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) {
	for (int i=0;i<_matrix[0].length;i++){
	    this.set(r1,i,(this.set(r2,i,this.get(r1,i))));
	}
    }//O(n)


    //main method for testing
    public static void main( String[] args ) {

    }

}//end class Matrix
