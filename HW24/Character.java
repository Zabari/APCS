// DANIEL ZABARI
// pd 9
// HW24
// 2013-11-13
public class Character{
    protected String _name;
    protected int _hp;
    protected int _strength;
    protected int _defense;
    protected double _attack;



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
}
