// DANIEL ZABARI
// pd 9
// HW17
// 2013-10-22

public class Commas{

    public static String commafyR(int n){
	String s=new String(""+n);
	String ns=new String("");
	if (s.length()<=3)
	    return s;
	if (s.length() > 3){
	    ns=commafyR(n/1000)+","+s.substring(s.length()-3);
	}
	return ns;
    }

    public static String commafyF(int n){
	String s=new String(""+n);
	String ns=new String("");
	for (int x=s.length();x>0; x-=3){
	    if (x <= 3){
		ns=s.substring(0,x) +ns;
	    }
	    else{
		ns=","+ s.substring(x-3,x)+ns;
	    }
	}
	return ns;
    }

    public static void main(String [] args){
	int wow;
	for (String s:args){
	    wow=Integer.parseInt(s);
	    System.out.println(commafyR(wow));
	    System.out.println(); 
	    System.out.println(commafyF(wow));
	    System.out.println();
	}



	    }
}

