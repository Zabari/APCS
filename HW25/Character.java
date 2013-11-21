// DANIEL ZABARI
// pd 9
// HW25
// 2013-11-14
public abstract class Character{
    protected String _name;
    protected int _hp;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    protected double _oldAttack=_attack;
    protected int _oldDefense=_defense;



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
    public boolean isAlive (){
	return _hp>0;
    }
    public int getDefense(){
	return _defense;
    }
    public String getName(){
	return _name;
    }
    public void lowerHP(int ouch){
	_hp-=ouch;
    }
    public int attack(Character e){
	int damage=((int)(_strength*_attack))-e.getDefense();
	if (damage <0){ damage=0;}
	e.lowerHP(damage);
	return damage;
    }
    public abstract String about();


}
