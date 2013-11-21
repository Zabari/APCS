// DANIEL ZABARI
// pd 9
// HW15
// 2013-10-17
public class Stats{
    public static int mean(int a, int b){
	return ((a+b)/2);
    }
    public static double mean(double a, double b){
	return ((a+b)/2);
    }
    public static int max(int a, int b){
	return Math.max(a, b);
    }
    public static double max(double a, double b){
	return Math.max(a, b);
    }
    public static double max(double a, double b, double c){
	return Math.max(Math.max(a, b), c);
    }
    public static int geoMean(int a, int b){
	double x=a*1.0;
	double y=b*1.0;
	return (int) Math.sqrt(x*y);
    }
    public static double geoMean(double a, double b){
	return Math.sqrt(a*b);
    }
    public static double geoMean(double a, double b, double c){
	return Math.pow(a*b*c,1/3.);
    }
    public static int geoMean(int a, int b, int c){
	double x=(double) a;
	double y=(double) b;
	double z=(double) c;
	return (int) Math.pow(x*y*z,1/3.);
    }
    public static int gcd(int a, int b){
	int x=1;
	int n=1;
	while (x<=Math.min(a,b)){
	    if (a%x==0 && b%x==0){
		n=x;
		x+=1;
	    }else{
		x+=1;
		    }
	}
	return n;
    }
    public static int gcdew(int a, int b){
	int x;
	while (b>0){
	    if (a<b){
		x=a;
		a=b;
		b=x;
	    }
	    x=a-b;
	    a=b;
	    b=x;
	}
	return a;
    }
    public static int gcder(int a, int b){
	int x;
	if (a<b){
	x=a;
	a=b;
	b=x;
}	
	if (b<=0){
	    return a;
	}
	return gcder((a-b),b);
    }

}
