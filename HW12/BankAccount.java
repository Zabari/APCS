// DANIEL ZABARI
// pd 9
// HW12
// 2013-10-10


public class BankAccount {

    //instance variables
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;


    /* default constructor: initializes instance vars to default vals
       precondition:  none
       postcondition: instance vars have appropriate default vals
       ````````````````````````````````````````````````````*/
    public BankAccount() {

        setName("Daniel Zabari");
	setPasswd("WeloveDaniel");
	pin=9999;
	acctNum=999999999;
	setBalance(0);


    }

    public BankAccount( String newName, String newPass) {
	this();
	setName(newName);
	setPasswd(newPass);

    }


    /* overloaded constructor: allows caller to specify instance vars
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( String newName, String newPass, 
			int newPin, int newAcctNum, double newBal ) {

	setName(newName);
	setPasswd(newPass);
	setPin(newPin);
	setAcctNum(newAcctNum);
	setBalance(newBal);


    }


    //mutators
    // Each updates its instance var according to input,
    // then returns the old value.
    public String setName( String newName ) {
	String oldName = name;
	name = newName;
	return oldName;
    }

    public String setPasswd( String newPasswd ) {
	String oldPasswd = passwd;
	passwd = newPasswd;
	return oldPasswd;
    }


    /* setPin(int):   update PIN
       precondition:  newPin is an integer
       postcondition: if newPin is acceptable, update pin.
                      If unacceptable, do not update. Print explanatory msg.
                      Return old value.
       ````````````````````````````````````````````````````*/
    public int setPin( int newPin ) {

	int oldPin = pin;

	// Replace the line below with your decision-making 
	// and diagnostic-info-printing code
	if (newPin>=1000 && newPin<9999){

	    pin=newPin;

	} else {

        System.out.println("Your number is invalid. Pin must be in interval [1000, 9998].");

	}
	return oldPin;
    }


    /* setAcctNum(int):  update account number
       precondition:  newAcctNum is an integer
       postcondition: if newAcctNum is acceptable, update acctNum.
                      If unacceptable, do not update. Print explanatory msg.
                      Return old value.
       ````````````````````````````````````````````````````*/
    public int setAcctNum( int newAcctNum ) {

	int oldAcctNum = acctNum;

	// Replace the line below with your decision-making 
	// and diagnostic-info-printing code
	if (newAcctNum >=100000000 && newAcctNum <999999999){

	    acctNum = newAcctNum;

	} else {

	    System.out.println("Error. Account number must be in interval [100000000, 999999998].");
	    return oldAcctNum;

	}
	return oldAcctNum;
    }

    private double setBalance( double newBalance ) {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
    }


    /* deposit(double) --  method for depositing into account
       precondition:  depAmnt is a non-negative floating-pt num
       postcondition: balance is incremented by depAmnt. 
                      Returns true if successful, false otherwise.
       ````````````````````````````````````````````````````*/
    public boolean deposit( double depAmnt ) {

	double oldBal=balance;
	setBalance(balance + depAmnt);
	if (balance ==oldBal+depAmnt) {

	    return true;
	} else {

	    return false;
	}
    }


    /* withdraw(double) --  method for withdrawing from account
       precondition:  balance is non-negative and at least 
                      as large as wdAmnt
       postcondition: balance is decremented by wdAmnt
                      Returns true if successful, false otherwise.
       ````````````````````````````````````````````````````*/
    public boolean withdraw( double wdAmnt ) {
	boolean tVal=false;
        double oldBal=balance;
	if (oldBal-wdAmnt >=0) {

	    setBalance(balance-wdAmnt);
	    tVal=true;
	
	} else {

	    System.out.println("You don't got enough monies.");
	   
	}
	return tVal;
    }

    public boolean authenticate( int n, String p ) {

	boolean tVal=false ;

        if (n == pin){
	    if (p==passwd){

		tVal=true;
	    
	    } else {

		System.out.println("Wrong password.");
	    }
	} else {

	    System.out.println("PIN is wrong.");
	}
	return tVal;
    }


    //overwritten toString()
    public String toString() {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args ) {

	/* Write code here to verify all functionality of this class.
	   Use the code below as a starting point,
	   and as more as necessary. -TM
	 */

	//declare new BankAccount object and print it
	BankAccount myAcct = new BankAccount();
	System.out.println(myAcct);

	//update myAcct's attributes and print again
	myAcct.setName( "Heyward Jabuzov" );
	myAcct.setPasswd( "mypassismadsecureyo" );
	myAcct.setPin( 1234 );
	myAcct.setAcctNum( 123456789 );
	myAcct.setBalance( 1000000 );
	myAcct.deposit( 1.30 );

	System.out.println(myAcct);

	//test non-mutator methods...
	myAcct.withdraw( 0.0 );
	System.out.println(myAcct);
	myAcct.withdraw( 0 );
	System.out.println(myAcct);
	myAcct.deposit( 42 );
	System.out.println(myAcct);
	myAcct.withdraw( 42.0 );
	System.out.println(myAcct);
	myAcct.withdraw( 42.0 );
	System.out.println(myAcct);

	//provoking errors...
	myAcct.withdraw( 1000000000 ); //should prompt error
	System.out.println(myAcct);
	myAcct.setPin( 123 ); //should prompt error
	System.out.println(myAcct);
	myAcct.setAcctNum( 12345678 ); //should prompt error
	System.out.println(myAcct);

	//Our tests
	BankAccount ourBankAccount= new BankAccount("Dis my name", "Dis my pass");
	System.out.println(ourBankAccount);

    }

}//end class BankAccount
