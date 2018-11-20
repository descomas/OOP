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
public class Dragon {
    public class Wizard {
   
    private String uniqueName;
    private int entryFee;
    private int skillLevel;
    private boolean canTalk;

    
    public Wizard(String uniqueName, boolean canTalk){
       this.uniqueName = uniqueName;
       this.canTalk = canTalk;
       this.skillLevel = 7;
       this.entryFee = 500;
       
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
    
    // Used in other method that calls this to check if true can enter
    //mystery
    public boolean canDangonTalk(){
        return canTalk;
    }
 
     public String toString(){
        return "UniqueName: " + uniqueName + "\n" +
                "EntryFee: " + entryFee + "\n" +
                "SkillLevel: " + skillLevel + "\n" +
                "can talk: " + canTalk + "\n";
    }
    
    }
}
