// DANIEL ZABARI
// pd 9
// HW10
// 2013-10-03
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
	return Math.pow(a*b*c,1/3);
    }
    public static int geoMean(int a, int b, int c){
	double x=(double) a;
	double y=(double) b;
	double z=(double) c;
	return (int) Math.pow(x*y*z,1/3);
    }
}
