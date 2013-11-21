// DANIEL ZABARI
// pd 9
// HW24
// 2013-11-13
public class Warrior extends Character{
    private double _oldAttack=_attack;
    private int _oldDefense=_defense;

    public Warrior(String name){
	_name=name;
	_hp=125;
	_defense=100;
	_strength=40;
	_attack=0.4;
    }
 
    public String getName(){
	return _name;
    }

    public void specialize(){
	if (_oldDefense==_defense){
	    _oldDefense=_defense;
	    _oldAttack=_attack;
	}
	_defense-=10;
	_attack+=.2;
    }

    public void normalize(){
	if (!(_defense==_oldDefense)){
	    _defense=_oldDefense;
	    _attack=_oldAttack;
	}
    }
}

