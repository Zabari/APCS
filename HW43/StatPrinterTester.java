import java.util.ArrayList;

public class StatPrinterTester {
	
	public static void main(String[] args) { 
	
	int[] x = new int[] {2,3,2,5,2,3};
	int[] y = new int[] {0,1,1,2,3,3,3,3,4,4,5,5,5,6,6,6,6,6};
	ArrayList<Integer> t = new ArrayList();
	ArrayList<Integer> t2 = new ArrayList();
	
	for (int ret:x)
		t.add(ret);
	
	for (int ret:y)
		t2.add(ret);
		
	System.out.println(t);
	System.out.println(t2);	
	
	StatPrinter test = new StatPrinter(t); // [0,0,3,2,0,1]
	StatPrinter test2 = new StatPrinter(t2); // [1,2,1,4,2,3,5]
	System.out.println(test._frequency);
	System.out.println(test2._frequency);
	System.out.println(test.max(test._frequency)); // return 3
	System.out.println(test2.max(test2._frequency)); // return 5
	System.out.println(test.isLocalMode(2)); // return true
	System.out.println(test.isLocalMode(4)); // return false
	System.out.println(test.isLocalMode(3)); // return false
	test2.printHistogram(10);
	
	}
}
