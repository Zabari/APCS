// class Person
// for practice with instance vars that are Objects

public class Person {

    // instance variables 
    private String _firstName, _lastName;
    private Face _myFace;
    private Body _myBody;

    // CONSTRUCTORS
    // default: William Shatner with a default Face
    public Person() {
       	_firstName = "William";
	_lastName = "Shatner";
	_myFace = new Face();
	_myBody = new Body();
/* Q: What happens if comment out?  Person has no face. */
    }

    // 1st overload: initialize _firstName, _lastName, set _myFace to null
    public Person( String firstName, String lastName ) {
	_firstName = firstName;
	_lastName = lastName;
    }

    // 2nd overload: initialize _firstName, _lastName, _myFace
    public Person( String firstName, String lastName, Face face ) {

	this(firstName,lastName);
	_myFace=face;	

    }

    // ACCESSORS
    public String getFirstName( ) { return _firstName; }
    public String getLastName( )  { return _lastName; }
    public Face getFace( )        { return _myFace; }

    // MUTATORS
    // each returns old value
    public String setFirstName(String firstName) { 
	String old = _firstName;
	_firstName = firstName;
	return old;
    }
    public String setLastName(String lastName) {
	String old = _lastName;
	_lastName = lastName;
	return old;
    }
    public Face setFace(Face newFace) {
	Face old = _myFace;
	_myFace = newFace;
	return old;
    }

    public String toString() {
	return _myFace+"\n" +_myBody+ "\n" +  _firstName + " " +  _lastName;
    }

}//end class Person
