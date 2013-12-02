// DANIEL ZABARI
// pd 9
// HW28
// 2013-11-20
public class Rational implements Comparable {
   public int _numer;
   public int _denomer;

    public Rational(){
	_numer=0;
	_denomer=1;
    }
    public Rational(int num, int den){
	if (!(den==0)){
	    _numer=num;
	    _denomer=den;
	} else {
	    _numer=0;
	    _denomer=1;
	}
    }
    public String toString(){
	return "Your number eez "+_numer+"/"+_denomer+" .";
    }
    public float floatValue(){
	return (float) _numer/_denomer;
    }
    public void multiply(Rational num){
	this._numer*=num._numer;
	this._denomer*=num._denomer;
    }
    public void divide(Rational num){
	this._numer*=num._denomer;
	this._denomer*=num._numer;
    }
    public void add(Rational num){
	this._numer=this._numer*num._denomer+num._numer*this._denomer;
	this._denomer*=num._denomer;
    }
    public void subtract(Rational num){
	this._numer=this._numer*num._denomer-num._numer*this._denomer;
	this._denomer*=num._denomer;
    }
    public static int gcd(int a, int b){
	int x=a;
	a=Math.max(a,b);
	b=Math.min(x,b);
	while (b>0){
	    x=a-b;
	    a=Math.max(x,b);
	    b=Math.min(x,b);
	}
	return a;
    }
    public int gcd(){
	return gcd(this._numer,this._denomer);
    }
    public void reduce(){
	int x=gcd();
	this._numer/=x;
	this._denomer/=x;
    }
    public int compareTo(Object o){
	Rational num=(Rational) o;
	int x=this._numer*num._denomer;
	int y=this._denomer*num._numer;
	return (x>y)? 1:(x<y)?-1:0;
    }
    public boolean equals(Rational num){
	return this.compareTo(num)==0;
    }

    public static void main(String[] args){
	Rational num1=new Rational(2,3);
	Rational numy=new Rational(4,6);
	Rational num2=new Rational(2,2);
	System.out.println(numy);
	System.out.println(numy.floatValue());
	numy.multiply(num2);
	System.out.println(numy);
	numy.divide(num2);
	System.out.println(numy);
	numy.add(num2);
	System.out.println(numy);
	numy.subtract(num2);
	System.out.println(numy);
	System.out.println(numy.gcd());
	numy.reduce();
	System.out.println(numy);
	System.out.println(gcd(4,2));
	numy.divide(num2);
	System.out.println(numy.compareTo(num2));
	System.out.println(numy.compareTo(num1));
	System.out.println(numy.equals(num1));


    }



}


