public class Warrior{
    private String _name;
    private int _hp;
    private int _strength;
    private int _defense;
    private double _attack;
    private double _oldAttack=_attack;
    private int _oldDefense=_defense;

    public Warrior(String name){
	_name=name;
	_hp=125;
	_defense=50;
	_strength=40;
	_attack=0.4;
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
    public int attack(Monster e){
	e.lowerHP(((int)(_strength*_attack))-e.getDefense());
	return ((int)(_strength*_attack))-e.getDefense();
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
