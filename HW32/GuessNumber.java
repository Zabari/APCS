// DANIEL ZABARI
// pd 9
// HW32
// 2013-11-26
/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

/*==================================================
  the Breakdown:
What is the max # of guesses if num is b/t 1&100? 100
What is the max # of guesses if num is b/t 1&200? 200
What is the max # of guesses if num is b/t 1&400? 400
What is the max # of guesses if num is b/t 1&1000? 1000
What is the max # of guesses if num is b/t 1&n? n
(Is this what you were asking?  It somehow seems too easy.  If you meant min(in worst case scenario), I think it's something like sqrt(n)).
  ==================================================*/


import cs1.Keyboard; /* must have cs1 dir in same dir as this file 
			for this to work */

public class GuessNumber {

    //instance vars
    private int _lo, _hi, _guessCtr, _target;



    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
            _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) {
	_lo = a;
	_hi = b;	
	_guessCtr = 0;
	_target = a + ((int) ((b-a)*Math.random()));
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
                        Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() {
	System.out.println("Guess a number between " + _lo + " and " + _hi + "!");
	int guess = Keyboard.readInt();
	_guessCtr++;
	String correct = "You got it! Wow! I wasn't expecting that!";
	String tooLow = "A bit too low... Try again!";
	String tooHigh = "A bit too high... Try again!";
	System.out.println(guess==_target ? correct : guess < _target ? tooLow : tooHigh);
	if (!(guess<_lo || guess>_hi)){
	    if (guess<_target)
		_lo=guess+1;
	    else if (guess > _target)
		_hi=guess-1;
	}
	if (!(guess==_target))	
	    playRec();
	
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
                         Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() {
	int guess;
	String correct = "You got it! Wow! I wasn't expecting that!";
	String tooLow = "A bit too low... Try again!";
	String tooHigh = "A bit too high... Try again!";	
	do {
	    System.out.println("Guess a number between " + _lo + " and " + _hi + "!");
	    guess=Keyboard.readInt();
	    _guessCtr++;
	    System.out.println(guess==_target ? correct : guess < _target ? tooLow : tooHigh);
	    if (!((guess<_lo) || (guess>_hi))){
		if (guess<_target)
		    _lo=guess+1;
		else if (guess > _target)
		    _hi=guess-1;
	    }
	} while (guess!=_target);
	

    }


    //wrapper for playRec/playIter to simplify calling
    public void play() { 
	//use one or the other below:
	//playRec();
	playIter();
    }


    //main method to run it all
    public static void main( String[] args ) {

	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
    }


    /*==================================================
      _ _(_) -- 
      pre:  
      post: 
      ==================================================*/
}//end class
