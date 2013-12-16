/*========================================
Another sample AP question. 1 of 4 free-response questions, 
for which you will have about 1hr45min.
Note that for today's work, you will have to implement a constructor 
and a main method yourself for testing...

The following class WordList is designed to store and manipulate a 
list of words. The incomplete class declaration is shown below. 
You will be asked to implement two methods.
========================================*/
import java.util.ArrayList;

public class WordList {

    public ArrayList<String> myList=new ArrayList<String>(); // contains Strings made up of letters

    public WordList(){
	myList.add("cat");
	myList.add("mouse");
	myList.add("frog");
	myList.add("dog");
	myList.add("dog");
    }
    //postcond: returns the number of words in this WordList that are 
    //          exactly len letters long
    public int numWordsOfLength(int len) { 
	int n=0;
	for (int i=myList.size()-1;i>=0;i--){
	    if (myList.get(i).length()==len)
		n++;
	}
	return n;
    }


    //postcond: all words that are exactly len letters long have been removed 
    //          from this WordList, with order of remaining words unchanged
    public void removeWordsOfLength(int len) { 
	for (int i=myList.size()-1;i>=0;i--){
	    if (myList.get(i).length()==len)
		myList.remove(i);
	}
    }

    public static void main(String[] args){
	
	/*
	String[] s1= {"cat", "mouse", "frog", "dog", "dog"};
	ArrayList<String> as1=new ArrayList<String>();
	for (String s:s1){
	    as1.add(s);
	}
	ArrayList<String> as2=as1;
	*/
	WordList as2=new WordList();



	System.out.println(as2.numWordsOfLength(4));            // 1
	System.out.println(as2.numWordsOfLength(3));            // 3
	System.out.println(as2.numWordsOfLength(2));            // 0





	as2.removeWordsOfLength(4);       //["cat", "mouse", "dog", "dog"]
	System.out.println(as2.myList);
	as2.removeWordsOfLength(3);       //["mouse"]
	System.out.println(as2.myList); 
	as2.removeWordsOfLength(2);       //["mouse"]
	System.out.println(as2.myList);
    }
}

	