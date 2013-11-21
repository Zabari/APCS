
public class Face {

    // instance vars
    private String _hair, _eyes, _nose, _mouth;

    // constructor
    public Face() {
	_hair  = "&&&&&&&";
	_eyes  = "| 0 0 |";
	_nose  = "|  u  |";
	_mouth = "| (-) |";
    }

    // overloaded constructor		
    // REPLACE THIS LINE WITH YOUR OVERLOADED CONSTRUCTOR
    public Face( String newHair, String newEyes, String newNose, String newMouth ) {
	_hair  = newHair;
	_eyes  = newEyes;
	_nose  = newNose;
	_mouth = newMouth;
   }

    // accessor methods provide read-only access to instance vars
    public String getHair() {
	return _hair;
    }
    public String getEyes() {
	return _eyes;
    }
    public String getNose() {
	return _nose;
    }
    public String getMouth() {
	return _mouth;
    }

    // mutator methods modify instance variables
    // postcondition: updates instance var and returns old value

    // setHair() updates the _hair attribute and returns the old hairstyle
    public String setHair(String hair) { 
	String oldHair = _hair; //create temp var to store current hairstyle
	_hair = hair;           //update hairstyle attribute
	return oldHair;         //output old hairstyle
    }
    public String setEyes(String eyes) { 
	String oldEyes = _eyes; 
	_eyes = eyes;
	return oldEyes;
    }
    public String setNose(String nose) { 
	String oldNose = _nose; 
	_nose = nose;
	return oldNose;
    }
    public String setMouth(String mouth) { 
	String oldMouth = _mouth; 
	_mouth = mouth;
	return oldMouth;
    }

    // override toString
    public String toString() {
	String ans = _hair + "\n" + _eyes + "\n" + _nose + "\n" + _mouth;
	return ans;
    }

    // main() will be commented out once fxnality verified, using /* & */
    public static void main (String[] args) {
	/*	Face dude = new Face();
	System.out.println("An instance of class Face has been created:");
	System.out.println( dude );
	System.out.println("Calling accessor methods...");
	System.out.println("hair:\t" + dude.getHair());
	System.out.println("eyes:\t" + dude.getEyes());
	System.out.println("nose:\t" + dude.getNose());
	System.out.println("mouth:\t" + dude.getMouth());
	System.out.println("\nCalling mutator methods...");
	System.out.println("old hair:\t" + dude.setHair("|||||||"));
	System.out.println("dude's new look:\n" + dude );

	// testing overloaded constructor...
	// UNCOMMENT THE BLOCK BELOW WHEN YOU ARE READY TO TEST YOUR 
	// OVERLOADED CONSTRUCTOR...

	Face Lebowski = new Face("|||||||", "| x 0 |", "|  v  |", "|  u  |");
	System.out.println("Lebowski:");
	System.out.println(Lebowski);
	*/
    }

}
