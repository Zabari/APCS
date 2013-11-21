// DANIEL ZABARI
// pd 9
// HW24
// 2013-11-14
public class Monster extends Character{

    public Monster(){
	_hp=150;
	_defense=20;
	_strength=((int)((Math.random()*45))+20);
	_attack=1;
    }
    public String about(){
	return "Monsters run and monsters fly, monsters yonder monsters nigh, Mage and Rogue they gobble up, on Warrior they like to sup.  If you see one then beware, make sure you don't stop and stare. Cause if you meet one eye to eye, why then, you will surely die.";
    }





}
