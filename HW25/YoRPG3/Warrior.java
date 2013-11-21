// DANIEL ZABARI
// pd 9
// HW24
// 2013-11-14
public class Warrior extends Character{


    public Warrior(String name){
	_name=name;
	_hp=125;
	_defense=100;
	_strength=40;
	_attack=0.4;
    }
 

    public String about(){
	return "Warriors are known to stalk the land, their trusty sword is held in hand.  No monster can stand in their path, not often do they take a bath. With every strike of bow or pike, they kill the monsters we don't like.";
    }
}

