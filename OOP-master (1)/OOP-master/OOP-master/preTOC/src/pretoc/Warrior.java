/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretoc;

/**
 *
 * @author Desiree
 */
public class Warrior {
    
    private String uniqueName;
    private int entryFee;
    private int skillLevel;
    private String weapon;
    
    public Warrior(String uniqueName, int entryFee, int skillLevel, String weapon){
       this.uniqueName = uniqueName;
       this.entryFee = entryFee;
       this.weapon = weapon;
       
       this.skillLevel = entryFee / 100;
       }
    
    
    public int getEntryFee(){
           return entryFee;
       }
    
    public String getName(){
        return uniqueName;
    }
    
    public int getSkillLevel(){
        return skillLevel;
    }
    
    public String weapon(){
        return weapon;
    }
    
    public String toString(){
        return "UniqueName: " + uniqueName + "\n" +
                "EntryFee: " + entryFee + "\n" +
                "SkillLevel: " + skillLevel + "\n" +
                "weapon: " + weapon;
    }
    
}
