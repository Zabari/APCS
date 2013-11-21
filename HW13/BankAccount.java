// DANIEL ZABARI
// pd 9
// HW13
// 2013-10-15


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

    private void setBalance( double newBalance ) {
	balance = newBalance;
    }


    /* deposit(double) --  method for depositing into account
       precondition:  depAmnt is a non-negative floating-pt num
       postcondition: balance is incremented by depAmnt. 
                      Returns true if successful, false otherwise.
       ````````````````````````````````````````````````````*/
    public void deposit( double depAmnt ) {

	setBalance(balance + depAmnt);
    }


    /* withdraw(double) --  method for withdrawing from account
       precondition:  balance is non-negative and at least 
                      as large as wdAmnt
       postcondition: balance is decremented by wdAmnt
                      Returns true if successful, false otherwise.
       ````````````````````````````````````````````````````*/
    public void withdraw( double wdAmnt ) {
	if (balance-wdAmnt >=0) {

	    setBalance(balance-wdAmnt);
	
	} else {

	    System.out.println("You don't got enough monies.");
	   
	}
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
    public double getBal(){
	return balance;
    }


}//end class BankAccount
