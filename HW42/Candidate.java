/*=====================================
  class Candidate -- represents a candidate for a position

  Each candidate object contains the following
  methods that you need to use:

  getPostion() returns the position the Candidate wants
  getInterviewScore() returns the Candidate's grade.
  =====================================*/

//We usually leave this out because Java does this automatically:
import java.io.*; 
//...but this is not automatically performed (util pkg contains ArrayList):
import java.util.*;


public class Candidate {

    //instance vars (attributes)     
    int id;
    String position;
    double score;


    //constructor
    public Candidate( int idnum, String pos, double s ) {
	id = idnum;
	position = pos;
	score = s;
    }


    //~~~~~~~~~~~ACCESSORS~~~~~~~~~~~
    public String getPosition() {
	return position;
    }

    public double getInterviewScore() {
	return score;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    //overridden toString -- returns String representation of a Candidate
    public String toString() {
	return id + " " + position + " " + score;
    }
    
}//end class Candidate

    
