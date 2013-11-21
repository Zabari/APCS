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
    public static int geoMean(int a, int b){
	double x=a*1.0;
	double y=b*1.0;
	double z=Math.sqrt(x*y);
	return (int)z;
    }
    public static double geoMean(double a, double b){
	return Math.sqrt(a*b);
    }

}
