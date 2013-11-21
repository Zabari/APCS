// DANIEL ZABARI
// pd 9
// HW06
// 2013-09-30

public class BankAccount {

    public String fullName;
    public String pass;
    public int pin;
    public int acc;
    public double balance;

    public void setName ( String name) {

	fullName=name;
    }
    


    public void setPass (String passs) {
	pass=passs;
    }
    

    public void setPin (int sPin) {
	pin=sPin;
    }
    

    public void setAccNum (int sAcc) {
	acc=sAcc;
    }
    

    public void setBal (double bal) {
	balance=bal;
    }

    public String info () {
	String info = ("Name: "+fullName+"\n"+"Pass: "+ pass +"\n" + "PIN: "
		       + pin +"\n"+ "Account Number: "+acc+"\n"+ "Balance: "+
		       balance);
	return info;
    }

    public void withdraw (float amt) {
	setBal(balance-amt);
    }

    public void deposit (float amt) {
	setBal(balance+amt);
    }
}

