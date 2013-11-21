// DANIEL ZABARI
// pd 9
// HW24
// 2013-11-14
public class Mage extends Character{

    public Mage(String name){
	_name=name;
	_hp=125;
	_defense=100;
	_strength=20;
	_attack=0.2;
    }

    public String about(){
	return "Abra-kadabra, Alakazam, the Mage, the bearded wizard man.  Witches, warlocks, healers too, all part of the good Mage crew.  Casting spells and using powers, they demolish armies within hours.";
    }

}
