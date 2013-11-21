// DANIEL ZABARI
// pd 9
// HW16
// 2013-10-21

public class Repeater{

    public static String fenceF(int posts){
	String s=new String("");
	for (int x=0; x<posts; x++){
	    if (x==0)
		s+="|";
	    else
		s+="--|";
	}
	return s;
    }

    public static String fenceR(int posts){
	String s=new String("");
	if (posts==1)
	    s+="|";
	else
	    s+="|--"+ fenceR(posts-1);
	return s;
    }

    public static String reverseF(String s){
	String ns=new String("");
	for (int x=s.length()-1; x>=0; x--){
	    ns+=s.substring(x);
	    s=s.substring(0,x);
	}
	return ns;
    }

    public static String reverseR(String s){
    	String ns=new String("");
    	if (s.length()>0){
    	    ns=s.substring(s.length()-1)+reverseR(s.substring(0,s.length()-1));
	}else {
	    ns=s;}
   	return ns;
    } 




    public static void main(String [] args){
	System.out.println(fenceF(7));
	System.out.println(fenceR(7));
	System.out.println(reverseF("hithere"));
	System.out.println(reverseR("hithere"));

    }
}
