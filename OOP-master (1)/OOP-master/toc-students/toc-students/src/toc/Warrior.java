/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toc;

/**
 *
 * @author Desiree
 */
public class Warrior extends Champion{
    
    private String weapon;
    
    public Warrior(String name, int fee, int level, String weapon){
        super(name,fee,level);
        this.weapon = weapon;
        super.setSkillLevel(fee/100);
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public void setWeapon(String newWeapon){
        weapon = newWeapon;
    }
    
    public String toString(){
        return super.toString() +
                "Weapon: " + weapon;
    }
    
}

