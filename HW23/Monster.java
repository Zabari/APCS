public class Monster{
    private int _hp;
    private int _strength;
    private int _defense;
    private double _attack;

    public Monster(){
	_hp=150;
	_defense=20;
	_strength=((int)((Math.random()*45))+20);
	_attack=1;
    }

    public boolean isAlive (){
	return _hp>0;
    }
    public int getDefense(){
	return _defense;
    }
    public void lowerHP(int ouch){
	_hp-=ouch;
    }
    public int attack(Warrior e){
	e.lowerHP(((int)(_strength*_attack))-e.getDefense());
	return ((int)(_strength*_attack))-e.getDefense();
    }
   





}
