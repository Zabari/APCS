// DANIEL ZABARI
// pd 9
// HW13
// 2013-10-15


public class Driver {
    private static double temp;
    private static String ret;
    private static double bigPot;
    

    public static String randCoin(double bala){
	int num=(int) (Math.random()*5);
	String coin="";
	if (num==0)
	    coin="dollar";
	if (num==1)
	    coin="half-dollar";
	if (num==2)
	    coin="quarter";
	if (num==3)
	    coin="dime";
	if (num==4)
	    coin="nickel";
	if (num==5)
	    coin="penny";
	if (bala<1 && coin=="dollar")
	    coin="half-dollar";
	if (bala<.50 && coin=="half-dollar")
	    coin="quarter";
	if (bala<.25 && coin=="quarter")
	    coin="dime";
	if (bala <.10 && coin=="dime")
	    coin="nickel";
	if (bala<.05 && coin=="nickel")
	    coin="penny";
	return coin;
    }

    public static void main( String[] args ) {

	BankAccount me=new BankAccount("Me", "narcissist" );
	BankAccount you=new BankAccount("You","whocares" );
	BankAccount pot=new BankAccount("Pot", "notyoursyet");
	me.deposit(20);
	you.deposit(20);
	Coin mine = new Coin(randCoin(me.getBal()));
	Coin yours = new Coin(randCoin(you.getBal()));
	
	while (you.getBal()>0 || me.getBal()>0){
	    mine.setName(randCoin(me.getBal()));
	    yours.setName(randCoin(me.getBal()));


	    me.withdraw(mine.getVal());
	    you.withdraw(yours.getVal());
	    pot.deposit(yours.getVal()+mine.getVal());
	    if (pot.getBal()>bigPot)
		bigPot=pot.getVal;




	    yours.flip();
	    mine.flip();



	    if ( yours.nameEquals(mine) ) {
		if ((yours.getFace()).equals("tails")){
		    temp=pot.getBal();
		    you.deposit(temp);
		    pot=new BankAccount("Pot", "notyoursyet");	
		    ret="Tails.  Money goes to you.";
		}else {
		    temp=pot.getBal();
		    me.deposit(temp);
		    pot=new BankAccount("Pot", "notyoursyet");
		    ret="Heads. Money goes to me.";
		}
	    }else{
		ret= "No match. Money goes to the pot.";
	    }
	    System.out.println("\nAfter flipping "+ mine.flipCtr +" times..." );
	    System.out.println("\nmy Coin: " + mine +me);
	    System.out.println("your Coin: " + yours +you);
	    System.out.println("\nthe Pot: " + pot);
	    System.out.println(ret);
	}
	System.out.println(flipCtr+" games played.  Biggest pot: "+bigPot);
	if (you.getBal()>0){
	    System.out.println("YOU is the winner.");
	}else{
	    System.out.println("ME is the winner.");
	}
	System.out.println("\nmy Account: "+me);
	System.out.println("your Account: " +you);
	System.out.println("\nthe Pot: " + pot);

    }//end main

}//end class
