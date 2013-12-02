// DANIEL ZABARI
// pd 9
// HW35
// 2013-12-02
public class SearchTrials{
    public static void main (String[] args){
	Comparable[] iArr=new Comparable[1000000];
	for (int i=0; i<iArr.length;i++){
	    iArr[i]=i*2;
	}
	long start=System.currentTimeMillis();
	Searching.linSearch(iArr,999999);
	long end=System.currentTimeMillis();
	long time=end-start;
	System.out.println("Failed linear case is "+time+" milliseconds.");
	start=System.currentTimeMillis();
	BinSearch2.binSearch(iArr, 999999);
	end=System.currentTimeMillis();
	time=end-start;
	System.out.println("Failed binary case is "+time+" milliseconds.");
	start=System.currentTimeMillis();
	Searching.linSearch(iArr,9999998);
	end=System.currentTimeMillis();
	time=end-start;
	System.out.println("Successful linear case is "+time+" milliseconds.");
	start=System.currentTimeMillis();
	BinSearch2.binSearch(iArr,9999998);
	end=System.currentTimeMillis();
	time=end-start;
	System.out.println("Successful binary case is "+ time+" milliseconds.");



    }

}
