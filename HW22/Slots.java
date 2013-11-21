//class Slots
//simulates a slot machine in your very own terminal

public class Slots {


    private static final String[] FRUITS = { "orange", "orange", "orange", 
					     "lime", "lime", "lime", 
					     "lemon", "lemon", "lemon", 
					     "peach", "peach", "peach"};
    private String[] _fruits;


    /*=====================================
      Slots() -- default constructor
      pre:  constant array FRUITS exists, has been initialized
      post: mutable array _fruits contains same elements as FRUITS
      =====================================*/
    public Slots() {

	_fruits=new String[FRUITS.length];
	for (int i=0;i<_fruits.length;i++){
	    _fruits[i]=FRUITS[i];
	}

    }


    /*=====================================
      String toString() -- overrides inherited toString()
      pre:  
      post: returns String of elements in slots 0 thru 1, separated by tabs
      =====================================*/
    //return String of first three fruits separated by tabs
    public String toString() {

	return _fruits[0]+"     "+_fruits[1]+"     "+_fruits[2];
    }


    /*=====================================
      void swap(int,int) -- array swap util fxn
      pre:  _fruits array exists
      post: elements at indices i, j are swapped
      =====================================*/
    //swap vals at indices i and j.
    private void swap( int i, int j ) {
	String t=_fruits[i];
	_fruits[i]=_fruits[j];
	_fruits[j]=t;

    }


    /*=====================================
      void spinOnce() -- simulate a pull of the slot machine lever
      pre:  _fruits is existing array
      post: randomized order of elements in _fruits array
      =====================================*/
    public void spinOnce() {

	for (int i=0;i<_fruits.length;i++){
	    swap(i, (int) (Math.random()*_fruits.length));
	}

    }


    /*=====================================
      boolean FTW() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
            false otherwise
      =====================================*/
    public boolean FTW() {

	return _fruits[0].equals(_fruits[1]) && _fruits[0].equals(_fruits[2]);

    }


    //main() method for testing
    public static void main( String[] args ) {

	Slots hey=new Slots();
	System.out.println(hey);
	System.out.println(hey.FTW());
	hey.swap(1,5);
	System.out.println(hey);
	System.out.println(FRUITS);
	System.out.println(hey._fruits);
	hey.spinOnce();
	System.out.println(hey);
	hey.spinOnce();
	System.out.println(hey);
	hey.spinOnce();
	System.out.println(hey);



    }

}//end class Slots
