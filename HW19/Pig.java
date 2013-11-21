// DANIEL ZABARI
// pd 9
// HW19
// 2013-10-29

public class Pig {

    private static final String VOWELS = "aeiouyAEIOUY";
    private static final String PUNCT=" .,:;\'\"/?!-()[]{}";


    public static int punctIndex(String w){
	int n=-1;
	for (int i=0;i<w.length() && (n==-1);i++){
	    if (hasA(PUNCT,w.substring(i,i+1))){
		n=i;
	    }
	}
	return n;
    }

    public static boolean hasA( String w, String letter ){

	for (int x=w.length()-1;x>=0;x--){
	    if (letter.equals(w.substring(x,x+1))){
		return true;
	    }
	}
	return false;
    }


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ){

	return hasA(VOWELS, letter);

    }



    public static int countVowels( String w ){
	int counter=0;
	for (int x=w.length()-1;x>=0;x--){
	    if (isAVowel(w.substring(x,x+1))){
		counter+=1;
	    }
	}
	return counter;


    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      =====================================*/
    public static boolean hasAVowel( String w ){
	if (countVowels(w)>0){
	    return true;
	}
	return false; 
    }



    public static String allVowels( String w ){
	String retStr="";
	for (int x=w.length()-1;x>=0;x--){
	    if (isAVowel(w.substring(x,x+1))){
		retStr+=w.substring(x,x+1);
	    }
	}
	return retStr;

    }


    /*=====================================
      String firstVowel(String) -- returns first vowel in a String
      pre:  w != null
      post: firstVowel("") --> ""
      firstVowel("zzz") --> ""
      firstVowel("meatball") --> "e"
      =====================================*/
    public static String firstVowel( String w ){
	String ans="";
	if (hasAVowel(w)){
	    ans=allVowels(w).substring(allVowels(w).length()-1);
	}
	return ans;

    }


    /*=====================================
      boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
      pre:  w != null and w.length() > 0
      post: beginsWithVowel("apple")  --> true
      beginsWithVowel("strong") --> false
      =====================================*/
    public static boolean beginsWithVowel( String w ) {
	return isAVowel(w.substring(0,1));

    }


    /*=====================================
      String engToPig(String) -- converts an English word to Pig Latin
      pre:  w.length() > 0
      post: engToPig("apple")  --> "appleway"
      engToPig("strong") --> "ongstray"
      engToPig("java")   --> "avajay"
      =====================================*/
    public static String engToPig( String w ){
	String retStr="";

	if (w.substring(0,1).equals("y")|| w.substring(0,1).equals("Y")){
	    retStr=w.substring(w.indexOf(firstVowel(w.substring(1)))) + w.substring(0,(w.indexOf(firstVowel(w.substring(1)))))+"ay";
	    return retStr;
	}


	else if (beginsWithVowel(w)){
	    retStr=w.substring(1)+w.substring(0,1)+"way";
	}
	else{
	    retStr=w.substring(w.indexOf(firstVowel(w))) + w.substring(0,(w.indexOf(firstVowel(w))))+"ay";
	}
	retStr=retStr.toLowerCase();
	for (int i=0;i<w.length();i++){

	    if (w.substring(i,i+1).equals(w.substring(i,i+1).toUpperCase())){
		retStr=retStr.substring(0,i)+ retStr.substring(i,i+1).toUpperCase()+retStr.substring(i+1);
	    }
	}
	return retStr;
    }

    public static String engToPigPar(String p){
	String retStr="";
	int i=punctIndex(p);
	while (i>=0){
	    if (i==0){
		retStr+=p.substring(i,i+1);
	    }
	    else{
		retStr+=engToPig(p.substring(0,i))+p.substring(i,i+1);
	    }
	    p=p.substring(i+1);
	    i=punctIndex(p);
	}
	if (p.length()>0){
	    retStr+=engToPig(p);
	}

	return retStr;
    }



    public static void main( String[] args ){

	String letter = "a";

	for( String w : args ) {
	    System.out.println( w + " has " + letter + "? " 
				+ hasA( w, letter ) );
	}   
	for( String w : args ) {
	    System.out.println( w +" index of punct = " 
				+ punctIndex( w));
	}   
	
	System.out.println();
	
	for( String w : args ) {
	    System.out.println( w +"->" 
				+ engToPig(w) );
	}
	for( String p : args ) {
	    System.out.println( p +"->" 
				+ engToPigPar(p) );
	}


    }

}//end class Pig

