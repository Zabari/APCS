//driver file for class Person
import cs1.Keyboard;
public class PersonApp {
    private static String nose;
    private static String eyes;
    private static String mouth;
    private static String hair;
    private static String face;


    public static void main( String[] args ) {

	// Uncomment one section at at time, below, to test
	// your Person class. (Hint: Use C-k, C-y to move the 
	// top bar down...



	Person Kirk = new Person();
	System.out.println("Testing Kirk...");
	System.out.println(Kirk); //should show def.face & Will's name

	Person Spock = new Person("Leonard", "Nimoy");
	System.out.println("Testing Spock...");
	System.out.println(Spock); //should yield "null" & Leonard's name

	Person Scotty = new Person("James", "Doohan", 
				   new Face("|||||||",
					    "| X X |",
					    "|( 0 )|", 
					    "|  v  |"));
	System.out.println("Testing Scotty...");
	System.out.println(Scotty); //should yield ASCII face & James's name
	Scotty.setFace(Kirk.setFace(Scotty.getFace()));
	System.out.println("After their nose jobs:");
	System.out.println(Kirk);
	System.out.println(Spock);
	System.out.println(Scotty);
	Scotty.setFirstName(Spock.setFirstName(Scotty.getFirstName()));
	System.out.println("After their identity crises:");
	System.out.println(Kirk);
	System.out.println(Spock);
	System.out.println(Scotty);
	System.out.println("Changing Kirk:");
	System.out.print("\nNew hair:");
	hair=Keyboard.readString();
	System.out.print("\nNew eyes:");
	eyes=Keyboard.readString();
	System.out.print("\nNew nose:");
	nose=Keyboard.readString();
	System.out.print("\nNew mouth:");
	mouth=Keyboard.readString();
        Face face= new Face(hair,eyes,nose,mouth);
	Kirk.setFace(face);
	System.out.println("New Face:");
	System.out.println(Kirk);


    }

}//end class PersonApp
