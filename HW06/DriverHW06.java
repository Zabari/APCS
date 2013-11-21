//driver for class BankAccount
public class DriverHW06 {

    public static void main( String[] args ) {

	// Create an object of the BankAccount class and 
	// print it immediately afterward.
	// Q: What do you notice?
	BankAccount myAcct = new BankAccount();
	System.out.println(myAcct);

	// After overwriting BankAccount's toString() method,
	// observe how the output differs...
	System.out.println(myAcct);

	// Then, after using your accessors and mutators to update 
	// the instance variables of your object, print again...
	System.out.println(myAcct);

    }

}//end Driver for BankAccount