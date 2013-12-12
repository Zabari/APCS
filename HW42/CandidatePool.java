// CHRIS KIM; DANIEL ZABARI; PETER DUCHOVNI; Team of three?
// pd 9
// HW42
// 2013-12-12
/*=====================================
  class CandidatePool -- 

  Each CandidatePool object contains the following
  instance variables that you may need to use:
       
  pool
      An ArrayList of only Candidate objects


  You will need to write the following methods:
   
  getCandidatesForPosition( String pos )
      Returns a candidate-only ArrayList containing all
      the Candidates in pool that have position pos.

  getBestCandidate( String pos )
      Returns the Candidte in pool that matches position
      pos with the highest score.
      If there are no candidates for the given position, 
      returns null.

  removeCandidatesForPosition( String pos )
      Removes all the Candidates in the pool that match
      position pos.
      Returns number of candidates removed.
  =====================================*/

//We usually leave this out because Java does this automatically:
import java.io.*; 
//...but this is not automatically performed (util pkg contains ArrayList):
import java.util.*;


public class CandidatePool {
    
    //=================================
    //DO NOT MODIFY THIS CODE BLOCK
    ArrayList<Candidate> pool;
    
    public CandidatePool() {
	pool = new ArrayList<Candidate>();
    }

    public void addCandidate( Candidate c ) {
	pool.add(c);
    }

    public String toString() {
	return pool.toString();
    }    
    //=================================



    public ArrayList<Candidate> getCandidatesForPosition( String pos ) {

	ArrayList<Candidate> posCand = new ArrayList<Candidate>();
	for (int i = 0; i < pool.size(); ++i) {
	    if (pool.get(i).getPosition() == pos) {
		posCand.add(pool.get(i));
	    }
	}
	return posCand;
    }


    public Candidate getBestCandidate( String pos ) { 
	Candidate best = (Candidate) null;
	double bestScore=0;
	ArrayList<Candidate> posPool = getCandidatesForPosition(pos);
	
	for (int i = 0; i < posPool.size(); ++i) {
	    if (i == 0) {
		best = posPool.get(0);
	    } else {
		if (posPool.get(i).getInterviewScore() > bestScore)
		    best = posPool.get(i);
	    }
	    bestScore = best.getInterviewScore();
	}
	return best;
    }


    public int removeCandidatesForPosition( String pos ) {
	int len=pool.size();
	for (int i = 0; i < pool.size(); ++i) {
	    if (pool.get(i).getPosition() == pos) {
		pool.remove(i);
	    }
	}
	return len-pool.size();
    }
    


}//end class CandidatePool

    
