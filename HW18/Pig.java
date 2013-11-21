// DANIEL ZABARI
// pd 9
// HW18
// 2013-10-28

public class Pig {

    private static final String VOWELS = "aeiou";



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
	return allVowels(w).substring(0,1);

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
	String retStr;
	if (beginsWithVowel(w)){
		retStr=w.substring(1)+w.substring(0,1)+"way";
	    } else
	    {
		retStr=w.substring(1)+w.substring(0,1)+"ay";
	}
    


	
	return retStr;
    }


    public static void main( String[] args ){

	String letter = "a";

	for( String w : args ) {
	    System.out.println( w + " has " + letter + "? " 
				+ hasA( w, letter ) );
	}   
	
	System.out.println();
	
	for( String w : args ) {
	    System.out.println( w +"->" 
				+ engToPig(w) );
	}


    }

}//end class Pig

