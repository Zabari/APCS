// DANIEL ZABARI
// pd 9
// HW13
// 2013-10-15
public class Coin{
    private double value;
    private String upFace;
    private String name;
    public int flipCtr;
    public int headsCtr;
    public int tailsCtr;
    private double bias;

    public Coin (){
	reset("heads", .5);
    }
    public Coin (String nm){
	this();
	name = nm;
	assignValue();
    }
    public Coin (String nm, String face){
	this(nm);
	upFace=face;
    }
    public String flip(){
	if (Math.random()>=bias){
	    upFace="tails";
	    tailsCtr+=1;
	}else{
	    upFace="heads";
	    headsCtr+=1;
	}
	flipCtr+=1;
	return upFace;
    }
    public String toString(){
	String str=name+"--"+upFace;
	return str;
    }
    public boolean nameEquals(Coin nm){
	return upFace.equals(nm.upFace);
    }
    public double getVal(){
	return value;
    }
    public int getCtr(){
	return flipCtr;
    }
    public String getFace(){
	return upFace;
    }
    public void setName(String nm){
	name=nm;
	assignValue();
    }
    private void assignValue(){
	if (name.equals( "quarter" ))
	    value=0.25;
	if (name.equals("penny"))
	    value = 0.01;
	if (name.equals("nickel"))
		    value=0.05;
	if (name.equals("dollar"))
		    value=1.00;
	if (name.equals("half-dollar"))
		    value=0.50;
	if (name.equals("dime"))
		    value=0.10;

    }
    public void reset(String face,double b){
	name="penny";
	assignValue();
	upFace=face;
	tailsCtr=0;
	headsCtr=0;
	flipCtr=0;
	if (b>=0 && b<=1){
	    bias=b;
	}else {
	    bias =.5;
	}
    
    }    
}
