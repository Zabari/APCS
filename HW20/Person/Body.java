// DANIEL ZABARI
// pd 9
// HW20
// 2013-10-31

public class Body{
    public String _body;
    private static String body1="   |\n --|--\n  / \\ \n /   \\ ";
    private static String body2="   |\n ==|==\n  / \\ \n /   \\ ";
    private static String body3="   |\n ++|++\n  / \\ \n /   \\ ";
    

    public Body(){
	int i=(int)(Math.random()*3);
	if (i==0){
	    _body=body1;
	}
	if (i==1){
	    _body=body2;
	}
	if (i==2){
	    _body=body3;
	}
    }
    public Body(int i){
	if (i==0){
	    _body=body1;
	}
	if (i==1){
	    _body=body2;
	}
	if (i==2){
	    _body=body3;
	}
    }
    
    public String setHair(String body) { 
	String oldBody = _body;
	_body = body;       
	return oldBody;
    }
    public String getBody(){
	return _body;
    }
    public String toString() {
	String ans = _body;
	return ans;
    }
}
