// DANIEL ZABARI
// pd 9
// HW24
// 2013-11-14
public class Rogue extends Character{

    public Rogue(String name){
	_name=name;
	_hp=125;
	_defense=100;
	_strength=30;
	_attack=0.3;
    }

    public String about(){
	return "The Rogue is often known a thief, with kings and peasants they've got beef.  They're quick to come and quick to go, where they'll be next you never know.  Skilled with dagger they must be, to locks they always have the key.";
    }

}
